package com.example.austin.harrypotterrev2;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

/**
 * Created by austin on 5/17/16.
 */
public class AssetHelperBooks extends SQLiteAssetHelper {
    private static final String DATABASE_NAME = "books.db";
    private static final int DATABASE_VERSION = 1;

    public AssetHelperBooks(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
}
