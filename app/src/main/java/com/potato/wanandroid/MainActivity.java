package com.potato.wanandroid;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.potato.wanandroid.base.activity.BaseActivity;

import butterknife.BindView;
import me.yokeyword.fragmentation.SupportFragment;

public class MainActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.normal)
    FrameLayout normal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SupportFragment mainFragment = findFragment(SupportFragment.class);
        if(mainFragment != null){
            loadRootFragment(R.id.normal, mainFragment);
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initToolbar() {
        setSupportActionBar(toolbar);
    }

    @Override
    protected void initEventAndData() {
        super.initEventAndData();

    }
}
