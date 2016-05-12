package com.example.austin.harrypotterrev2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


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
        Animation animationtext = null;
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.b);
        ImageView vold = (ImageView) findViewById(R.id.moldy);
        TextView grrr = (TextView) findViewById(R.id.grr);
        animation = AnimationUtils.loadAnimation(this, R.anim.movingegg);
        animationtext = AnimationUtils.loadAnimation(this, R.anim.movingegg);
        Typeface font = Typeface.createFromAsset(getAssets(), "hpfont.TTF");
        grrr.setTypeface(font);
        mediaPlayer.start();
        vold.startAnimation(animation);
        grrr.startAnimation(animationtext);
        grrr.setTextColor(Color.MAGENTA);
    }

    public void clickingHarry(View view) {
        Animation animation = null;
        Animation animationtext = null;
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.hp);
        ImageView vold = (ImageView) findViewById(R.id.ron);
        TextView grrr = (TextView) findViewById(R.id.magic);
        animation = AnimationUtils.loadAnimation(this, R.anim.movingegg);
        animationtext = AnimationUtils.loadAnimation(this, R.anim.movingegg);
        Typeface font = Typeface.createFromAsset(getAssets(), "hpfont.TTF");
        grrr.setTypeface(font);
        mediaPlayer.start();
        vold.startAnimation(animation);
        grrr.startAnimation(animationtext);
        grrr.setTextColor(Color.RED);
    }

    public void clickingDumbl(View view) {
        Animation animation = null;
        Animation animationtext = null;
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.doomed);
        ImageView vold = (ImageView) findViewById(R.id.harry);
        TextView grrr = (TextView) findViewById(R.id.wise);
        animation = AnimationUtils.loadAnimation(this, R.anim.movingegg);
        animationtext = AnimationUtils.loadAnimation(this, R.anim.movingegg);
        Typeface font = Typeface.createFromAsset(getAssets(), "hpfont.TTF");
        grrr.setTypeface(font);
        mediaPlayer.start();
        vold.startAnimation(animation);
        grrr.startAnimation(animationtext);
        grrr.setTextColor(Color.BLUE);
    }

    public void clickingCrazzy(View view) {
        Animation animation = null;
        Animation animationtext = null;
        Animation animationtext2 = null;
        int textsize = 80;
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.whoa);
        ImageView vold = (ImageView) findViewById(R.id.harry);
        ImageView vold2 = (ImageView) findViewById(R.id.ron);
        ImageView vold3 = (ImageView) findViewById(R.id.moldy);
        TextView grrr = (TextView) findViewById(R.id.wise);
        TextView grrr2 = (TextView) findViewById(R.id.magic);
        TextView grrr3 = (TextView) findViewById(R.id.grr);
        animation = AnimationUtils.loadAnimation(this, R.anim.movingegg);
        animationtext = AnimationUtils.loadAnimation(this, R.anim.text);
        animationtext2 = AnimationUtils.loadAnimation(this, R.anim.crazytext);
        Typeface font = Typeface.createFromAsset(getAssets(), "hpfont.TTF");
        grrr.setTypeface(font);
        grrr2.setTypeface(font);
        grrr3.setTypeface(font);
        grrr.setTextSize(textsize);
        grrr2.setTextSize(textsize);
        grrr3.setTextSize(textsize);
        mediaPlayer.start();
        vold.startAnimation(animationtext);
        vold2.startAnimation(animationtext);
        vold3.startAnimation(animationtext);
        grrr.startAnimation(animationtext2);
        grrr2.startAnimation(animationtext2);
        grrr3.startAnimation(animationtext2);
        grrr.setTextColor(Color.YELLOW);
        grrr2.setTextColor(Color.RED);
        grrr3.setTextColor(Color.WHITE);

    }
}



