package com.example.android.quizapp.questions;

/**
 * Created by muhammad on 10/2/2017.
 */

public class RadioButtonQuestion extends OptionalQuestion {
    private int answer;
    private int userAnswer;

    public RadioButtonQuestion() {
    }

    public RadioButtonQuestion(String question){
        super(question);
    }

    public RadioButtonQuestion(String question, int answer) {
        super(question);
        this.answer = answer;
    }

    public RadioButtonQuestion(String question, int answer, String[] options) {
        super(question, options);
        this.answer = answer;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public int getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(int userAnswer) {
        this.userAnswer = userAnswer;
    }

    @Override
    public boolean getResult() {

        return answer == userAnswer && isAnswered();
    }
}
