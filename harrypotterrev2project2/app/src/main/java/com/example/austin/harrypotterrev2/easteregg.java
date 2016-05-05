package com.example.austin.harrypotterrev2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class easteregg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easteregg);}
        //Creates intent for user so they can go back to main screen

    public void backtocategories(View view) {
        Intent intent = new Intent(easteregg.this, CoverPage.class);
        startActivity(intent);
    }
    }

