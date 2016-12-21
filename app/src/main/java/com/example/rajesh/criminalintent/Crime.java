package com.example.rajesh.criminalintent;

import java.util.UUID;

/**
 * Created by Rajesh on 12/21/2016.
 */

public class Crime {

    public UUID getId() {
        return mId;
    }

    private UUID mId;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    private String mTitle;

    public Crime() {
        mId = UUID.randomUUID();
    }


}
