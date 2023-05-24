//package com.mycompany.backendapplication;
//
//import java.util.List;
//import javax.persistence.*;
//
//@Entity
//@Table(name= "customer")
//public class Customer extends User{
//    @JoinColumn(name = "quizId")
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
//    private List<Integer> quizzesCompleted;
//
//    public Customer() {
//    }
//
//    public List<Quiz> getQuizzesCompleted() {
//        return quizzesCompleted;
//    }
//
//    public void setQuizzesCompleted(List<Quiz> quizzesCompleted) {
//        this.quizzesCompleted = quizzesCompleted;
//    }
//}
