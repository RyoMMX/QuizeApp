package com.example.android.quizapp.questions;

import java.util.Arrays;

/**
 * Created by muhammad on 10/2/2017.
 */

public class CheckBoxQuestion extends OptionalQuestion {
    private boolean[] answer;
    private boolean[] userAnswer;

    public CheckBoxQuestion(String question) {
        super(question);
    }

    public CheckBoxQuestion(String question, boolean[] answer) {
        super(question);
        this.answer = answer;
    }

    public CheckBoxQuestion(String question, boolean[] answer, String[] options) {
        super(question, options);
        this.answer = Arrays.copyOf(answer, answer.length);
    }

    public boolean[] getAnswer() {
        return answer;
    }

    public void setAnswer(boolean[] answer) {
        this.answer = Arrays.copyOf(answer, answer.length);
    }

    public boolean[] getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(boolean[] userAnswer) {
        this.userAnswer = Arrays.copyOf(userAnswer, userAnswer.length);
    }

    @Override
    public boolean getResult() {

        for(int i = 0 ; i < answer.length; i++){
            if(answer[i] != userAnswer[i])
                return isAnswered();
        }
        return isAnswered();
    }
}
