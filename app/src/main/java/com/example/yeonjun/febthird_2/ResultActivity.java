package com.example.yeonjun.febthird_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {


    FragInterface comm;
    EditText text;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView resultone = (TextView)findViewById(R.id.QuizOneResult);
        if(MainActivity.quizOneRight){
            resultone.setText("Quiz one is right");
        }else{
            resultone.setText("Quiz one is wrong");
        }
        TextView resulttwo = (TextView)findViewById(R.id.QuizTwoResult);
        if(MainActivity.quizTwoRight){
            resulttwo.setText("Quiz two is right");
        }else{
            resulttwo.setText("Quiz two is wrong");
        }


    }


    public void retryButton(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

}
