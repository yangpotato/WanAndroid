package com.potato.wanandroid.base.fragment;

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

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutId(), container, false);
        mUnbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if(mUnbinder != null){
            mUnbinder.unbind();
            mUnbinder = null;
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
