package com.example.yeonjun.febthird_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;
import android.widget.EditText;

import layout.QuizOne;

public class MainActivity extends AppCompatActivity {

    public boolean quizOneRight=false;
    public boolean quizTwoRight=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showQuizOne(View view){
       // EditText myTextField = (EditText)findViewById(R.id.textField);


        Fragment f = new QuizOne();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.quizlocation, f);
        ft.commit();
    }


    public void submitButton(View view){
        Fragment currentFragment = this.getFragmentManager().findFragmentById(R.id.quizlocation);

        if(currentFragment instanceof DefaultFragment){
            showQuizOne(view);
        }

        else if(currentFragment instanceof QuizOne){
            Fragment f = new QuizTwo();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.quizlocation,f);
            ft.commit();
        }
        else if(currentFragment instanceof QuizTwo){
            //change activity to result page
        }

    }
}
