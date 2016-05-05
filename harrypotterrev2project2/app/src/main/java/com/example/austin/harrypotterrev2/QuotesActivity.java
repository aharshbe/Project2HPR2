package com.example.austin.harrypotterrev2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class QuotesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);
    }

    //Adds intent over to main acitivty from quotes


    public void clickingquotes(View view) {
        Intent intent = new Intent(QuotesActivity.this, CoverPage.class);
        startActivity(intent);
    }

    //Adds intent to go over to description for dumbledoor

    public void clickingdumbledore(View view) {
        Intent intent = new Intent(QuotesActivity.this, quoteDescription.class);
        startActivity(intent);
    }

    public void goingtodobby(View view) {
        Intent intent = new Intent(QuotesActivity.this, dobbyDescription.class);
        startActivity(intent);
    }

    public void clickingsnape(View view) {
        Intent intent = new Intent(QuotesActivity.this, snapeDescription.class);
        startActivity(intent);
    }
}
