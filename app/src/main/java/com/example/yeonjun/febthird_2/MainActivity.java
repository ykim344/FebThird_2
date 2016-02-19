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

    public void showQuizOne(View view){



        Fragment f = new QuizOne();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.quizlocation, f);
        ft.commit();
    }





    @Override
    public void respondtoActivity(String value) {
        Fragment currentFragment = this.getFragmentManager().findFragmentById(R.id.quizlocation);



        if(currentFragment instanceof QuizOne){

            if(value.equals("2"))
                quizOneRight = true;
            else
                quizOneRight = false;

            Fragment f = (Fragment)new QuizTwo();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.quizlocation,f);
            ft.commit();
        }
        else if(currentFragment instanceof QuizTwo){
            //change activity to result page
            if(value.equals("tiger"))
                quizTwoRight = true;
            else
                quizTwoRight = false;

            Intent i = new Intent(this, ResultActivity.class);
            startActivity(i);
        }


    }
}
