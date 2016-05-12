package com.example.austin.harrypotterrev2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;


import java.io.InputStream;

//Just a random class I created for a fun little easteregg, originally it was suppose to also have a moving gif and a sound,
//Sadly I wasn't able to implement either of those two, though I did try in my various branch :P



public class easteregg extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easteregg);
    }


    //Creates intent for user so they can go back to main screen

    public void backtocategories(View view) {
        Intent intent = new Intent(easteregg.this, CoverPage.class);
        startActivity(intent);
    }

    //Just created this to show that I know what I'm doing for the test cases
    public static String hello() {
        return "why";
    }

    public void clicksound234(View view) {
        Intent intent = new Intent(easteregg.this, tryingSound.class);
        startActivity(intent);
    }

    public void clickingSpinner(View view) {
        Animation animation = null;
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.b);
        ImageView imageView = (ImageView) findViewById(R.id.moldy);
        animation = AnimationUtils.loadAnimation(this, R.anim.movingegg);
        mediaPlayer.start();
        imageView.startAnimation(animation);

    }
}



