package com.example.austin.harrypotterrev2;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BooksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);

        Typeface font = Typeface.createFromAsset(getAssets(), "hpfont.TTF");
        TextView title = (TextView) findViewById(R.id.bookstitle);
        TextView book1 = (TextView) findViewById(R.id.book1);
        TextView book2 = (TextView) findViewById(R.id.book2);
        TextView book3 = (TextView) findViewById(R.id.book3);
        book1.setTypeface(font);
        book2.setTypeface(font);
        book3.setTypeface(font);
        title.setTypeface(font);


    }

    public void whenbooksclicked(View view) {
        Intent intent = new Intent(BooksActivity.this, CoverPage.class);
        startActivity(intent);
    }

    public void opendescription1(View view) {
        Intent intent = new Intent(BooksActivity.this, bookDescription.class);
        startActivity(intent);

    }

    public void opendescription2(View view) {
        Intent intent = new Intent(BooksActivity.this, bookDescription2.class);
        startActivity(intent);
    }

    public void opendescription3(View view) {
        Intent intent = new Intent(BooksActivity.this, bookDescription3.class);
        startActivity(intent);
    }
}

