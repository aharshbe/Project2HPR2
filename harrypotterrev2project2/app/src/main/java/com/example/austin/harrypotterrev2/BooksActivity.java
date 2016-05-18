package com.example.austin.harrypotterrev2;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
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
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

//Contains the logic for the books actiivty, the start page that lists all the different books, where the images go for  each book and sets the text

public class BooksActivity extends AppCompatActivity {

    ArrayList<Movie> bookDescirption;
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
            Cursor cursor = OpenHelper.getInstance(BooksActivity.this).searchMovies(query);
            adapter.swapCursor(cursor);

        }
    }

    //On create override method

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);


        listView = (ListView) findViewById(R.id.listView);


        //Creates a new cursor for the listMovies query from the database which grabs the select statement

        Cursor cursor = OpenHelper2.getInstance(this).listBooks();


        bookDescirption = new ArrayList<Book>();

        for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()) {
            Book bookToAdd = new Book();

            // movieToAdd.setmId(cursor.getString(cursor.getColumnIndex("id")));
            bookToAdd.setmTitle(cursor.getString(cursor.getColumnIndex("title")));
            bookToAdd.setmPlot(cursor.getString(cursor.getColumnIndex("plot")));
            bookToAdd.setmDate(cursor.getString(cursor.getColumnIndex("date")));
            bookToAdd.setmFavChar(cursor.getString(cursor.getColumnIndex("favchar")));
            bookToAdd.setmQuote(cursor.getString(cursor.getColumnIndex("topquote")));
            bookToAdd.setmPages(cursor.getString(cursor.getColumnIndex("pages")));

            //Adds the columns

            bookDescirption.add(bookToAdd);

        }

        //Creates the adapter to utilize the cursor

        if (adapter == null) {

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
                    int returningImage = AddingImages.getDrawable(cursor.getString(cursor.getColumnIndex("cover")));
                    String movie1 = cursor.getString(cursor.getColumnIndex("title"));
                    movieTitle.setText(movie1);
                    movieCover.setImageResource(returningImage);

                }
            };

            listView.setAdapter(adapter);

        } else {
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
                Intent intent = new Intent(BooksActivity.this, Main2Activity.class);
                intent.putExtra("title", cursor.getString(cursor.getColumnIndex(OpenHelper.COL_TITLE)));
                intent.putExtra("cover", AddingImages.getDrawable(cursor.getString(cursor.getColumnIndex("cover"))));
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

