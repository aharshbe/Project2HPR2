package com.example.austin.harrypotterrev2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class bookDescription3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_description3);
    }
    public void booksback3(View view) {
        Intent intent = new Intent(bookDescription3.this, BooksActivity.class);
        startActivity(intent);
    }
}
