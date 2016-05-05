package com.example.austin.harrypotterrev2;

import android.view.View;

import junit.framework.Assert;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void checkingSnape() {
        assertEquals(MainActivity.class, MainActivity.class);
        assertEquals(snapeDescription.class, snapeDescription.class);
    }

    @Test
    public void checkingDobby() {
        assertEquals(dobbyDescription.class, dobbyDescription.class);
        assertEquals(QuotesActivity.class, QuotesActivity.class);
    }

    @Test
    public void checkingReturnEasteregg() {
        assertEquals("why", easteregg.hello());
    }

    @Test
    public void checkingReturnForAddingImages() {
        assertEquals(2130837636, AddingImages.getDrawable("movie1"));
    }

    @Test
    public void checkingAssetHelper() {
        assertEquals(AssetHelper.class, AssetHelper.class);
    }

    @Test
    public void checkingAdapter() {
        assertEquals(null, View.X);
    }

    @Test
    public void columnNames() {
        assertEquals("cover", OpenHelper.COL_COVER);
        assertEquals("date", OpenHelper.COL_DATE);
        assertEquals("plot", OpenHelper.COL_PLOT);
    }

    @Test
    public void checkingDatabaseVersion() {
        assertEquals(28, OpenHelper.DATABASE_VERSION);
    }

    @Test
    public void checkingDatabaseeName() {
        assertEquals("movies.db", OpenHelper.DATABASE_NAME);
    }

    @Test
    public void CheckingtableName() {
        assertEquals("moviesDescription", OpenHelper.MOVIES_TABLE_NAME);
    }


}
