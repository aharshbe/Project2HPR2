package com.example.austin.harrypotterrev2;

/**
 * Created by austin on 5/17/16.
 */
public class AddingImagesBooks {
    public static int getDrawable(String image) {
        switch (image) {
            case "book1":
                return R.drawable.bcoverhd;
            case "book2":
                return R.drawable.book2cover;
            case "book3":
                return R.drawable.book3cover;
            case "book4":
                return R.drawable.book4cover;
            case "book5":
                return R.drawable.book5cover;
            case "book6":
                return R.drawable.book6cover;
            case "book7":
                return R.drawable.book7cover;
            default:
                return 0;

        }

    }
}
