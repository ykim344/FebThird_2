package com.example.yeonjun.febthird_2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link QuizTwo.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link QuizTwo#newInstance} factory method to
 * create an instance of this fragment.
 */
public class QuizTwo extends Fragment {


    FragInterface comm;
    EditText text;
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quiz_two, container, false);
    }


    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        comm = (FragInterface)getActivity();
        text = (EditText) getActivity().findViewById(R.id.quizTwoAns);


        final Button button = (Button) getActivity().findViewById(R.id.quizTwoSubmit);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                comm.respondtoActivity(text.getText().toString());
            }
        });



    }

}
