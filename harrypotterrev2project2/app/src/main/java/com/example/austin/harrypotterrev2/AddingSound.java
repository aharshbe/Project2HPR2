package com.example.austin.harrypotterrev2;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by austin on 5/6/16.
 */
public class AddingSound {
    public static int getResource(String sound) {
        switch (sound) {
            case "sound1":
                return R.raw.ilym;
            default:
                return 0;

        }

    }

    public static void playSoundFunction(Context context, int soundID){
        MediaPlayer mp = MediaPlayer.create(context, soundID);
        mp.start();
    }


}
