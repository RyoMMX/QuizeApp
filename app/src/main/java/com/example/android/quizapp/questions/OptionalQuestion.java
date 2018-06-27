package com.example.android.quizapp.questions;

import java.util.Arrays;

/**
 * Created by muhammad on 10/2/2017.
 */

public abstract class OptionalQuestion extends Question {
    private String[] options;

    OptionalQuestion() {

    }

    OptionalQuestion(String question) {
        super(question);
    }

    OptionalQuestion(String question, String[] options) {
        super(question);
        this.options = Arrays.copyOf(options, options.length);
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = Arrays.copyOf(options, options.length);
    }
}