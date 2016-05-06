package com.example.austin.harrypotterrev2;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tryingSound extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trying_sound);

    //Creating a media player and creating it
    final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ilym);
    //Creating button
        Button button = (Button) this.findViewById(R.id.playSound3);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mediaPlayer.start();
            }
        });









    }

    public void clickingMakeSound(View view) {
    }
}
