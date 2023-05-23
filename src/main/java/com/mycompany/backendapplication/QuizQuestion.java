package com.mycompany.backendapplication;

import java.util.HashMap;
import javax.persistence.*;

@Entity
@Table(name= "quizQuestion")
public class QuizQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int quizQuestionId;
    private String question;
    private HashMap<String, Boolean> answers;

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

    public HashMap<String, Boolean> getAnswers() {
        return answers;
    }

    public void setAnswers(HashMap<String, Boolean> answers) {
        this.answers = answers;
    }
}
