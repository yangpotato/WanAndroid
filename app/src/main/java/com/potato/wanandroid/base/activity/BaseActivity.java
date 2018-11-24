package com.potato.wanandroid.base.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;

import com.airbnb.lottie.LottieAnimationView;
import com.potato.wanandroid.R;
import com.potato.wanandroid.base.presenter.AbstractPresenter;
import com.potato.wanandroid.base.presenter.BasePresenter;

public abstract class BaseActivity<T extends BasePresenter> extends BaseRootActivity<T> {
    private static final int NORMAL_STATE = 0;
    private static final int LOADING_STATE = 1;
    public static final int ERROR_STATE = 2;

    private LottieAnimationView mLottieAnimationView;
    private View mNormalView;
    private View mLoadingView, mErrorView;
    private int currentState = NORMAL_STATE;

    @Override
    protected void initUI() {
        mNormalView = findViewById(R.id.normal);
        if(mNormalView == null){
            throw new IllegalStateException(
                    "The subclass of RootActivity must contain a View named 'mNormalView'.");
        }
        if (!(mNormalView.getParent() instanceof ViewGroup)) {
            throw new IllegalStateException(
                    "mNormalView's ParentView should be a ViewGroup.");
        }
        ViewGroup mParent = (ViewGroup) mNormalView.getParent();
        View.inflate(this, R.layout.loading_view, mParent);
        View.inflate(this, R.layout.error_view, mParent);
        mLoadingView = findViewById(R.id.loading_view);
        mErrorView = findViewById(R.id.error_view);
        mErrorView.findViewById(R.id.btn_reload).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reload();
            }
        });
        mLottieAnimationView = mLoadingView.findViewById(R.id.animation_view);
        mErrorView.setVisibility(View.GONE);
        mLoadingView.setVisibility(View.VISIBLE);
        mNormalView.setVisibility(View.GONE);
    }

    @Override
    protected void onDestroy() {
        if(mLottieAnimationView != null){
            mLottieAnimationView.cancelAnimation();
        }
        super.onDestroy();
    }

    @Override
    public void showLoading() {
        super.showLoading();
        if(currentState == LOADING_STATE){
            return;
        }
        hideView();
        currentState = LOADING_STATE;
        mLoadingView.setVisibility(View.VISIBLE);
        mLottieAnimationView.setAnimation("servishero_loading.json");
        mLottieAnimationView.loop(true);
        mLottieAnimationView.playAnimation();

    }

    @Override
    public void showError() {
        super.showError();
        if(currentState == ERROR_STATE){
            return;
        }
        hideView();
        currentState = ERROR_STATE;
        mErrorView.setVisibility(View.VISIBLE);
    }

    @Override
    public void showNormal() {
        super.showNormal();
        if(currentState == NORMAL_STATE){
            return;
        }
        hideView();
        currentState = NORMAL_STATE;
        mNormalView.setVisibility(View.VISIBLE);
    }

    private void hideView(){
        switch (currentState){
            case NORMAL_STATE:
                mNormalView.setVisibility(View.GONE);
                break;
            case LOADING_STATE:
                mLottieAnimationView.cancelAnimation();
                mLoadingView.setVisibility(View.GONE);
                break;
            case ERROR_STATE:
                mErrorView.setVisibility(View.GONE);
                break;
        }
    }
}
