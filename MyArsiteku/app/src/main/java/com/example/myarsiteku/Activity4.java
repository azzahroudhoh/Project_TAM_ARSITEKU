package com.example.myarsiteku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;


import com.example.myarsiteku.FragmenTab60.TabPagerAdapter60;
import com.example.myarsiteku.FragmenTab60.tab_desain60;
import com.example.myarsiteku.FragmenTab60.tab_home60;
import com.example.myarsiteku.FragmenTab60.tab_interior60;
import com.google.android.material.tabs.TabLayout;

import java.util.Arrays;
import java.util.List;

public class Activity4 extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private List<Fragment> fragments;
    private List<String> titles;

    public Activity4(){
        fragments = Arrays.asList(new tab_home60(), new tab_desain60(),
                new tab_interior60());

        titles = Arrays.asList("", "Desain", "Interior");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        TabPagerAdapter60 adapter = new TabPagerAdapter60(getSupportFragmentManager(), fragments, titles);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.home_60);

    }
}