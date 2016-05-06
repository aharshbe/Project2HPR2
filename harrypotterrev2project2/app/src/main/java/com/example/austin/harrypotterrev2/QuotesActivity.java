package com.example.austin.harrypotterrev2;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

//Contains the logic for the quotes actiivty, the start page that lists all
// the different quotes and which characted said them or rather which characters you can choose from

public class QuotesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);

        Typeface font = Typeface.createFromAsset(getAssets(), "hpfont.TTF");
        TextView quotes = (TextView) findViewById(R.id.quotetitle);
        TextView quote1 = (TextView) findViewById(R.id.quote1);
        TextView quote2 = (TextView) findViewById(R.id.quote2);
        TextView quote3 = (TextView) findViewById(R.id.quote3);
        quote1.setTypeface(font);
        quote2.setTypeface(font);
        quote3.setTypeface(font);
        quotes.setTypeface(font);

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
