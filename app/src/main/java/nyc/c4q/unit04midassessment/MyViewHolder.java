package nyc.c4q.unit04midassessment;

import android.graphics.ColorSpace;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.unit04midassessment.Model.BookModel;

public class MyViewHolder extends RecyclerView.ViewHolder {

    public MyViewHolder(View itemView) {
        super(itemView);
    }

    public void bind(BookModel book) {
        TextView textView=itemView.findViewById(R.id.text_view);
        textView.setText(book.getBook());
    }


    }


