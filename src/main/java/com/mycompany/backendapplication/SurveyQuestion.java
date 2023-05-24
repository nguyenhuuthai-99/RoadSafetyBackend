package com.mycompany.backendapplication;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name= "surveyQuestion")
public class SurveyQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int surveyQuestionId;
    private String question;
    @ElementCollection
    private List<String> selection;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "surveyId")
    private Survey survey;

    public SurveyQuestion() {
    }

    public int getSurveyQuestionId() {
        return surveyQuestionId;
    }

    public void setSurveyQuestionId(int surveyQuestionId) {
        this.surveyQuestionId = surveyQuestionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getSelection() {
        return selection;
    }

    public void setSelection(List<String> selection) {
        this.selection = selection;
    }

    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }
}
