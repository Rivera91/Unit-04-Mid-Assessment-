package nyc.c4q.unit04midassessment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragment);

    }

    public void pressMe(View v) {
        Intent intent = new Intent(this, DisplayFragment.class);

    }
}
