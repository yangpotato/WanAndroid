package com.potato.wanandroid.base.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.potato.wanandroid.app.MyApplaction;
import com.potato.wanandroid.base.presenter.AbstractPresenter;
import com.potato.wanandroid.base.view.AbstractView;
import com.potato.wanandroid.dagger.component.ActivityComponent;
import com.potato.wanandroid.dagger.component.DaggerActivityComponent;
import com.potato.wanandroid.dagger.module.ActivityModule;
import com.potato.wanandroid.utils.CommonUtils;
import com.potato.wanandroid.utils.LogUtil;

import javax.inject.Inject;

public abstract class BaseRootActivity<T extends AbstractPresenter> extends SimpleActivity implements AbstractView{
    @Inject
    protected T mPresenter;
    protected ActivityComponent mActivityComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onViewCreated() {
        if(mPresenter != null){
            mPresenter.attachView(this);
        }
    }

    @Override
    protected void onDestroy() {
        if(mPresenter != null){
            mPresenter.detachView();
            mPresenter = null;
        }
        super.onDestroy();
    }

    @Override
    protected void initActivityComponent() {
        mActivityComponent = DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this))
                .applicationComponent(MyApplaction.getInstance().getApplicationComponent())
                .build();
    }

    @Override
    public void showMessage(String msg) {
        CommonUtils.showMessage(this, msg);
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
