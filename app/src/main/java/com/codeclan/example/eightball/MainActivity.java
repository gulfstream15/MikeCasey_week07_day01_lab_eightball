package com.codeclan.example.eightball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText questionEditText;
    private Button shakeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(getClass().toString(), "about to set content view");

        // We are grabbing the items from the activity
        setContentView(R.layout.activity_main);
        Log.d(getClass().toString(), "content view set");

        // Note casts here as findViewById coming in as a view
        questionEditText = (EditText)findViewById(R.id.question_text);
        //answers = (TextView)findViewById(R.id.answer_text);
        shakeButton = (Button)findViewById(R.id.shake_button);
    }

    public void onShakeButtonClicked(View button) {
        // Record in log when button was pressed
        Log.d(getClass().toString(), "Shake button was clicked");
        // Note below that getText() returns an Editable NOT a String so toString() needed
        String question = questionEditText.getText().toString();
        // Record in log what question is when button pressed
        Log.d(getClass().toString(), "The question was: " + question);
        // Call getAnswer to get random
        AnswerProvider answerProvider = new AnswerProvider();
        String answer = answerProvider.getAnswer();

        // Here startActivity() takes in 'Intent'
        // which takes (Context, intent)
        // we have to create an intent object
        // - is the class we are referring to
        // 'this' is the Context that refers to
        //  the current class MainActivity
        Intent intent = new Intent(this, AnswerActivity.class);
        intent.putExtra("answer", answer);
        startActivity(intent);
    }

}

