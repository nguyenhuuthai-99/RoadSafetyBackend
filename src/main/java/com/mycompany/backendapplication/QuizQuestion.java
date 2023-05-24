package com.mycompany.backendapplication;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.*;

@Entity
@Table(name= "quizQuestion")
public class QuizQuestion implements Serializable {

    @Serial
    private static final long serialVersionUID = 2826720085176854944L;
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int quizQuestionId;
    private String question;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "quizQuestion")
    private List<Answer> answers;
    @ManyToOne(cascade = CascadeType.ALL)
    private Quiz quiz;

    public QuizQuestion(String question, Quiz quiz) {
        this.question = question;
        this.quiz = quiz;
    }

    public QuizQuestion() {
    }

    public int getQuizQuestionId() {
        return quizQuestionId;
    }

    public void setQuizQuestionId(int quizQuestionId) {
        this.quizQuestionId = quizQuestionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }
}
