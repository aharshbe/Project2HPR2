package com.example.austin.harrypotterrev2;

/**
 * Created by austin on 5/3/16.
 */

//Creates an object class that defines global variables and the getters/setters for refernce on the main activity.

//Global variables
public class Movie {
    private String mTitle;
    private String mPlot;
    private String mDate;
    private String mRuntime;
    private String mQuote;
    private String mGross;
    private String mId;

    //Getters and setters

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmPlot() {
        return mPlot;
    }

    public void setmPlot(String mPlot) {
        this.mPlot = mPlot;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public String getmRuntime() {
        return mRuntime;
    }

    public void setmRuntime(String mRuntime) {
        this.mRuntime = mRuntime;
    }

    public String getmQuote() {
        return mQuote;
    }

    public void setmQuote(String mQuote) {
        this.mQuote = mQuote;
    }

    public String getmGross() {
        return mGross;
    }

    public void setmGross(String mGross) {
        this.mGross = mGross;
    }
}
