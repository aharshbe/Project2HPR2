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

import java.util.List;

public class Main2Activity extends AppCompatActivity {
    public class myAdapter extends ArrayAdapter<Cursor> {

        public myAdapter(Context context, int resource, List<Cursor> cursors) {
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

            Cursor cursor = getItem(position);


            if (cursor != null) {
                TextView title = (TextView) findViewById(R.id.title);
                TextView plot = (TextView) findViewById(R.id.plot);
                TextView date = (TextView) findViewById(R.id.date);
                TextView runtime = (TextView) findViewById(R.id.runtime);
                TextView quote = (TextView) findViewById(R.id.quote);
                TextView gross = (TextView) findViewById(R.id.gross);


                if (title != null) {
                    title.setText(cursor.getString(cursor.getColumnIndex("title")));
                }
                if (plot != null) {
                    plot.setText(cursor.getString(cursor.getColumnIndex("plot")));
                }
                if (date != null) {
                    date.setText(cursor.getString(cursor.getColumnIndex("date")));
                }
                if (runtime != null) {
                    runtime.setText(cursor.getString(cursor.getColumnIndex("runtime")));
                }
                if (quote != null) {
                    quote.setText(cursor.getString(cursor.getColumnIndex("quote")));
                }
                if (gross != null) {
                    gross.setText(cursor.getString(cursor.getColumnIndex("gross")));
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

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main2);
//
//
//        ListView listView2 = (ListView) findViewById(R.id.listView2);
//
//
//        Cursor cursor = DatabaseHelper.getInstance(this).listMovies();
//
//        SimpleCursorAdapter adapter = new SimpleCursorAdapter(this,
//                R.layout.description,
//                cursor,
//                new String[]{DatabaseHelper.COL_TITLE},
//                new int[]{android.R.id.title});
//
//
//        listView2.setAdapter(adapter);
//
//    }
}




