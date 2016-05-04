package com.example.austin.harrypotterrev2;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Movie> movieDescirption;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

//        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
//        SearchView searchView = (SearchView) menu.findItem(R.id.search).getActionView();
//        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu, menu);
        return true;


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listView = (ListView) findViewById(R.id.listView);


        Cursor cursor = OpenHelper.getInstance(this).listMovies();

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
                new String[] { OpenHelper.COL_TITLE },
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

