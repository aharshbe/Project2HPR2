package com.example.austin.harrypotterrev2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class snapeDescription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snape_description);
    }
    public void clickingsnape(View view) {
        Intent intent = new Intent(snapeDescription.this, QuotesActivity.class);
        startActivity(intent);
    }
}
