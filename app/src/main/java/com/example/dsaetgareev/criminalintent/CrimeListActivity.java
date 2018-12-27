package com.example.dsaetgareev.criminalintent;

import android.support.v4.app.Fragment;

public class CrimeListActivity extends SingleFrameActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
