package com.example.rajesh.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Rajesh on 12/22/2016.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
