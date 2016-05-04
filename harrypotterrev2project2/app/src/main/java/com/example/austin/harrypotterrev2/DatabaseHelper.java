package com.example.austin.harrypotterrev2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by austin on 5/2/16.
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    // Define the database name and version
    public static final int DATABASE_VERSION = 12;
    public static final String DATABASE_NAME = "movies.db";

    //Creating variables for each of the columns
    public static final String MOVIES_TABLE_NAME = "moviesDescription";
    public static final String COL_ID = "_id";
    public static final String COL_PLOT = "plot";
    public static final String COL_DATE = "date";
    public static final String COL_RUNTIME = "runtime";
    public static final String COL_TOPQUOTE = "topquote";
    public static final String COL_GROSS = "gross";
    public static final String COL_TITLE = "title";


    //Creating an array of the different columns
    public static final String[] MOVIES_COLUMNS = {COL_ID, COL_TITLE, COL_PLOT, COL_DATE, COL_RUNTIME, COL_TOPQUOTE, COL_GROSS};


    //Adds create table information for each of the colums
    private static final String CREATE_MOVIES_TABLE =
            "CREATE TABLE " + MOVIES_TABLE_NAME +
                    "(" +
                    COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COL_TITLE + " TEXT, " +
                    COL_DATE + " TEXT, " +
                    COL_GROSS + " TEXT, " +
                    COL_TOPQUOTE + " TEXT, " +
                    COL_RUNTIME + " TEXT, " +
                    COL_PLOT + " TEXT )";

    //Creates a constructor

    private static DatabaseHelper instance;

    public static DatabaseHelper getInstance(Context context) {
        if (instance == null) {
            instance = new DatabaseHelper(context);
        }
        return instance;
    }

    //If there isn't an instance of the database--null then it creates one
    // override the SQLiteDatabase's constructor, onCreate, and onUpgrade
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    //Self-explanatory..
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_MOVIES_TABLE);
        setDefaultData(db);
    }

    //Upgrade, to update the table
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + MOVIES_TABLE_NAME);
        this.onCreate(db);
    }

    public void setDefaultData(SQLiteDatabase db){
        ContentValues values = new ContentValues();
        values.put(COL_PLOT, "this is the plot");
        values.put(COL_TITLE, "some title");
        db.insert(MOVIES_TABLE_NAME, null, values);

        values = new ContentValues();
        values.put(COL_PLOT, "this is another plot");
        values.put(COL_TITLE, "some other title");
        db.insert(MOVIES_TABLE_NAME, null, values);
    }

    public Cursor listMovies(){

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(
                MOVIES_TABLE_NAME, // a. table
                new String[]{COL_ID, COL_TITLE}, // b. column names
                null, // c. selections //or // or
                null, // d. selections args
                null, // e. group by
                null, // f. having
                null, // g. order by
                null); // h. limit

        DatabaseUtils.dumpCursor(cursor);

        return cursor;
    }

    public Cursor searchMovies(String query) {

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(
                MOVIES_TABLE_NAME, // a. table
                MOVIES_COLUMNS, // b. column names
                COL_PLOT + " LIKE ? or " + COL_TITLE + " LIKE ? ", // c. selections //or // or
                new String[]{query + "%", query + "%"}, // d. selections args
                null, // e. group by
                null, // f. having
                null, // g. order by
                null); // h. limit

        DatabaseUtils.dumpCursor(cursor);

        return cursor;
    }


}