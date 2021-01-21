package com.example.myarsiteku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.myarsiteku.FragmenTab45.TabPagerAdapter45;
import com.example.myarsiteku.FragmenTab45.tab_desain45;
import com.example.myarsiteku.FragmenTab45.tab_home45;
import com.example.myarsiteku.FragmenTab45.tab_interior45;
import com.google.android.material.tabs.TabLayout;

import java.util.Arrays;
import java.util.List;

public class Activity2 extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private List<Fragment> fragments;
    private List<String> titles;

    public Activity2(){
        fragments = Arrays.asList(new tab_home45(), new tab_desain45(),
                new tab_interior45());

        titles = Arrays.asList("", "Desain", "Interior");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        TabPagerAdapter45 adapter = new TabPagerAdapter45(getSupportFragmentManager(), fragments, titles);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.home_45);

    }
}