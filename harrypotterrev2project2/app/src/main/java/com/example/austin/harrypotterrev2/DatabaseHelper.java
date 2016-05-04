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
    public static final int DATABASE_VERSION = 20;
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
        values.put(COL_PLOT, "Harry Potter is having a tough time with his relatives (yet again). He runs away after using magic to inflate Uncle Vernon's sister Marge who was being offensive towards Harry's parents. Initially scared for using magic outside the school, he is pleasantly surprised that he won't be penalized after all. However, he soon learns that a dangerous criminal and Voldemort's trusted aide Sirius Black has escaped from the Azkaban prison and wants to kill Harry to avenge the Dark Lord. To worsen the conditions for Harry, vile creatures called Dementors are appointed to guard the school gates and inexplicably happen to have the most horrible effect on him. Little does Harry know that by the end of this year, many holes in his past (whatever he knows of it) will be filled up and he will have a clearer vision of what the future has in store... Written by Soumitra");
        values.put(COL_TITLE, "Harry Potter and the Prisoner of Azkaban");
        values.put(COL_DATE, "4 June 2004 (USA)");
        values.put(COL_RUNTIME, "142 min");
        values.put(COL_TOPQUOTE, "'Why, dear boy, we don't send wizards to Azkaban just for blowing up their aunts.'\n" +
                "― J.K. Rowling, Harry Potter and the Prisoner of Azkaban, Cornelius Fudge");
        values.put(COL_GROSS, "$249,358,727 (USA) (29 October 2004)");
        db.insert(MOVIES_TABLE_NAME, null, values);
        //Movie 4
        values = new ContentValues();
        values.put(COL_PLOT, "Harry's fourth year at Hogwarts is about to start and he is enjoying the summer vacation with his friends. They get the tickets to The Quidditch World Cup Final but after the match is over, people dressed like Lord Voldemort's 'Death Eaters' set a fire to all the visitors' tents, coupled with the appearance of Voldemort's symbol, the 'Dark Mark' in the sky, which causes a frenzy across the magical community. That same year, Hogwarts is hosting 'The Triwizard Tournament', a magical tournament between three well-known schools of magic : Hogwarts, Beauxbatons and Durmstrang. The contestants have to be above the age of 17, and are chosen by a magical object called Goblet of Fire. On the night of selection, however, the Goblet spews out four names instead of the usual three, with Harry unwittingly being selected as the Fourth Champion. Since the magic cannot be reversed, Harry is forced to go with it and brave three exceedingly difficult tasks. Written by Soumitra");
        values.put(COL_TITLE, "Harry Potter and the Goblet of Fire");
        values.put(COL_DATE, "18 November 2005 (USA)");
        values.put(COL_RUNTIME, "157 min");
        values.put(COL_TOPQUOTE, "'Just then Neville caused a slight diversion by turning into a large canary.'\n" +
                "― J.K. Rowling, Harry Potter and the Goblet of Fire");
        values.put(COL_GROSS, " $289,994,397 (USA) (31 March 2006)");
        db.insert(MOVIES_TABLE_NAME, null, values);
        //Movie 5
        values = new ContentValues();
        values.put(COL_PLOT, "After a lonely summer on Privet Drive, Harry returns to a Hogwarts full of ill-fortune. Few of students and parents believe him or Dumbledore that Voldemort is really back. The ministry had decided to step in by appointing a new Defence Against the Dark Arts teacher that proves to be the nastiest person Harry has ever encountered. Harry also can't help stealing glances with the beautiful Cho Chang. To top it off are dreams that Harry can't explain, and a mystery behind something Voldemort is searching for. With these many things Harry begins one of his toughest years at Hogwarts School of Witchcraft and Wizardry. Written by HPfan\n");
        values.put(COL_TITLE, "Harry Potter and the Order of the Phoenix");
        values.put(COL_DATE, "11 July 2007 (USA)");
        values.put(COL_RUNTIME, "138 min");
        values.put(COL_TOPQUOTE, "'You know, Minister, I disagree with Dumbledore on many counts...but you cannot deny he's got style...'\n" +
                "― J.K. Rowling, Harry Potter and the Order of the Phoenix, Kingsley Shacklebolt");
        values.put(COL_GROSS, "$292,000,866 (USA) (7 December 2007)");
        db.insert(MOVIES_TABLE_NAME, null, values);
        //Movie 6
        values = new ContentValues();
        values.put(COL_PLOT, "In the sixth year at Hogwarts School of Witchcraft, and in both wizard and muggle worlds Lord Voldemort and his henchmen are increasingly active. With vacancies to fill at Hogwarts, Professor Dumbledore persuades Horace Slughorn, back from retirement to become the potions teacher, while Professor Snape receives long awaited news. Harry Potter, together with Dumbledore, must face treacherous tasks to defeat his evil nemesis. Written by IMDb Editors");
        values.put(COL_TITLE, "Harry Potter and the Half Blood Prince");
        values.put(COL_DATE, "15 July 2009 (USA)");
        values.put(COL_RUNTIME, "153 min");
        values.put(COL_TOPQUOTE, "'Harry was left to ponder in silence the depths to which girls would sink to get revenge.' \n" +
                "― J.K. Rowling, Harry Potter and the Half-Blood Prince\n");
        values.put(COL_GROSS, "$301,956,980 (USA) (11 December 2009)");
        db.insert(MOVIES_TABLE_NAME, null, values);
        //Movie 7
        values = new ContentValues();
        values.put(COL_PLOT, "Voldemort's power is growing stronger. He now has control over the Ministry of Magic and Hogwarts. Harry, Ron, and Hermione decide to finish Dumbledore's work and find the rest of the Horcruxes to defeat the Dark Lord. But little hope remains for the Trio, and the rest of the Wizarding World, so everything they do must go as planned. Written by Chris Green");
        values.put(COL_TITLE, "Harry Potter and the Deathly Hallows part 2");
        values.put(COL_DATE, "19 November 2010 (USA)");
        values.put(COL_RUNTIME, " 146 min");
        values.put(COL_TOPQUOTE, "'Not my daughter, you bitch!'\n" +
                "― J.K. Rowling, Harry Potter and the Deathly Hallows, Mrs. Weasley");
        values.put(COL_GROSS, "$294,980,434 (USA) (1 April 2011)");
        db.insert(MOVIES_TABLE_NAME, null, values);
        //Movie 8
        values = new ContentValues();
        values.put(COL_PLOT, "Harry, Ron, and Hermione continue their quest of finding and destroying the Dark Lord's three remaining Horcruxes, the magical items responsible for his immortality. But as the mystical Deathly Hallows are uncovered, and Voldemort finds out about their mission, the biggest battle begins and life as they know it will never be the same again. Written by Jordan");
        values.put(COL_TITLE, "Harry Potter and the Deathly Hallows Part 1");
        values.put(COL_DATE, "15 July 2011 (USA)");
        values.put(COL_RUNTIME, "130 min");
        values.put(COL_TOPQUOTE, "'I'm holey!' says George\n" +
                "'Holey? You have the the whole world of ear-related humor before you, you go for holey?'\n" +
                "― J.K. Rowling, Harry Potter and the Deathly Hallows, Fred");
        values.put(COL_GROSS, "$380,955,619 (USA) (11 November 2011)");
        db.insert(MOVIES_TABLE_NAME, null, values);
    }

    public Cursor listMovies(){

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(
                MOVIES_TABLE_NAME, // a. table
                new String[]{COL_ID, COL_TITLE, COL_PLOT, COL_DATE, COL_RUNTIME, COL_TOPQUOTE, COL_GROSS}, // b. column names
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
                COL_PLOT + " LIKE ? or " + COL_TITLE + " LIKE ? " + COL_DATE + " LIKE ? " + COL_RUNTIME + " LIKE ? " + COL_TOPQUOTE + " LIKE ? " + COL_GROSS + " LIKE ? " , // c. selections //or // or
                new String[]{query + "%", query + "%", query + "%", query + "%", query + "%", query + "%"}, // d. selections args
                null, // e. group by
                null, // f. having
                null, // g. order by
                null); // h. limit

        DatabaseUtils.dumpCursor(cursor);

        return cursor;
    }


}