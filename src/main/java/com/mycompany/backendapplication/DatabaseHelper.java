/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.backendapplication;

import javax.persistence.*;

/**
 *
 * @author thainguyen
 */
public class DatabaseHelper {

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    private EntityTransaction entityTransaction;

    public DatabaseHelper() {
        entityManagerFactory = Persistence.createEntityManagerFactory("rydaPU");
        entityManager = entityManagerFactory.createEntityManager();
        entityTransaction = entityManager.getTransaction();
    }

    public void login(User user){

    }

    public void register(User user){

    }

    public void addDocument(Document document){

        entityTransaction.begin();

        entityManager.persist(document);

        entityTransaction.commit();

    }

    public void addQuiz(Quiz quiz){

        entityTransaction.begin();

        entityManager.persist(quiz);

        entityTransaction.commit();
    }

    public void addQuestion(QuizQuestion quizQuestion){
        entityTransaction.begin();

        entityManager.persist(quizQuestion);

        entityTransaction.commit();
    }

    public void  addSurvey(Survey survey){
        entityTransaction.begin();

        entityManager.persist(survey);

        entityTransaction.commit();
    }

    public Document viewDocument(int id){
        Document document = new Document();

        entityTransaction.begin();

        TypedQuery<Document> query = entityManager.createNamedQuery("Document.findByDocumentId", Document.class);
        query.setParameter("documentId", id);

        document = query.getSingleResult();

        entityTransaction.commit();

        return document;
    }

    public Quiz viewQuiz(int id){
        entityTransaction.begin();

        TypedQuery<Quiz> query = entityManager.createNamedQuery("Quiz.findByQuizID", Quiz.class);
        query.setParameter("quizID", id);

        Quiz quiz = query.getSingleResult();

        entityTransaction.commit();

        return quiz;
    }

    public Survey viewSurvey(int id){
        entityTransaction.begin();

        TypedQuery<Survey> query = entityManager.createNamedQuery("Survey.findBySurveyId", Survey.class);
        query.setParameter("surveyId", id);

        Survey survey = query.getSingleResult();

        entityTransaction.commit();

        return survey;
    }

    private String encryptPassword(){

        return "";
    }

    private String decryptPassword(){
        return "";
    }
    
}
