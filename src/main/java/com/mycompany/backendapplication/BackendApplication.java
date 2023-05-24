/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.backendapplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author thainguyen
 */
public class BackendApplication {

    private static DatabaseHelper databaseHelper;

    public static void main(String[] args) {
        System.out.println("Hello World!");
        databaseHelper = new DatabaseHelper();

//        addDocument();

//        addQuiz();

//        addSurvey();

        //viewDocument(2);

        viewQuiz(51);

        viewSurvey(1);

    }

    private static void login(){

    }

    private static void register(){

    }

    private static void addDocument(){
        // Add document
        Document document = new Document();
        document.setTitle("example Title");
        document.setContent("example content");

        databaseHelper.addDocument(document);
    }

    private static void addQuiz(){
        // Add Quiz
        QuizQuestion question1 = new QuizQuestion();
        question1.setQuestion("question 1");
        List<Answer> answers = new ArrayList<>();
        answers.add(new Answer("answer 1", false, question1));
        answers.add(new Answer("answer 2", true, question1));
        answers.add(new Answer("answer 3", false, question1));
        question1.setAnswers(answers);

        QuizQuestion question2 = new QuizQuestion();
        question2.setQuestion("question 2");
        List<Answer> answers2 = new ArrayList<>();
        answers2.add(new Answer("answer 4", false, question2));
        answers2.add(new Answer("answer 5", true, question2));
        answers2.add(new Answer("answer 6", false, question2));
        question2.setAnswers(answers2);

        List<QuizQuestion> quizQuestions = new ArrayList<>();
        quizQuestions.add(question1);
        quizQuestions.add(question2);

        Quiz quiz = new Quiz();

        question1.setQuiz(quiz);
        question2.setQuiz(quiz);
        quiz.setQuizQuestionList(quizQuestions);

        databaseHelper.addQuiz(quiz);
    }

    private static void  addSurvey(){
        //Add Survey
        Survey survey = new Survey();
        survey.setTitle("Example title");

        SurveyQuestion surveyQuestion1 = new SurveyQuestion();
        surveyQuestion1.setQuestion("survey question 1");
        List<String> selections =new ArrayList<>();
        selections.add("selection 1");
        selections.add("selection 2");
        selections.add("selection 3");
        surveyQuestion1.setSelection(selections);
        SurveyQuestion surveyQuestion2 = new SurveyQuestion();
        surveyQuestion2.setQuestion("survey question 2");
        List<String> selections2 =new ArrayList<>();
        selections2.add("selection 1");
        selections2.add("selection 2");
        selections2.add("selection 3");
        surveyQuestion2.setSelection(selections2);

        List<SurveyQuestion> surveyQuestions = new ArrayList<>();
        surveyQuestions.add(surveyQuestion1);
        surveyQuestions.add(surveyQuestion2);

        survey.setSurveyQuestionList(surveyQuestions);

        surveyQuestion1.setSurvey(survey);
        surveyQuestion2.setSurvey(survey);

        databaseHelper.addSurvey(survey);
    }

    private static void viewDocument(int id){
        Document document = databaseHelper.viewDocument(id);
        System.out.println("title: " + document.getTitle()+
                "\ncontent:"+ document.getContent());
    }

    private static void viewQuiz(int id){
        Quiz quiz = databaseHelper.viewQuiz(id);
        System.out.println(quiz.getQuizQuestionList().get(0).getQuestion());
    }

    private static void viewSurvey(int id){
        Survey survey = databaseHelper.viewSurvey(id);
        System.out.println("title: "+ survey.getTitle());
        int count = 0;
        for(SurveyQuestion question: survey.getSurveyQuestionList()){
            count +=1;
            System.out.println("question " + count+
                    ": "+ question.getQuestion());
            for (int i = 0; i < question.getSelection().size(); i++) {
                System.out.println("selection " +(i+1)+": "+
                        question.getSelection().get(i));

            }
        }
    }


}
