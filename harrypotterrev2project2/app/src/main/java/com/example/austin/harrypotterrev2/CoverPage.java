package com.example.austin.harrypotterrev2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CoverPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cover_page);
    }

    public void clickingTextView(View view) {
        Intent intent = new Intent(CoverPage.this, MainActivity.class);
        startActivity(intent);
    }
}
