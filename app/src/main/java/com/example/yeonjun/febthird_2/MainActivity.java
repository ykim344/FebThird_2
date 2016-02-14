package com.example.yeonjun.febthird_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;

import layout.QuizOne;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showQuizOne(View view){
        Fragment f;
        f = new QuizOne();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.quizlocation, f);
        ft.commit();
    }


    public void showQuizTwo(View view){
        Fragment f;
        f = new QuizTwo();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.quizlocation,f);
        ft.commit();
    }
}
