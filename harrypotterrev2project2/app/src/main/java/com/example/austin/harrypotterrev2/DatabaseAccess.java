package com.example.austin.harrypotterrev2;

/**
 * Created by austin on 5/3/16.
 */
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DatabaseAccess {
    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase database;
    private static DatabaseAccess instance;

    /**
     * Private constructor to aboid object creation from outside classes.
     *
     * @param context
     */
    private DatabaseAccess(Context context) {
        this.openHelper = new DatabaseOpenHelper(context);
    }

    /**
     * Return a singleton instance of DatabaseAccess.
     *
     * @param context the Context
     * @return the instance of DabaseAccess
     */
    public static DatabaseAccess getInstance(Context context) {
        if (instance == null) {
            instance = new DatabaseAccess(context);
        }
        return instance;
    }

    /**
     * Open the database connection.
     */
    public void open() {
        this.database = openHelper.getWritableDatabase();
    }

    /**
     * Close the database connection.
     */
    public void close() {
        if (database != null) {
            this.database.close();
        }
    }

    /**
     * Read all quotes from the database.
     *
     * @return a List of quotes
     */
    public List<String> getGross() {
        List<String> list = new ArrayList<>();
        Cursor cursor = database.rawQuery("SELECT gross from moviesDescription", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            list.add(cursor.getString(0));
            cursor.moveToNext();

        }
        cursor.close();
        return list;
    }

    public List<String> getPlot() {
        List<String> list = new ArrayList<>();
        Cursor cursor = database.rawQuery("SELECT plot from moviesDescription", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            list.add(cursor.getString(0));
            cursor.moveToNext();

        }
        cursor.close();
        return list;
    }

    public List<String> getRuntime() {
        List<String> list = new ArrayList<>();
        Cursor cursor = database.rawQuery("SELECT runtime from moviesDescription", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            list.add(cursor.getString(0));
            cursor.moveToNext();

        }
        cursor.close();
        return list;
    }

    public List<String> getTopQuote() {
        List<String> list = new ArrayList<>();
        Cursor cursor = database.rawQuery("SELECT topquote from moviesDescription", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            list.add(cursor.getString(0));
            cursor.moveToNext();

        }
        cursor.close();
        return list;
    }

    public List<String> getDate() {
        List<String> list = new ArrayList<>();
        Cursor cursor = database.rawQuery("SELECT date from moviesDescription", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            list.add(cursor.getString(0));
            cursor.moveToNext();

        }
        cursor.close();
        return list;
    }

    public List<String> getTitle() {
        List<String> list = new ArrayList<>();
        Cursor cursor = database.rawQuery("select title from moviesDescription", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            list.add(cursor.getString(0));
            cursor.moveToNext();

        }
        cursor.close();
        return list;
    }
}
