package com.example.austin.harrypotterrev2;

import android.content.Context;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    public class myAdapter extends ArrayAdapter<Movie> {

        public myAdapter(Context context, int resource, List<Movie> cursors) {
            super(context, resource, cursors);
        }


        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View v = convertView;

            if (v == null) {
                LayoutInflater vi;
                vi = LayoutInflater.from(getContext());
                v = vi.inflate(R.layout.description, null);
            }

            Movie cursor = getItem(position);


            if (cursor != null) {
                TextView title = (TextView) findViewById(R.id.title);
                TextView plot = (TextView) findViewById(R.id.plot);
                TextView date = (TextView) findViewById(R.id.date);
                TextView runtime = (TextView) findViewById(R.id.runtime);
                TextView quote = (TextView) findViewById(R.id.quote);
                TextView gross = (TextView) findViewById(R.id.gross);


                if (title != null) {
                    title.setText(cursor.getmTitle());
                }
                if (plot != null) {
                    plot.setText(cursor.getmPlot());
                }
                if (date != null) {
                    date.setText(cursor.getmDate());
                }
                if (runtime != null) {
                    runtime.setText(cursor.getmRuntime());
                }
                if (quote != null) {
                    quote.setText(cursor.getmQuote());
                }
                if (gross != null) {
                    gross.setText(cursor.getmGross());
                }

                return v;
            }

            return super.getView(position, convertView, parent);
        }
        @Override
        public int getCount() {
            return super.getCount();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Cursor cursor = DatabaseHelper.getInstance(this).listMovies();

        ArrayList<Movie> movieDescirption = new ArrayList<Movie>();

        for(cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()){
            Movie  movieToAdd = new Movie();
            movieToAdd.setmTitle(cursor.getString(cursor.getColumnIndex("title")));
            movieToAdd.setmPlot(cursor.getString(cursor.getColumnIndex("plot")));
            movieToAdd.setmDate(cursor.getString(cursor.getColumnIndex("date")));
            movieToAdd.setmRuntime(cursor.getString(cursor.getColumnIndex("runtime")));
            movieToAdd.setmQuote(cursor.getString(cursor.getColumnIndex("topquote")));
            movieToAdd.setmGross(cursor.getString(cursor.getColumnIndex("gross")));

            movieDescirption.add(movieToAdd);

        }

        myAdapter inflatingAdapter = new myAdapter(this, R.layout.description, movieDescirption);

       ListView inflatingListView = (ListView) findViewById(R.id.listView2);
        inflatingListView.setAdapter(inflatingAdapter);

    }
}




