package com.mycompany.backendapplication;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "survey")
@NamedQueries({
        @NamedQuery(name = "Survey.findBySurveyId", query = "select s from Survey s where s.surveyId = :surveyId"),
        @NamedQuery(name = "Survey.findAll", query = "select s from Survey s")
})
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int surveyId;
    private String title;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "survey")
    @JoinColumn(name = "surveyQuestionId")
    private List<SurveyQuestion> surveyQuestionList;

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
