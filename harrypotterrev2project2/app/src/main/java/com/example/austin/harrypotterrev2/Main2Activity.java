package com.example.austin.harrypotterrev2;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

//Activity two contains most of the tie in on the listView for the movies activity

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description);

        //For custom font

        Typeface font = Typeface.createFromAsset(getAssets(), "hpfont.TTF");

        //Creates references for each of the textView that display out the text from the database query

        TextView title = (TextView) findViewById(R.id.title);
        TextView plot = (TextView) findViewById(R.id.plot);
        TextView date = (TextView) findViewById(R.id.date);
        TextView runtime = (TextView) findViewById(R.id.runtime);
        TextView topquote = (TextView) findViewById(R.id.quote);
        TextView gross = (TextView) findViewById(R.id.gross);
        ImageView cover = (ImageView) findViewById(R.id.movieCover);

        //Creates the intent and the getter for the intent to pull out the information from the previous activity view the key/value pair

        Intent intent = getIntent();

//        String mId = intent.getStringExtra("id");
        String mTitle = intent.getStringExtra("title");
        String mPlot = intent.getStringExtra("plot");
        String mDate = intent.getStringExtra("date");
        String mRunTime = intent.getStringExtra("runtime");
        String mTopQuote = intent.getStringExtra("topquote");
        String mGross = intent.getStringExtra("gross");
        int mCover = intent.getIntExtra("cover", 0);

        //Sets the text from the key/value pair the the textView

        title.setText(mTitle);
        title.setTypeface(font);
        cover.setImageResource(mCover);
        plot.setText(mPlot);
        plot.setTypeface(font);
        date.setText(mDate);
        date.setTypeface(font);
        runtime.setText(mRunTime);
        runtime.setTypeface(font);
        topquote.setText(mTopQuote);
        gross.setText(mGross);
        gross.setTypeface(font);

        //Makes text scrollable on the plot textview for more ease

        plot.setMovementMethod(new ScrollingMovementMethod());


    }

}




