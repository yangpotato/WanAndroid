package com.potato.wanandroid.base.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import me.yokeyword.fragmentation.SupportActivity;

public abstract class SimpleActivity extends SupportActivity {
    private Unbinder unbinder;
    protected SimpleActivity activity;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        unbinder = ButterKnife.bind(this);
        activity = this;
        onViewCreated();
        initToolbar();
        initEventAndData();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(unbinder != null){
            unbinder.unbind();
            unbinder = null;
        }
    }

    /**
     * Activity的布局
     * @return 布局ID
     */
    protected abstract int getLayoutId();

    /**
     * 初始化toolbar
     */
    protected abstract void initToolbar();

    /**
     * 初始化
     */
    protected abstract void initEventAndData();


    /**
     * 在initEventAndData()之前执行
     */
    protected abstract void onViewCreated();
}
