package com.mycompany.backendapplication;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name= "customer")
public class Customer extends User{
    private List<Integer> quizzesCompleted;

    public Customer() {
    }

    public List<Integer> getQuizzesCompleted() {
        return quizzesCompleted;
    }

    public void setQuizzesCompleted(List<Integer> quizzesCompleted) {
        this.quizzesCompleted = quizzesCompleted;
    }
}
