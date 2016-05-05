package com.example.austin.harrypotterrev2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class quoteDescription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote_description);
    }
    public void clickingdumbledore(View view) {
        Intent intent = new Intent(quoteDescription.this, QuotesActivity.class);
        startActivity(intent);
    }
}
