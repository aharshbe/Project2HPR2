package com.example.austin.harrypotterrev2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class dobbyDescription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dobby_description);
    }
    public void clickingdobby(View view) {
        Intent intent = new Intent(dobbyDescription.this, QuotesActivity.class);
        startActivity(intent);
    }
}
