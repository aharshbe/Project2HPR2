package com.example.austin.harrypotterrev2;

/**
 * Created by austin on 5/6/16.
 */
public class AddingSound {
    public static int getDrawable(String sound) {
        switch (sound) {
            case "sound1":
                return R.raw.ilym;
            default:
                return 0;

        }

    }
}
