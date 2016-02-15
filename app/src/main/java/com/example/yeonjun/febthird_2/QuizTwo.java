package com.example.yeonjun.febthird_2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link QuizTwo.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link QuizTwo#newInstance} factory method to
 * create an instance of this fragment.
 */
public class QuizTwo extends Fragment implements FragInterface{


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quiz_two, container, false);
    }


    public String getTextVal(){
        return "";
    }
}
