package com.example.myarsiteku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.myarsiteku.FragmenTab36.TabPagerAdapter36;
import com.example.myarsiteku.FragmenTab36.tab_desain36;
import com.example.myarsiteku.FragmenTab36.tab_home36;
import com.example.myarsiteku.FragmenTab36.tab_interior36;
import com.google.android.material.tabs.TabLayout;

import java.util.Arrays;
import java.util.List;

public class Activity1 extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private List<Fragment> fragments;
    private List<String> titles;

    public Activity1(){
        fragments = Arrays.asList(new tab_home36(), new tab_desain36(),
                new tab_interior36());

        titles = Arrays.asList("", "Desain", "Interior");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        TabPagerAdapter36 adapter = new TabPagerAdapter36(getSupportFragmentManager(), fragments, titles);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.home_36);

    }
}