package com.example.rajesh.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Rajesh on 12/21/2016.
 */

public class Crime {

    public UUID getId() {
        return mId;
    }

    private UUID mId;

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    private Date mDate;
    private boolean mSolved;


    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    private String mTitle;

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }


}
