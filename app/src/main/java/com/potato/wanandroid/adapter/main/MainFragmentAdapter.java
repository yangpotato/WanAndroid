package com.potato.wanandroid.adapter.main;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.potato.wanandroid.ui.home.HomeFragment;

public class MainFragmentAdapter extends FragmentStatePagerAdapter {
    private String[] titles;

    public MainFragmentAdapter(FragmentManager fm, String ... title) {
        super(fm);
        this.titles = title;
    }

    @Override
    public Fragment getItem(int i) {
        return HomeFragment.newInstance(null, null);
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
