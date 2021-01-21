package com.example.myarsiteku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;


import com.example.myarsiteku.FragmenTab54.TabPagerAdapter54;
import com.example.myarsiteku.FragmenTab54.tab_desain54;
import com.example.myarsiteku.FragmenTab54.tab_home54;
import com.example.myarsiteku.FragmenTab54.tab_interior54;
import com.google.android.material.tabs.TabLayout;

import java.util.Arrays;
import java.util.List;

public class Activity3 extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private List<Fragment> fragments;
    private List<String> titles;

    public Activity3(){
        fragments = Arrays.asList(new tab_home54(), new tab_desain54(),
                new tab_interior54());

        titles = Arrays.asList("", "Desain", "Interior");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        TabPagerAdapter54 adapter = new TabPagerAdapter54(getSupportFragmentManager(), fragments, titles);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.home_54);

    }
}