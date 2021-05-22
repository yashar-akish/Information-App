package com.company.informationapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.company.informationapp.R;
import com.company.informationapp.adapter.ViewPagerAdapterPlanets;
import com.google.android.material.tabs.TabLayout;

public class PlanetsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planets);

        ViewPagerAdapterPlanets adapter = new ViewPagerAdapterPlanets(
                getSupportFragmentManager(),
                FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        ViewPager planetVP = findViewById(R.id.planetVP);
        TabLayout planetTL = findViewById(R.id.planetTL);

        planetVP.setAdapter(adapter);
        planetTL.setupWithViewPager(planetVP);
    }
}