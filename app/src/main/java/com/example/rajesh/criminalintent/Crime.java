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

    private final UUID mId;

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
    private String mSuspect;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    private String mTitle;

    public String getSuspect() {
        return mSuspect;
    }

    public void setSuspect(String suspect) {
        mSuspect = suspect;
    }

    public Crime() {
        this(UUID.randomUUID());
    }

    public Crime(UUID id) {
        mId = id;
        mDate = new Date();
    }

    public String getPhotoFilename() {
        return "IMG_" + getId().toString() + ".jpg";
    }


}
