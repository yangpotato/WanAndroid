package com.potato.wanandroid.base.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.airbnb.lottie.LottieAnimationView;
import com.potato.wanandroid.base.presenter.AbstractPresenter;
import com.potato.wanandroid.base.presenter.BasePresenter;

public abstract class BaseActivity<T extends BasePresenter> extends BaseRootActivity<T> {
    private static final int NORMAL_STATE = 0;
    private static final int LOADING_STATE = 1;
    public static final int ERROR_STATE = 2;
    private LottieAnimationView lottieAnimationView;

    @Override
    protected void initEventAndData() {

    }
}
