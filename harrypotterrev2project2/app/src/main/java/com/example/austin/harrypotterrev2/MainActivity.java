package com.example.austin.harrypotterrev2;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Region;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import java.util.ArrayList;

//Main class creation

public class MainActivity extends AppCompatActivity {
    ArrayList<Movie> movieDescirption;
    CursorAdapter adapter;
    ListView listView;

    //Creates an override method for the search manager that allows the inflation of the information in the searchView to be translated to the searchView and then references it

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu, menu);

        //ref for the search view and instantiates the search manager

        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = (SearchView) menu.findItem(R.id.search).getActionView();
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));

        return true;
    }

    //Creates override method for when new intent is made

    @Override
    protected void onNewIntent(Intent intent) {
        handleIntent(intent);
    }

    //Creates override method for the intent over to the activity that will display/control the query

    private void handleIntent(Intent intent) {

        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);
            Cursor cursor = OpenHelper.getInstance(MainActivity.this).searchMovies(query);
            adapter.swapCursor(cursor);

        }
    }

    //On create override method

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = (ListView) findViewById(R.id.listView);


        //Creates a new cursor for the listMovies query from the database which grabs the select statement

        Cursor cursor = OpenHelper.getInstance(this).listMovies();

        movieDescirption = new ArrayList<Movie>();

        for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()) {
            Movie movieToAdd = new Movie();

           // movieToAdd.setmId(cursor.getString(cursor.getColumnIndex("id")));
            movieToAdd.setmTitle(cursor.getString(cursor.getColumnIndex("title")));
            movieToAdd.setmSound(cursor.getString(cursor.getColumnIndex("sound")));
            movieToAdd.setmPlot(cursor.getString(cursor.getColumnIndex("plot")));
            movieToAdd.setmDate(cursor.getString(cursor.getColumnIndex("date")));
            movieToAdd.setmRuntime(cursor.getString(cursor.getColumnIndex("runtime")));
            movieToAdd.setmQuote(cursor.getString(cursor.getColumnIndex("topquote")));
            movieToAdd.setmGross(cursor.getString(cursor.getColumnIndex("gross")));

            //Adds the columns

            movieDescirption.add(movieToAdd);

        }

        //Creates the adapter to utilize the cursor

        if (adapter == null){

            adapter = new CursorAdapter(this, cursor, 0) {


                @Override
                public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                    LayoutInflater layoutInflater = LayoutInflater.from(context);
                    View view = layoutInflater.inflate(R.layout.movies, viewGroup, false);
                    return view;
                }

                @Override
                public void bindView(View view, Context context, Cursor cursor) {
                    Typeface font = Typeface.createFromAsset(getAssets(), "hpfont.TTF");
                    TextView movieTitle = (TextView) view.findViewById(R.id.MovieName);
                    movieTitle.setTypeface(font);
                    ImageView movieCover = (ImageView) view.findViewById(R.id.movieCover);
                    Button playButton = (Button) view.findViewById(R.id.playsound2);
                    int returningImage = AddingImages.getDrawable(cursor.getString(cursor.getColumnIndex("cover")));
                    int returningSound = AddingSound.getResource(cursor.getString(cursor.getColumnIndex("sound")));
                    String movie1 = cursor.getString(cursor.getColumnIndex("title"));
                    movieTitle.setText(movie1);
                    movieCover.setImageResource(returningImage);
                   // playButton.se(returningSound);


                }
            };

            listView.setAdapter(adapter);

        }else{
            adapter.swapCursor(cursor);
        }

        //Sets the adapter to the listView

        listView.setAdapter(adapter);

        //Sets the onItem click to go over to the descriptions activity

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Movie movie = movieDescirption.get(position);
//                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
//                //     intent.putExtra("id", movie.getmId());
//                intent.putExtra("title", movie.getmTitle());
//                intent.putExtra("plot", movie.getmPlot());
//                intent.putExtra("date", movie.getmDate());
//                intent.putExtra("runtime", movie.getmRuntime());
//                intent.putExtra("topquote", movie.getmQuote());
//                intent.putExtra("gross", movie.getmGross());

                //Using the cursor instead of my way using the array adapters

                Cursor cursor = adapter.getCursor();
                cursor.moveToPosition(position);
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("title", cursor.getString(cursor.getColumnIndex(OpenHelper.COL_TITLE)));
                intent.putExtra("cover", AddingImages.getDrawable(cursor.getString(cursor.getColumnIndex("cover"))));
                intent.putExtra("sound", AddingSound.getResource(cursor.getString(cursor.getColumnIndex("sound"))));
                intent.putExtra("plot", cursor.getString(cursor.getColumnIndex(OpenHelper.COL_PLOT)));
                intent.putExtra("date", cursor.getString(cursor.getColumnIndex(OpenHelper.COL_DATE)));
                intent.putExtra("runtime", cursor.getString(cursor.getColumnIndex(OpenHelper.COL_RUNTIME)));
                intent.putExtra("topquote", cursor.getString(cursor.getColumnIndex(OpenHelper.COL_TOPQUOTE)));
                intent.putExtra("gross", cursor.getString(cursor.getColumnIndex(OpenHelper.COL_GROSS)));


                //Starts the intent

                startActivity(intent);
            }
        });

        //Handels the intent when the user places information into the searchView

        handleIntent(getIntent());



    }
}

