package com.potato.wanandroid.data.http;


import com.potato.wanandroid.base.view.AbstractView;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;

public abstract class BaseObserver<T> extends DisposableObserver<T> {
    private AbstractView mView;
    private boolean isShowProgress;

    public BaseObserver(AbstractView mView, boolean isShowProgress) {
        this.mView = mView;
        this.isShowProgress = isShowProgress;
    }


    public BaseObserver(AbstractView mView) {
        this(mView, false);
    }

    public BaseObserver(boolean isShowProgress) {
        this.isShowProgress = isShowProgress;
    }

    @Override
    protected void onStart() {
        super.onStart();
        if(isShowProgress && mView != null){
            mView.showProgress();
        }
    }

    @Override
    public void onNext(T t) {
        if(isShowProgress && mView != null){
            mView.cancelProgress();
        }
        onSuccess(t);
    }

    @Override
    public void onError(Throwable e) {
        if(mView != null) {
            mView.cancelProgress();
            mView.showMessage("网络错误");
        }
        mView.showError();
    }

    @Override
    public void onComplete() {
    }

    public abstract void onSuccess(T t);
}
