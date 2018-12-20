package com.potato.wanandroid.base.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import me.yokeyword.fragmentation.SupportFragment;

public abstract class SimpleFragment extends SupportFragment {
    private Unbinder mUnbinder;
    protected Activity activity;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutId(), container, false);
        mUnbinder = ButterKnife.bind(this, view);
        activity = getActivity();
        initFragmentComponent();
        initInject();
        return view;
    }

    @Override
    public void onDestroy() {
        if(mUnbinder != null){
            mUnbinder.unbind();
            mUnbinder = null;
        }
        super.onDestroy();
    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        initViewStatu();
        initData();
        initToolbar();
        initUI();
    }


    protected abstract void initViewStatu();

    protected abstract void initFragmentComponent();

    /**
     * Activity的布局
     * @return 布局ID
     */
    protected abstract int getLayoutId();

    protected abstract void initInject();
    /**
     * 初始化
     */
    protected abstract void initUI();
    /**
     * 初始化
     */
    protected abstract void initData();


    /**
     * 初始化toolbar
     */
    protected abstract void initToolbar();




}
