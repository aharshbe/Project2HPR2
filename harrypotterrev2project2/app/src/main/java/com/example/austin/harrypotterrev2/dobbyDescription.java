package com.example.austin.harrypotterrev2;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class dobbyDescription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dobby_description);

        Typeface font = Typeface.createFromAsset(getAssets(), "hpfont.TTF");
        TextView dobby = (TextView) findViewById(R.id.dobby);
        dobby.setTypeface(font);
    }

    public void clickingdobby(View view) {
        Intent intent = new Intent(dobbyDescription.this, QuotesActivity.class);
        startActivity(intent);
    }
}
