package layout;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.yeonjun.febthird_2.FragInterface;
import com.example.yeonjun.febthird_2.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link QuizOne.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link QuizOne#newInstance} factory method to
 * create an instance of this fragment.
 */
public class QuizOne extends Fragment implements FragInterface {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quiz_one, container, false);
    }


    public String getTextVal(){

        EditText QuizOneAnswer = (EditText) findViewById(R.id.quizOneAns);

        return QuizOneAnswer.getText().toString();
    }
}
