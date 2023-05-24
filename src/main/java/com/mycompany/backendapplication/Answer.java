package com.mycompany.backendapplication;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "answer")
public class Answer implements Serializable {

    @Serial
    private static final long serialVersionUID = 1608789196758739374L;
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int answerId;
    private String answer;
    private boolean isCorrect;
    @ManyToOne(cascade = CascadeType.ALL)
    private QuizQuestion quizQuestion;

    public Answer() {
    }

    public Answer(String answer, boolean isCorrect, QuizQuestion quizQuestion) {
        this.answer = answer;
        this.isCorrect = isCorrect;
        this.quizQuestion = quizQuestion;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public QuizQuestion getQuizQuestion() {
        return quizQuestion;
    }

    public void setQuizQuestion(QuizQuestion quizQuestion) {
        this.quizQuestion = quizQuestion;
    }
}
