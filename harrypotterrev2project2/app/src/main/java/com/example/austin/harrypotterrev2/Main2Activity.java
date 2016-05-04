package com.example.austin.harrypotterrev2;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import java.util.List;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description);


        ListView listView2 = (ListView) findViewById(R.id.listView2);


        Cursor cursor = DatabaseHelper.getInstance(this).listMovies();

        SimpleCursorAdapter adapter = new SimpleCursorAdapter(this,
                R.layout.description,
                cursor,
                new String[]{DatabaseHelper.COL_TITLE},
                new int[]{android.R.id.title});


        listView2.setAdapter(adapter);

    }
}

