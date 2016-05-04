package com.example.austin.harrypotterrev2;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ArrayList<Movie> movieDescirption;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu, menu);
        return true;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);


        Cursor cursor = DatabaseHelper.getInstance(this).listMovies();

        movieDescirption = new ArrayList<Movie>();

        for(cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()){
            Movie  movieToAdd = new Movie();
//            movieToAdd.setmId(cursor.getString(cursor.getColumnIndex("id")));
            movieToAdd.setmTitle(cursor.getString(cursor.getColumnIndex("title")));
            movieToAdd.setmPlot(cursor.getString(cursor.getColumnIndex("plot")));
            movieToAdd.setmDate(cursor.getString(cursor.getColumnIndex("date")));
            movieToAdd.setmRuntime(cursor.getString(cursor.getColumnIndex("runtime")));
            movieToAdd.setmQuote(cursor.getString(cursor.getColumnIndex("topquote")));
            movieToAdd.setmGross(cursor.getString(cursor.getColumnIndex("gross")));

            movieDescirption.add(movieToAdd);

        }

        SimpleCursorAdapter adapter = new SimpleCursorAdapter(this,
                android.R.layout.simple_list_item_1,
                cursor,
                new String[] { DatabaseHelper.COL_TITLE },
                new int[] { android.R.id.text1 });

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Movie movie = movieDescirption.get(position);
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
           //     intent.putExtra("id", movie.getmId());
                intent.putExtra("title", movie.getmTitle());
                intent.putExtra("plot", movie.getmPlot());
                intent.putExtra("date", movie.getmDate());
                intent.putExtra("runtime", movie.getmRuntime());
                intent.putExtra("topquote", movie.getmQuote());
                intent.putExtra("gross", movie.getmGross());

                startActivity(intent);
            }
        });


    }


}

