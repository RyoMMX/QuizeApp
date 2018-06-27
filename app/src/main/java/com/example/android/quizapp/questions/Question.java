package com.example.android.quizapp.questions;

/**
 * Created by muhammad on 10/2/2017.
 */

public abstract class Question {
    private String question;

    private boolean isAnswered = true;

    public Question() {
    }

    public Question(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public boolean isAnswered() {
        return isAnswered;
    }

    public void setAnswered(boolean answered) {
        isAnswered = answered;
    }

    public abstract boolean getResult();
}
