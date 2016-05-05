package com.example.austin.harrypotterrev2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class bookDescription2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_description2);
    }
    public void booksback2(View view) {
        Intent intent = new Intent(bookDescription2.this, BooksActivity.class);
        startActivity(intent);
    }
}
