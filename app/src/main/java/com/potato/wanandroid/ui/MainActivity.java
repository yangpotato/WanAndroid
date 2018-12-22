package com.potato.wanandroid.ui;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;

import com.potato.wanandroid.R;
import com.potato.wanandroid.adapter.main.MainFragmentAdapter;
import com.potato.wanandroid.base.activity.BaseActivity;

import butterknife.BindView;
import me.yokeyword.fragmentation.SupportFragment;

public class MainActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.tabLayout)
    TabLayout tabLayout;
    @BindView(R.id.appbar)
    AppBarLayout appbar;
    @BindView(R.id.viewPager)
    ViewPager viewPager;
    @BindView(R.id.coordinator)
    CoordinatorLayout coordinator;
    @BindView(R.id.navigation)
    NavigationView navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SupportFragment mainFragment = findFragment(SupportFragment.class);
        if (mainFragment != null) {
            loadRootFragment(R.id.normal, mainFragment);
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initToolbar() {

    }

    @Override
    protected void initUI() {
        MainFragmentAdapter adapter = new MainFragmentAdapter(getSupportFragmentManager(),
                getString(R.string.home),
                getString(R.string.know),
                getString(R.string.nav),
                getString(R.string.project));
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        viewPager.setOffscreenPageLimit(3);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initInject() {

    }

}
