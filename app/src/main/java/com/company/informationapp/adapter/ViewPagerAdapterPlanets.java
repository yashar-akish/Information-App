package com.company.informationapp.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.company.informationapp.fragments.FragmentEarth;
import com.company.informationapp.fragments.FragmentJupiter;
import com.company.informationapp.fragments.FragmentSaturn;

public class ViewPagerAdapterPlanets extends FragmentPagerAdapter {
    public ViewPagerAdapterPlanets(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FragmentEarth();
            case 1:
                return new FragmentJupiter();
            case 2:
                return new FragmentSaturn();
            default:
                return new Fragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Earth";
            case 1:
                return "Jupiter";
            case 2:
                return "Saturn";
            default:
                return "Blank";
        }
    }
}
