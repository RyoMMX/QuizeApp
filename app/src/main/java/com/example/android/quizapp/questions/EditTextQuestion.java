package com.example.android.quizapp.questions;

/**
 * Created by muhammad on 10/2/2017.
 */

public class EditTextQuestion extends Question {
    private String answer = "";
    private String userAnswer = "";

    public EditTextQuestion() {
    }

    public EditTextQuestion( String question, String answer) {
        super(question);
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    @Override
    public boolean getResult() {

        return getAnswer().equalsIgnoreCase(getUserAnswer()) && isAnswered();
    }
}