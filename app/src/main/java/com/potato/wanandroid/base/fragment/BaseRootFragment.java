package com.potato.wanandroid.base.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.potato.wanandroid.app.MyApplaction;
import com.potato.wanandroid.base.presenter.AbstractPresenter;
import com.potato.wanandroid.base.view.AbstractView;

import com.potato.wanandroid.dagger.component.DaggerFragmentComponent;
import com.potato.wanandroid.dagger.component.FragmentComponent;
import com.potato.wanandroid.dagger.module.FragmentModule;
import com.potato.wanandroid.utils.CommonUtils;
import com.potato.wanandroid.utils.LogUtil;

import javax.inject.Inject;

import static com.potato.wanandroid.app.Constants.ARG_PARAM1;
import static com.potato.wanandroid.app.Constants.ARG_PARAM2;

public abstract class BaseRootFragment<T extends AbstractPresenter> extends SimpleFragment implements AbstractView {
    @Inject
    protected T mPresenter;
    protected FragmentComponent mFragmentComponent;

    public String mParam1;
    public String mParam2;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if(mPresenter != null){
            mPresenter.attachView(this);
        }
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public void onDestroyView() {
        if(mPresenter != null){
            mPresenter.detachView();
            mPresenter = null;
        }
        super.onDestroyView();
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = activity;
    }

    @Override
    protected void initFragmentComponent() {
        mFragmentComponent = DaggerFragmentComponent.builder()
                .applicationComponent(MyApplaction.getInstance().getApplicationComponent())
                .fragmentModule(new FragmentModule(this))
                .build();
    }

    @Override
    public void showMessage(String msg) {
        CommonUtils.showMessage(activity, msg);
        LogUtil.v(msg);
    }

    @Override
    public void showNormal() {

    }

    @Override
    public void showError() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void reload() {

    }
}
