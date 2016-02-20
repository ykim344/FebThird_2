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
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link QuizTwo.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link QuizTwo#newInstance} factory method to
 * create an instance of this fragment.
 */
public class QuizTwo extends Fragment {


    //EditText text;
    RadioButton tigerButton;
    RadioButton lionButton;
    RadioGroup g;
    FragInterface comm;
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //Button next = (Button) getActivity().findViewById(R.id.quizTwoSubmit);

        return inflater.inflate(R.layout.fragment_quiz_two, container, false);
    }


    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        comm = (FragInterface)getActivity();
        //text = (EditText) getActivity().findViewById(R.id.quizTwoAns);


        final Button button = (Button) getActivity().findViewById(R.id.quizTwoSubmit);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int selectedId = g.getCheckedRadioButtonId();
                RadioButton selected = (RadioButton) getActivity().findViewById(selectedId);

                if(selected!=null&&selected.getId()== tigerButton.getId()){
                    comm.respondtoActivity("tiger");
                }
                else{
                    comm.respondtoActivity("lion");
                }

            }
        });



    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RadioGroup rbg = (RadioGroup) getActivity().findViewById(R.id.radio2ans);
        tigerButton= (RadioButton) getActivity().findViewById(R.id.tigerbutton);
        lionButton = (RadioButton) getActivity().findViewById(R.id.lionbutton);
        tigerButton= (RadioButton) getActivity().findViewById(R.id.tigerbutton);
        g = (RadioGroup)getActivity().findViewById(R.id.radio2ans);

    }
}
