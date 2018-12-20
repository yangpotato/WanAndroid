package com.potato.wanandroid.base.fragment;

import android.app.ProgressDialog;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.airbnb.lottie.LottieAnimationView;
import com.potato.wanandroid.R;
import com.potato.wanandroid.app.Constants;
import com.potato.wanandroid.base.presenter.BasePresenter;
import com.potato.wanandroid.utils.CommonUtils;
import com.potato.wanandroid.utils.JumpUtil;


public abstract class BaseFragment<T extends BasePresenter> extends BaseRootFragment<T> {
    private static final int NORMAL_STATE = 0;
    private static final int LOADING_STATE = 1;
    public static final int ERROR_STATE = 2;

//    private LottieAnimationView mLottieAnimationView;
    private ProgressBar mProgressBar;
    private View mNormalView;
    private View mLoadingView, mErrorView;
    private int currentState = NORMAL_STATE;
    private ProgressDialog mProgressDialog;
    @Override
    protected void initViewStatu() {
        mProgressDialog = new ProgressDialog(activity);
        mProgressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        if(getView() == null)
            return;
        mNormalView = getView().findViewById(R.id.normal);
        if(mNormalView != null) {
            if (mNormalView == null) {
                throw new IllegalStateException(
                        "The subclass of RootActivity must contain a View named 'mNormalView'.");
            }
            if (!(mNormalView.getParent() instanceof ViewGroup)) {
                throw new IllegalStateException(
                        "mNormalView's ParentView should be a ViewGroup.");
            }
            ViewGroup mParent = (ViewGroup) mNormalView.getParent();
            View.inflate(activity, R.layout.loading_view, mParent);
            View.inflate(activity, R.layout.error_view, mParent);
            mLoadingView = getView().findViewById(R.id.loading_view);
            mErrorView =  getView().findViewById(R.id.error_view);
            mErrorView.findViewById(R.id.btn_reload).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    reload();
                }
            });
//            mLottieAnimationView = mLoadingView.findViewById(R.id.animation_view);
            mProgressBar = mLoadingView.findViewById(R.id.progress_bar);
            mErrorView.setVisibility(View.GONE);
            mLoadingView.setVisibility(View.VISIBLE);
            mNormalView.setVisibility(View.GONE);
        }
    }

    @Override
    public void onDestroyView() {
//        if(mLottieAnimationView != null){
//            mLottieAnimationView.cancelAnimation();
//        }

        super.onDestroyView();
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
//        mLottieAnimationView.setAnimation("loading_animation.json");
//        mLottieAnimationView.loop(true);
//        mLottieAnimationView.playAnimation();

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
//                mLottieAnimationView.cancelAnimation();
                mLoadingView.setVisibility(View.GONE);
                break;
            case ERROR_STATE:
                mErrorView.setVisibility(View.GONE);
                break;
        }
    }


    public void showProgressDialog(String str){
        mProgressDialog.setMessage(str);
        mProgressDialog.setCancelable(true);
        mProgressDialog.setCanceledOnTouchOutside(false);
        mProgressDialog.show();
    }

    public void showProgressDialog(){
        showProgressDialog("加载中");
    }

    public void cancelProgressDialog(){
        if (mProgressDialog != null)
            if (mProgressDialog.isShowing()) {
                mProgressDialog.dismiss();
            }
    }

    @Override
    public void showProgress() {
        showProgressDialog();
    }

    @Override
    public void cancelProgress() {
        cancelProgressDialog();
    }


}
