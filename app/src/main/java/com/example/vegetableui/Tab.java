package com.example.vegetableui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class Tab extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    VPAdapter vpAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        tabLayout=findViewById(R.id.tablayout);
        viewPager=findViewById(R.id.viewpager);
        vpAdapter =new VPAdapter(getSupportFragmentManager());
        //Add Fragment Here

        vpAdapter.addFragment(new VegetableFragment(),"Vegetable");
        vpAdapter.addFragment(new FruitFragment(),"Fruit");

        viewPager.setAdapter(vpAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}