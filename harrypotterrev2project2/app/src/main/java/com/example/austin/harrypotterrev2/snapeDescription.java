package com.example.austin.harrypotterrev2;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

//Description page for when snape is selected in the quotes activity

public class snapeDescription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snape_description);

        Typeface font = Typeface.createFromAsset(getAssets(), "hpfont.TTF");
        TextView snape = (TextView) findViewById(R.id.snape);
        snape.setTypeface(font);


    }

    public void clickingsnape(View view) {
        Intent intent = new Intent(snapeDescription.this, QuotesActivity.class);
        startActivity(intent);
    }
}
