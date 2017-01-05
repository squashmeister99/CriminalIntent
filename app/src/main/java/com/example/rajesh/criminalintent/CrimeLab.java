package com.example.rajesh.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Rajesh on 12/22/2016.
 */
public class CrimeLab {
    private static CrimeLab sCrimeLab;

    public List<Crime> getCrimes() {
        return mCrimes;
    }

    private List<Crime> mCrimes;

    public Crime getCrime(UUID id) {
        for(Crime crime : mCrimes) {
            if(crime.getId().equals(id)) {
                return crime;
            }
        }

        return null;
    }
    public void addCrime(Crime c) {
        mCrimes.add(c);
    }

    public static CrimeLab getInstance(Context context) {
        if(sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();
    }
}
