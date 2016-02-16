package layout;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.yeonjun.febthird_2.FragInterface;
import com.example.yeonjun.febthird_2.R;


public class QuizOne extends Fragment  {

    FragInterface comm;
    EditText text;
    Button button;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quiz_one, container, false);
    }

    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        comm = (FragInterface)getActivity();
        text = (EditText) getActivity().findViewById(R.id.quizOneAns);
        button = (Button)getActivity().findViewById(R.id.quizOneSubmit);
        //button.setOnClickListener(this);
    }

    public void oneClick(View v) {
        comm.respondtoActivity(text.getText().toString());
    }

}
