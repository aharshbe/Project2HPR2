package com.example.austin.harrypotterrev2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

//Is the first book descritpion that intents and gives information about the first book when clicked

public class bookDescription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_description);
    }


    public void booksback(View view) {
        Intent intent = new Intent(bookDescription.this, BooksActivity.class);
        startActivity(intent);
    }
}
