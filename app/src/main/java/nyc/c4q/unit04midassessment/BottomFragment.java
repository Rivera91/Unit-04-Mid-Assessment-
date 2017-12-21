package nyc.c4q.unit04midassessment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


/**
 * A simple {@link Fragment} subclass.
 */
public class BottomFragment extends Fragment {
 private View rootView;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_bottom, container, false);
        return rootView;

    }


    public  BottomFragment() {


        JSONObject jsonObject = new JSONObject();

try{
            jsonObject.put("books", new JSONArray()
                    .put(new JSONObject()
                        .put("title","Northanger Abbey")
                        .put("author", "Austen, Jane")
                        .put("year", 1814))

                    .put(new JSONObject()
                        .put("title","War and Peace")
                        .put("author", "Tolstoy, Leo")
                        .put("year", 1865))

                    .put(new JSONObject()
                        .put("title","Anna Karenina")
                        .put("author", "Tolstoy, Leo")
                        .put("year", 1875))

                     .put(new JSONObject()
                        .put("title","Mrs. Dalloway")
                        .put("author", "Woolf, Virginia")
                        .put("year", 1925))

                     .put(new JSONObject()
                        .put("title","Mrs. Dalloway")
                        .put("author", "Woolf, Virginia")
                        .put("year", 1925))

                    .put(new JSONObject()
                        .put("title","The Hours")
                        .put("author", "Cunnningham, Michael")
                        .put("year", 1999))

                    .put(new JSONObject()
                        .put("title","Huckleberry Finn")
                        .put("author", "Twain, Mark")
                        .put("year", 1865))

                    .put(new JSONObject()
                        .put("title","Bleak House")
                        .put("author", "Dickens, Charles")
                        .put("year", 1870))

                    .put(new JSONObject()
                        .put("title","Tom Sawyer")
                        .put("author", "Twain, Mark")
                        .put("year", 1862)));
} catch (JSONException e) {
    e.printStackTrace();
}


    }

    public void JSONparse(String str){

    }

}
