package com.example.myarsiteku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;


import com.example.myarsiteku.FragmenTab120.TabPagerAdapter120;
import com.example.myarsiteku.FragmenTab120.tab_desain120;
import com.example.myarsiteku.FragmenTab120.tab_home120;
import com.example.myarsiteku.FragmenTab120.tab_interior120;
import com.google.android.material.tabs.TabLayout;

import java.util.Arrays;
import java.util.List;

public class Activity6 extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private List<Fragment> fragments;
    private List<String> titles;

    public Activity6(){
        fragments = Arrays.asList(new tab_home120(), new tab_desain120(),
                 new tab_interior120());

        titles = Arrays.asList("", "Desain", "Interior");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        TabPagerAdapter120 adapter = new TabPagerAdapter120(getSupportFragmentManager(), fragments, titles);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.home_120);

    }
}