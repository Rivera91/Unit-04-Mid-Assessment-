package nyc.c4q.unit04midassessment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
    private View rootView;

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_main, container, false);

        Bundle bundle = getArguments();
        String textFromEditText = bundle.getString("random", "");
        //textview.setText(textFromEditText);
        return rootView;
    }

    public void onClickListener(View v) {

        Intent intent = new Intent(this, DisplayFragment.class);
        startActivity(intent);

    }

}
