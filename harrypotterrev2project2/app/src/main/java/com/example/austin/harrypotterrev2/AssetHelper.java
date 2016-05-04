package com.example.austin.harrypotterrev2;

/**
 * Created by austin on 5/3/16.
 */

//Creates an asset helper so that the database and version can be referenced properly
import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class AssetHelper extends SQLiteAssetHelper {
    private static final String DATABASE_NAME = "movies.db";
    private static final int DATABASE_VERSION = 1;

    public AssetHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
}