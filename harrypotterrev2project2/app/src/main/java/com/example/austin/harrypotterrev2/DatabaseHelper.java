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
    public static final int DATABASE_VERSION = 15;
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

        //Movie one
        values.put(COL_PLOT, "This is the tale of Harry Potter, an ordinary 11-year-old boy serving as a sort of slave for his aunt and uncle who learns that he is actually a wizard and has been invited to attend the Hogwarts School for Witchcraft and Wizardry. Harry is snatched away from his mundane existence by Hagrid, the grounds keeper for Hogwarts, and quickly thrown into a world completely foreign to both him and the viewer. Famous for an incident that happened at his birth, Harry makes friends easily at his new school. He soon finds, however, that the wizarding world is far more dangerous for him than he would have imagined, and he quickly learns that not all wizards are ones to be trusted. Written by Carly");
        values.put(COL_TITLE, "Harry Potter and the Sorcerer's Stone");
        values.put(COL_DATE, "16 November 2001 (USA)");
        values.put(COL_RUNTIME, "152 min | 159 min (extended)");
        values.put(COL_TOPQUOTE, "'It does not do to dwell on dreams and forget to live.' — Harry Potter and the Sorcerer's Stone, Dumbledore");
        values.put(COL_GROSS, "$317,557,891 (USA) (17 May 2002)");
        db.insert(MOVIES_TABLE_NAME, null, values);
        //Movie 2
        values = new ContentValues();
        values.put(COL_PLOT, "Forced to spend his summer holidays with his muggle relations, Harry Potter gets a real shock when he gets a surprise visitor: Dobby the house-elf, who warns Harry Potter against returning to Hogwarts, for terrible things are going to happen. Harry decides to ignore Dobby's warning and continues with his pre-arranged schedule. But at Hogwarts, strange and terrible things are indeed happening: Harry is suddenly hearing mysterious voices from inside the walls, muggle-born students are being attacked, and a message scrawled on the wall in blood puts everyone on his/her guard - 'The Chamber Of Secrets Has Been Opened. Enemies Of The Heir, Beware' . Written by Soumitra");
        values.put(COL_TITLE, "Harry Potter and the Chamber of Secrets");
        values.put(COL_DATE, "15 November 2002 (USA)");
        values.put(COL_RUNTIME, " 161 min | 174 min (extended)");
        values.put(COL_TOPQUOTE, "'Why, dear boy, we don't send wizards to Azkaban just for blowing up their aunts.'" +
                "― J.K. Rowling, Harry Potter and the Prisoner of Azkaban, Cornelius Fudge");
        values.put(COL_GROSS, "$249,358,727 (USA) (29 October 2004)");
        db.insert(MOVIES_TABLE_NAME, null, values);
        //Movie 3
        values = new ContentValues();
        values.put(COL_PLOT, "this is the plot2");
        values.put(COL_TITLE, "some title2");
        values.put(COL_DATE, "some date");
        values.put(COL_RUNTIME, "some runtime");
        values.put(COL_TOPQUOTE, "some quote");
        values.put(COL_GROSS, "some gross");
        db.insert(MOVIES_TABLE_NAME, null, values);
        //Movie 4
        values = new ContentValues();
        values.put(COL_PLOT, "this is the plot2");
        values.put(COL_TITLE, "some title2");
        values.put(COL_DATE, "some date");
        values.put(COL_RUNTIME, "some runtime");
        values.put(COL_TOPQUOTE, "some quote");
        values.put(COL_GROSS, "some gross");
        db.insert(MOVIES_TABLE_NAME, null, values);
        //Movie 5
        values = new ContentValues();
        values.put(COL_PLOT, "this is the plot2");
        values.put(COL_TITLE, "some title2");
        values.put(COL_DATE, "some date");
        values.put(COL_RUNTIME, "some runtime");
        values.put(COL_TOPQUOTE, "some quote");
        values.put(COL_GROSS, "some gross");
        db.insert(MOVIES_TABLE_NAME, null, values);
        //Movie 6
        values = new ContentValues();
        values.put(COL_PLOT, "this is the plot2");
        values.put(COL_TITLE, "some title2");
        values.put(COL_DATE, "some date");
        values.put(COL_RUNTIME, "some runtime");
        values.put(COL_TOPQUOTE, "some quote");
        values.put(COL_GROSS, "some gross");
        db.insert(MOVIES_TABLE_NAME, null, values);
        //Movie 7
        values = new ContentValues();
        values.put(COL_PLOT, "this is the plot2");
        values.put(COL_TITLE, "some title2");
        values.put(COL_DATE, "some date");
        values.put(COL_RUNTIME, "some runtime");
        values.put(COL_TOPQUOTE, "some quote");
        values.put(COL_GROSS, "some gross");
        db.insert(MOVIES_TABLE_NAME, null, values);
        //Movie 8
        values = new ContentValues();
        values.put(COL_PLOT, "this is the plot2");
        values.put(COL_TITLE, "some title2");
        values.put(COL_DATE, "some date");
        values.put(COL_RUNTIME, "some runtime");
        values.put(COL_TOPQUOTE, "some quote");
        values.put(COL_GROSS, "some gross");
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