package com.example.myarsiteku.FragmenTab120;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class TabPagerAdapter120 extends FragmentPagerAdapter {

    private List<Fragment> fragments;
    private List<String> titles;

    public TabPagerAdapter120(@NonNull FragmentManager fm) {
        super(fm);
    }

    public TabPagerAdapter120(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public TabPagerAdapter120(@NonNull FragmentManager fm, List<Fragment> fragments, List<String> titles) {
        super(fm);
        this.fragments = fragments;
        this.titles = titles;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }
}

