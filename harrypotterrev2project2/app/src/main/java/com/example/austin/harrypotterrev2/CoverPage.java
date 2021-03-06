package com.example.austin.harrypotterrev2;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

//Contains the logic for the coverpage actiivty, the start page that lists all
// the different categories being movies, books and quotes, where the images go for  each category and sets the text for each of those

public class CoverPage extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbaricon, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cover_page);
        Typeface font = Typeface.createFromAsset(getAssets(), "hpfont.TTF");
        TextView title = (TextView) findViewById(R.id.title);
        TextView movies = (TextView) findViewById(R.id.mvoies);
        TextView books = (TextView) findViewById(R.id.books);
        TextView quotes = (TextView) findViewById(R.id.quotes);
        title.setTypeface(font);
        movies.setTypeface(font);
        books.setTypeface(font);
        quotes.setTypeface(font);
    }

    public void clickingTextView(View view) {
        Intent intent = new Intent(CoverPage.this, MainActivity.class);
        startActivity(intent);
    }

    public void whenHPClicked(View view) {
        Toast.makeText(getApplicationContext(), "You found the easteregg!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(CoverPage.this, easteregg.class);
        startActivity(intent);

    }
    //Creates an OnClick event for intent on the movies textView


    public void whenClickedMovies(View view) {
        Intent intent = new Intent(CoverPage.this, MainActivity.class);
        startActivity(intent);

    }

    public void whenClickedBooks(View view) {
        Intent intent = new Intent(CoverPage.this, BooksActivity.class);
        startActivity(intent);
    }

    public void whenClickedQuotes(View view) {
        Intent intent = new Intent(CoverPage.this, QuotesActivity.class);
        startActivity(intent);
    }

    //Creates an OnClick event for intent on the books textView

//    public void whenClickedBooks(View view) {
//        Intent intent = new Intent(CoverPage.this, BooksActivity.class);
//        startActivity(intent);
//    }
//
//    //Creates an OnClick event for intent on the quotes textView
//
//    public void whenClickedQuotes(View view) {
//        Intent intent = new Intent(CoverPage.this, QuotesActivity.class);
//        startActivity(intent);
//    }
}

