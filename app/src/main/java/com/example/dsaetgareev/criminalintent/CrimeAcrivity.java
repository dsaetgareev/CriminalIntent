package com.example.dsaetgareev.criminalintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CrimeAcrivity extends SingleFrameActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
