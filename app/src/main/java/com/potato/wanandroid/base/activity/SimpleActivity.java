package com.potato.wanandroid.base.activity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.WindowManager;

import com.potato.wanandroid.R;
import com.potato.wanandroid.app.MyApplaction;


import butterknife.ButterKnife;
import butterknife.Unbinder;
import me.yokeyword.fragmentation.SupportActivity;

public abstract class SimpleActivity extends SupportActivity {
    private Unbinder unbinder;
    protected SimpleActivity activity;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(isTransparent()) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
        setContentView(getLayoutId());
        unbinder = ButterKnife.bind(this);
        activity = this;
//        ScreenAutoUtil.setCustomDensity(activity, MyApplaction.getInstance());
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        initActivityComponent();
        initInject();
        onViewCreated();
        initData();
        initViewStatu();
        initToolbar();
        initUI();
    }

    protected boolean isTransparent(){
        return false;
    };

    protected abstract void initActivityComponent();

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
     * Dagger依赖注入
     */
    protected abstract void initInject();

    /**
     * 初始化toolbar
     */
    protected abstract void initToolbar();

    /**
     * 初始化布局状态
     */
    protected abstract void initViewStatu();

    /**
     * 初始化
     */
    protected abstract void initUI();
    /**
     * 初始化
     */
    protected abstract void initData();


    /**
     * 在initEventAndData()之前执行
     */
    protected abstract void onViewCreated();
}
