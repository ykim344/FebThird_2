package com.example.yeonjun.febthird_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;
import android.widget.EditText;

import layout.QuizOne;

public class MainActivity extends AppCompatActivity implements FragInterface{

    public static boolean quizOneRight=false;
    public static boolean quizTwoRight=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //respond to start button
    public void showQuizOne(View view){

        Fragment f = new QuizOne();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.quizlocation, f);
        ft.commit();
    }





    @Override
    //respond to submit button
    public void respondtoActivity(String value) {
        Fragment currentFragment = this.getFragmentManager().findFragmentById(R.id.quizlocation);

        if(currentFragment instanceof QuizOne){
            //validate answer for quiz one
            if(value.equals("2"))
                quizOneRight = true;
            else
                quizOneRight = false;
            // move to a different fragments after first quiz
            Fragment f = (Fragment)new QuizTwo();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.quizlocation,f);
            ft.commit();
        }
        else if(currentFragment instanceof QuizTwo){
            //check rather it clicked the right radio button
            if(value.equals("tiger"))
                quizTwoRight = true;
            else
                quizTwoRight = false;
            //change activity to result page
            Intent i = new Intent(this, ResultActivity.class);
            startActivity(i);
        }


    }
}
