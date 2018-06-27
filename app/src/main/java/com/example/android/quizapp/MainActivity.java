package com.example.android.quizapp;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.quizapp.questions.CheckBoxQuestion;
import com.example.android.quizapp.questions.EditTextQuestion;
import com.example.android.quizapp.questions.Question;
import com.example.android.quizapp.questions.RadioButtonQuestion;

import java.util.ArrayList;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Question> questions = new ArrayList<Question>();
    private Question question;
    private ListIterator listIterator;
    private Button start;
    private TextView next;
    private TextView questionTextView;
    private LinearLayout checkBoxLayout;
    private CheckBox firstOptionCheckBox;
    private CheckBox secondOptionCheckBox;
    private CheckBox thirdOptionCheckBox;
    private CheckBox forthOptionCheckBox;
    private RadioGroup radioLayout;
    private RadioButton firstOptionRadioButton;
    private RadioButton secondOptionRadioButton;
    private RadioButton thirdOptionRadioButton;
    private RadioButton forthOptionRadioButton;
    private LinearLayout editTextLayout;
    private EditText answerEdittext;
    private ConstraintLayout headerLayout;
    private ConstraintLayout startLayout;
    private TextView feedback;
    private TextView resultTextView;
    private ConstraintLayout resultLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        declareVariables();

        setQuestions();
    }

    private void setQuestions() {
        String questionText;
        String answerText = "";
        String options[];
        int answerInteger = 0;
        boolean answerArrayBoolean[];


        questionText = "Which of the following is the functionality of ‘Data Abstraction’?";
        answerInteger = 0;
        options = new String[4];
        options[0] = "Reduce Complexity";
        options[1] = "Binds together code and data";
        options[2] = "Parallelism";
        options[3] = "None of the mentioned";
        questions.add(new RadioButtonQuestion(questionText, answerInteger, options));


        questionText = "class defines .. (more than one)";
        answerArrayBoolean = new boolean[4];
        answerArrayBoolean[0] = false;
        answerArrayBoolean[1] = true;
        answerArrayBoolean[2] = false;
        answerArrayBoolean[3] = true;
        options[0] = "a) values";
        options[1] = "b) behavior";
        options[2] = "c) apples";
        options[3] = "d) attributes";
        questions.add(new CheckBoxQuestion(questionText, answerArrayBoolean, options));

        questionText = "__________is a form of software reusability in which new classes acquire the members of existing classes and embellish those classes with new capabilities.";
        answerText = "Inheritance";
        questions.add(new EditTextQuestion(questionText, answerText));

        //        +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        questionText = "Which of the these is the functionality of ‘Encapsulation’?";
        answerInteger = 0;
        options = new String[4];
        options[0] = "a) Binds together code and data";
        options[1] = "b) Using single interface for general class of actions.";
        options[2] = "c) Reduce Complexity";
        options[3] = "d) All of the mentioned";
        questions.add(new RadioButtonQuestion(questionText, answerInteger, options));


        questionText = "which one of the following is true .. (more than one)";
        answerArrayBoolean = new boolean[4];
        answerArrayBoolean[0] = true;
        answerArrayBoolean[1] = false;
        answerArrayBoolean[2] = true;
        answerArrayBoolean[3] = false;
        options[0] = "a) Superclass constructors are not inherited by subclasses.";
        options[1] = "b) A “has-a” relationship is implemented via inheritance.";
        options[2] = "c) It is possible to treat superclass objects and subclass objects similarly.";
        options[3] = "d) A Car class has an “is a” relationship with its SteeringWheel and Brakes.";
        questions.add(new CheckBoxQuestion(questionText, answerArrayBoolean, options));

        questionText = "A superclass’s _________ members are accessible anywhere that the program has a reference to an object of that superclass or to an object of one of its subclasses.";
        answerText = "public";
        questions.add(new EditTextQuestion(questionText, answerText));

//        +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        questionText = "Which of the following is the functionality of ‘Data Abstraction’?";
        answerInteger = 0;
        options = new String[4];
        options[0] = "Reduce Complexity";
        options[1] = "Binds together code and data";
        options[2] = "Parallelism";
        options[3] = "None of the mentioned";
        questions.add(new RadioButtonQuestion(questionText, answerInteger, options));


        questionText = "which one of the following is true .. (more than one)";
        answerArrayBoolean = new boolean[4];
        answerArrayBoolean[0] = false;
        answerArrayBoolean[1] = true;
        answerArrayBoolean[2] = false;
        answerArrayBoolean[3] = true;
        options[0] = "a) All methods in an abstract superclass must be declared as abstract methods.";
        options[1] = "b) Referring to a subclass object with a superclass reference is dangerous.";
        options[2] = "c) A class is made abstract by declaring that class abstract.";
        options[3] = "d) Inner classes are not allowed to access the members of the enclosing class.\n";
        questions.add(new CheckBoxQuestion(questionText, answerArrayBoolean, options));

        questionText = "The use of constructor is";
        answerInteger = 0;
        options = new String[4];
        options[0] = "A.to initilize the objects of its class";
        options[1] = "B.to allocate memory for the objects of its class";
        options[2] = "C.both (a) and (b)";
        options[3] = "D.none of these";
        questions.add(new RadioButtonQuestion(questionText, answerInteger, options));


        listIterator = questions.listIterator();
    }

    private void declareVariables() {
        start = (Button) findViewById(R.id.start);
        next = (TextView) findViewById(R.id.next);
        questionTextView = (TextView) findViewById(R.id.question_text_view);
        checkBoxLayout = (LinearLayout) findViewById(R.id.check_box_layout);
        firstOptionCheckBox = (CheckBox) findViewById(R.id.first_option_checkBox);
        secondOptionCheckBox = (CheckBox) findViewById(R.id.second_option_checkBox);
        thirdOptionCheckBox = (CheckBox) findViewById(R.id.third_option_checkBox);
        forthOptionCheckBox = (CheckBox) findViewById(R.id.forth_option_checkBox);
        radioLayout = (RadioGroup) findViewById(R.id.radio_layout);
        firstOptionRadioButton = (RadioButton) findViewById(R.id.first_option_radio_button);
        secondOptionRadioButton = (RadioButton) findViewById(R.id.second_option_radio_button);
        thirdOptionRadioButton = (RadioButton) findViewById(R.id.third_option_radio_button);
        forthOptionRadioButton = (RadioButton) findViewById(R.id.forth_option_radio_button);
        editTextLayout = (LinearLayout) findViewById(R.id.edit_text_layout);
        answerEdittext = (EditText) findViewById(R.id.answer_edit_text);
        headerLayout = (ConstraintLayout) findViewById(R.id.header_layout);
        startLayout = (ConstraintLayout) findViewById(R.id.start_layout);
        resultTextView = (TextView) findViewById(R.id.result_textView);
        resultLayout = (ConstraintLayout) findViewById(R.id.result_layout);
    }

    public void start(View view) {
        startLayout.setVisibility(View.GONE);
        headerLayout.setVisibility(View.VISIBLE);
        questionTextView.setVisibility(View.VISIBLE);
        next(view);
    }

    public void next(View view) {
        if (listIterator.hasPrevious())
            setAnswer();
        rest();
        if (listIterator.hasNext()) {
            question = (Question) listIterator.next();
            questionTextView.setText(question.getQuestion().toString());

            if (question instanceof EditTextQuestion) {
                showEditTextQuestion();
            } else if (question instanceof RadioButtonQuestion) {
                setOptionsRadioButton();
                showRadioButtonQuestion();
            } else if (question instanceof CheckBoxQuestion) {
                setOptionsCheckBox();
                showCheckBoxQuestion();
            }
        } else {
            showFeedback();
        }
    }

    private void showFeedback() {
        String answer = "";
        int right = 0;
        int numQuestions = 0;

        for (int i = 0; i < questions.size(); i++) {
            answer += "<p>";

            answer += "<span style=\"color:#1B5E20;\">";
            answer += questions.get(i).getQuestion();
            answer += "</span>";

            answer += "<p style=\"color:#E65100;\">";
            answer += "<b>";
            answer += "your result is :- " + questions.get(i).getResult();
            answer += "</b>";
            answer += "</p>";
            answer += "</p>";
            answer += "<hr/>";
            if (questions.get(i).getResult()) {
                right++;
            }
            numQuestions++;
        }
        resultTextView = (TextView) findViewById(R.id.result_textView);
        resultTextView.setText(right + "/" + numQuestions + "  ");
        Toast.makeText(this, "Result : " + right + "/" + numQuestions, Toast.LENGTH_SHORT).show();

        feedback = (TextView) findViewById(R.id.feedback);
        feedback.setText(Html.fromHtml(answer));

        resultLayout.setVisibility(View.VISIBLE);
        feedback.setVisibility(View.VISIBLE);
        headerLayout.setVisibility(View.GONE);
        radioLayout.setVisibility(View.GONE);
        editTextLayout.setVisibility(View.GONE);
        checkBoxLayout.setVisibility(View.GONE);
        questionTextView.setVisibility(View.GONE);
    }

    private void setAnswer() {
        if (question instanceof EditTextQuestion) {
            EditTextQuestion editTextQuestion = (EditTextQuestion) question;
            editTextQuestion.setUserAnswer(answerEdittext.getText().toString());
            Log.e("hello", editTextQuestion.getUserAnswer().isEmpty() + "");
        } else if (question instanceof RadioButtonQuestion) {
            RadioButtonQuestion radioButtonQuestion = (RadioButtonQuestion) question;
            int raidioAnswer = 0;
            if (secondOptionRadioButton.isChecked())
                raidioAnswer = 1;
            else if (thirdOptionRadioButton.isChecked())
                raidioAnswer = 2;
            else if (forthOptionRadioButton.isChecked())
                raidioAnswer = 3;
            else
                question.setAnswered(false);

            radioButtonQuestion.setUserAnswer(raidioAnswer);
        } else if (question instanceof CheckBoxQuestion) {
            CheckBoxQuestion checkBoxQuestion = (CheckBoxQuestion) question;
            boolean[] checkBoxAnswer = new boolean[4];
            if (firstOptionCheckBox.isChecked()) {
                checkBoxAnswer[0] = true;
            }
            if (secondOptionCheckBox.isChecked()) {
                checkBoxAnswer[1] = true;
            }
            if (thirdOptionCheckBox.isChecked()) {
                checkBoxAnswer[2] = true;
            }
            if (forthOptionCheckBox.isChecked()) {
                checkBoxAnswer[3] = true;
            } else
                question.setAnswered(false);

            checkBoxQuestion.setUserAnswer(checkBoxAnswer);
        }
    }

    private void rest() {
        firstOptionCheckBox.setChecked(false);
        secondOptionCheckBox.setChecked(false);
        thirdOptionCheckBox.setChecked(false);
        forthOptionCheckBox.setChecked(false);
        firstOptionRadioButton.setChecked(false);
        secondOptionRadioButton.setChecked(false);
        thirdOptionRadioButton.setChecked(false);
        forthOptionRadioButton.setChecked(false);
    }

    private void setOptionsRadioButton() {
        RadioButtonQuestion radioButtonQuestion = (RadioButtonQuestion) question;

        firstOptionRadioButton.setText(radioButtonQuestion.getOptions()[0]);
        secondOptionRadioButton.setText(radioButtonQuestion.getOptions()[1]);
        thirdOptionRadioButton.setText(radioButtonQuestion.getOptions()[2]);
        forthOptionRadioButton.setText(radioButtonQuestion.getOptions()[3]);
    }

    private void setOptionsCheckBox() {
        CheckBoxQuestion checkBoxQuestion = (CheckBoxQuestion) question;
        firstOptionCheckBox.setText(checkBoxQuestion.getOptions()[0]);
        secondOptionCheckBox.setText(checkBoxQuestion.getOptions()[1]);
        thirdOptionCheckBox.setText(checkBoxQuestion.getOptions()[2]);
        forthOptionCheckBox.setText(checkBoxQuestion.getOptions()[3]);
    }

    private void showEditTextQuestion() {
        editTextLayout.setVisibility(View.VISIBLE);
        radioLayout.setVisibility(View.GONE);
        checkBoxLayout.setVisibility(View.GONE);
    }

    private void showRadioButtonQuestion() {
        editTextLayout.setVisibility(View.GONE);
        radioLayout.setVisibility(View.VISIBLE);
        checkBoxLayout.setVisibility(View.GONE);
    }

    private void showCheckBoxQuestion() {
        editTextLayout.setVisibility(View.GONE);
        radioLayout.setVisibility(View.GONE);
        checkBoxLayout.setVisibility(View.VISIBLE);
    }
}