package com.mycompany.backendapplication;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "quiz")
@NamedQueries({
        @NamedQuery(name = "Quiz.findByQuizID", query = "select q from Quiz q where q.quizID = :quizID"),
        @NamedQuery(name = "Quiz.findAll", query = "select q from Quiz q")
})
public class Quiz implements Serializable {

    @Serial
    private static final long serialVersionUID = -5636159804005731282L;
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int quizID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "quiz")
    @JoinColumn(name = "quizId", referencedColumnName = "quizId")
    private List<QuizQuestion> quizQuestionList;
//    @ManyToOne(cascade = CascadeType.ALL)
//    private Customer customer;

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
