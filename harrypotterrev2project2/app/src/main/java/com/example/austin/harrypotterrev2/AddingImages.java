package com.example.austin.harrypotterrev2;

/**
 * Created by austin on 5/4/16.
 *
 */

//Creates an object class that uses a switch case to send over infomration and inflate my custom layout on Activity 1 (Main activity)
public class AddingImages {
    public static int getDrawable(String image) {
        switch (image) {
            case "movie1":
                return R.drawable.hpv1sor;
            case "movie2":
                return R.drawable.hpv22;
            case "movie3":
                return R.drawable.hpmv3movie;
            case "movie4":
                return R.drawable.hpvmv4;
            case "movie5":
                return R.drawable.hpvmvc5;
            case "movie6":
                return R.drawable.hpvmv6;
            case "movie7":
                return R.drawable.hpmv7;
            case "movie8":
                return R.drawable.hpmv8;
            default:
                return 0;

        }

    }
}
