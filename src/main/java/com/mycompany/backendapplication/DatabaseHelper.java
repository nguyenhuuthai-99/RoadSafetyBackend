/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.backendapplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author thainguyen
 */
public class DatabaseHelper {

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public DatabaseHelper() {
        entityManagerFactory = Persistence.createEntityManagerFactory("");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public void addDocument(){

    }

    public void addQuiz(){

    }

    public void  addSurvey(){

    }

    public void viewDocument(){

    }

    public void viewQuiz(){

    }

    public void viewSurvey(){

    }
    
    
}
