package com.example.android.quiz;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RadioGroup rg1 = findViewById(R.id.group1);

        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.oneA:
                        Toast.makeText(getBaseContext(), "It's absolutely normal", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.oneB:
                        Toast.makeText(getBaseContext(), "Lucky you", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.oneC:
                        Toast.makeText(getBaseContext(), "Children can eat anything they can fit into the mouth", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        RadioGroup rg2 = findViewById(R.id.group2);

        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.twoA:
                        Toast.makeText(getBaseContext(), "WOW, how it's possible?", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.twoB:
                        Toast.makeText(getBaseContext(), "Yes...that's great fun...", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.twoC:
                        Toast.makeText(getBaseContext(), "Ecological reasons?", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        RadioGroup rg3 = findViewById(R.id.group3);

        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.threeA:
                        Toast.makeText(getBaseContext(), "Consider writing a guide for parents!", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.threeB:
                        Toast.makeText(getBaseContext(), "I envy you", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.threeC:
                        Toast.makeText(getBaseContext(), "She/he is wrong... definitely...", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        RadioGroup rg4 = findViewById(R.id.group4);

        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.fourA:
                        Toast.makeText(getBaseContext(), "You must be in perfect shape", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.fourB:
                        Toast.makeText(getBaseContext(), "Parent are always exhausted...in most cases", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.fourC:
                        Toast.makeText(getBaseContext(), "Yeah...", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        RadioGroup rg5 = findViewById(R.id.group5);

        rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.fiveA:
                        Toast.makeText(getBaseContext(), "Do you really have a child?", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.fiveB:
                        Toast.makeText(getBaseContext(), "Ufff... I'm not the only one", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.fiveC:
                        Toast.makeText(getBaseContext(), "Are you a hipnotist?", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

    }

    public void buttonOK(View view) {

        EditText inputName = findViewById(R.id.input_name);
        String name = inputName.getText().toString();

        //disable EditText after name entered

        inputName.setEnabled(false);

        //set OK button to confirm name

        Button buttonOK = findViewById(R.id.button_ok);
        buttonOK.isClickable();

        //put name into question 1

        final TextView firstQuestion = findViewById(R.id.first_question);
        firstQuestion.setText("1. Does " + name + " eats foam while taking bath?");

        //put name into question 2

        final TextView secondQuestion = findViewById(R.id.second_question);
        secondQuestion.setText("2. Does " + name + " love to put finger into power socket?");

        //put name into question 3

        final TextView thirdQuestion = findViewById(R.id.third_question);
        thirdQuestion.setText("3. Does " + name + " make a poo only after change of diaper into new one?");

        //put name into question 5

        final TextView fifthQuestion = findViewById(R.id.fifth_question);
        fifthQuestion.setText("5. Does " + name + " change the mood from happy to terrifying sadness in one second?");

    }

    public void checkAnswer(View view) {
        EditText inputName = findViewById(R.id.input_name);
        String name = inputName.getText().toString();
        TextView textView = findViewById(R.id.quiz_score_text_view);
        textView.setText("Your score is: 5/5" + "\n" + name + " definitely behaves like a normal child :)");
        textView.setGravity(Gravity.CENTER_HORIZONTAL);
        LinearLayout answerLayout = findViewById(R.id.answer_layout);
        answerLayout.setBackgroundResource(R.drawable.answer_view);

        answerLayout.bringToFront();


    }

    public void resetQuiz(View view) {

        //uncheck radio buttons after RESET button clicked

        RadioGroup rg1 = findViewById(R.id.group1);
        RadioGroup rg2 = findViewById(R.id.group2);
        RadioGroup rg3 = findViewById(R.id.group3);
        RadioGroup rg4 = findViewById(R.id.group4);
        RadioGroup rg5 = findViewById(R.id.group5);
        rg1.clearCheck();
        rg2.clearCheck();
        rg3.clearCheck();
        rg4.clearCheck();
        rg5.clearCheck();

        //clear EditText after RESET button clicked

        EditText inputName = findViewById(R.id.input_name);
        inputName.getText().clear();

        //clear answer text view

        TextView textView = findViewById(R.id.quiz_score_text_view);
        textView.setText("");

        //clear answer text view background

        LinearLayout answerLayout = findViewById(R.id.answer_layout);
        answerLayout.setBackgroundResource(0);

    }


}
