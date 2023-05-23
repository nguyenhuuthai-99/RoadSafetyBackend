package com.mycompany.backendapplication;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "quiz")
public class Quiz implements Serializable {

    @Serial
    private static final long serialVersionUID = -5636159804005731282L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int quizID;
    @OneToMany
    @JoinColumn(name = "quizQuestionId")
    private List<QuizQuestion> quizQuestionList = new java.util.ArrayList<>();

    public Quiz(List<QuizQuestion> quizQuestionList) {
        this.quizQuestionList = quizQuestionList;
    }

    public Quiz() {

    }
    public List<QuizQuestion> getQuizQuestionList() {
        return quizQuestionList;
    }

    public void setQuizQuestionList(List<QuizQuestion> quizQuestionList) {
        this.quizQuestionList = quizQuestionList;
    }




    public int getQuizID() {
        return quizID;
    }

    public void setQuizID(int quizID) {
        this.quizID = quizID;
    }


}
