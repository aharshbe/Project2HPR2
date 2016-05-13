package com.example.austin.harrypotterrev2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by austin on 5/12/16.
 */
public class OpenHelper2 extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "books.db";

    //Creating variables for each of the columns
    public static final String BOOKS_TABLE_NAME = "booksDescription";
    public static final String COL_ID = "_id";
    public static final String COL_COVER = "cover";
    public static final String COL_PLOT = "plot";
    public static final String COL_DATE = "date";
    public static final String COL_PAGES = "pages";
    public static final String COL_TOPQUOTE = "topquote";
    public static final String COL_FAV_CHAR = "char";
    public static final String COL_TITLE = "title";




    public static final String[] BOOKS_COLUMNS = {COL_ID, COL_TITLE, COL_COVER, COL_PLOT, COL_DATE, COL_PAGES, COL_TOPQUOTE, COL_FAV_CHAR};


    private static final String CREATE_BOOKS_TABLE =
            "CREATE TABLE " + BOOKS_TABLE_NAME +
                    "(" +
                    COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COL_TITLE + " TEXT, " +
                    COL_COVER + " TEXT, " +
                    COL_DATE + " TEXT, " +
                    COL_FAV_CHAR + " TEXT, " +
                    COL_TOPQUOTE + " TEXT, " +
                    COL_PAGES + " TEXT, " +
                    COL_PLOT + " TEXT )";


    private static OpenHelper instance;

    public static OpenHelper getInstance(Context context) {
        if (instance == null) {
            instance = new OpenHelper(context);
        }
        return instance;
    }

    public OpenHelper2(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_BOOKS_TABLE);
        setDefaultData(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + BOOKS_TABLE_NAME);
        this.onCreate(db);
    }

    public void setDefaultData(SQLiteDatabase db) {
        ContentValues values = new ContentValues();

        //Book one
        values.put(COL_PLOT, "");
        values.put(COL_TITLE, "");
        values.put(COL_COVER, "");
        values.put(COL_DATE, "");
        values.put(COL_FAV_CHAR, "");
        values.put(COL_TOPQUOTE, "");
        values.put(COL_PAGES, "");
        db.insert(BOOKS_TABLE_NAME, null, values);
        //Book 2
        values = new ContentValues();
        values.put(COL_PLOT, "");
        values.put(COL_TITLE, "");
        values.put(COL_COVER, "");
        values.put(COL_DATE, "");
        values.put(COL_FAV_CHAR, "");
        values.put(COL_TOPQUOTE, "");
        values.put(COL_PAGES, "");
        db.insert(BOOKS_TABLE_NAME, null, values);
        //Book 3
        values = new ContentValues();
        values.put(COL_PLOT, "");
        values.put(COL_COVER, "");
        values.put(COL_DATE, "");
        values.put(COL_FAV_CHAR, "");
        values.put(COL_TOPQUOTE, "");
        values.put(COL_PAGES, "");
        db.insert(BOOKS_TABLE_NAME, null, values);
        //Book 4
        values = new ContentValues();
        values.put(COL_PLOT, "");
        values.put(COL_COVER, "");
        values.put(COL_DATE, "");
        values.put(COL_FAV_CHAR, "");
        values.put(COL_TOPQUOTE, "");
        values.put(COL_PAGES, "");
        db.insert(BOOKS_TABLE_NAME, null, values);
        //Book 5
        values = new ContentValues();
        values.put(COL_PLOT, "");
        values.put(COL_TITLE, "");
        values.put(COL_COVER, "");
        values.put(COL_DATE, "");
        values.put(COL_FAV_CHAR, "");
        values.put(COL_TOPQUOTE, "");
        values.put(COL_PAGES, "");
        db.insert(BOOKS_TABLE_NAME, null, values);
        //Book 6
        values = new ContentValues();
        values.put(COL_PLOT, "");
        values.put(COL_TITLE, "");
        values.put(COL_COVER, "");
        values.put(COL_DATE, "");
        values.put(COL_FAV_CHAR, "");
        values.put(COL_TOPQUOTE, "");
        values.put(COL_PAGES, "");
        db.insert(BOOKS_TABLE_NAME, null, values);
        //Book 7
        values = new ContentValues();
        values.put(COL_PLOT, "");
        values.put(COL_TITLE, "");
        values.put(COL_COVER, "");
        values.put(COL_DATE, "");
        values.put(COL_FAV_CHAR, "");
        values.put(COL_TOPQUOTE, "");
        values.put(COL_PAGES, "");
        db.insert(BOOKS_TABLE_NAME, null, values);
        //Book 8
        values = new ContentValues();
        values.put(COL_PLOT, "");
        values.put(COL_TITLE, "");
        values.put(COL_COVER, "");
        values.put(COL_DATE, "");
        values.put(COL_FAV_CHAR, "");
        values.put(COL_TOPQUOTE, "");
        values.put(COL_PAGES, "");
        db.insert(BOOKS_TABLE_NAME, null, values);

    }

    public Cursor listBooks() {

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(
                BOOKS_TABLE_NAME, // a. table
                new String[]{COL_ID, COL_TITLE, COL_COVER, COL_PLOT, COL_DATE, COL_FAV_CHAR, COL_TOPQUOTE, COL_PAGES}, // b. column names
                null, // c. selections //or // or
                null, // d. selections args
                null, // e. group by
                null, // f. having
                null, // g. order by
                null); // h. limit

        //Just creates a dump so I can reference what is being sourced from the database in the console

        DatabaseUtils.dumpCursor(cursor);

        return cursor;
    }

    public Cursor searchBooks(String query) {

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(
                BOOKS_TABLE_NAME, // a. table
                BOOKS_COLUMNS, // b. column names
                COL_PLOT + " LIKE ? or " + COL_COVER + " LIKE ? or " + COL_TITLE + " LIKE ? or " + COL_DATE + " LIKE ? or " + COL_FAV_CHAR + " LIKE ? or " + COL_TOPQUOTE + " LIKE ? or " + COL_PAGES + " LIKE ? ", // c. selections //or // or
                new String[]{"%" + query + "%", "%" + query + "%", "%" + query + "%", "%" + query + "%", "%" + query + "%", "%" + query + "%"}, // d. selections args
                null, // e. group by
                null, // f. having
                null, // g. order by
                null); // h. limit

        //Just creates a dump so I can reference what is being sourced from the database in the console

        DatabaseUtils.dumpCursor(cursor);

        return cursor;
    }
}
