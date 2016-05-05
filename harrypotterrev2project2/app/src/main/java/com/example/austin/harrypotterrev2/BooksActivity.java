package com.example.austin.harrypotterrev2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BooksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
    }

    public void whenbooksclicked(View view) {
        Intent intent = new Intent(BooksActivity.this, CoverPage.class);
        startActivity(intent);
    }

    public void opendescription1(View view) {
        Intent intent = new Intent(BooksActivity.this, bookDescription.class);
        startActivity(intent);

    }

    public void opendescription2(View view) {
        Intent intent = new Intent(BooksActivity.this, bookDescription2.class);
        startActivity(intent);
    }

    public void opendescription3(View view) {
        Intent intent = new Intent(BooksActivity.this, bookDescription3.class);
        startActivity(intent);
    }
}

