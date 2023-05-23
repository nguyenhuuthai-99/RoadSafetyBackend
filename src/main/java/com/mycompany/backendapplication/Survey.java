package com.mycompany.backendapplication;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name= "survey")
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int surveyId;
    private String title;
    @OneToMany
    @JoinColumn(name = "serveyQuestionId")
    private List<SurveyQuestion> surveyQuestionList = new java.util.ArrayList<>();

    public Survey(List<SurveyQuestion> surveyQuestionList) {
        this.surveyQuestionList = surveyQuestionList;
    }

    public Survey() {

    }

    public int getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(int surveyId) {
        this.surveyId = surveyId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<SurveyQuestion> getSurveyQuestionList() {
        return surveyQuestionList;
    }

    public void setSurveyQuestionList(List<SurveyQuestion> surveyQuestionList) {
        this.surveyQuestionList = surveyQuestionList;
    }
}
