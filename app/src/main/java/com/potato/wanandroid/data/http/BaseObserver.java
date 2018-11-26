package com.potato.wanandroid.data.http;

import com.potato.wanandroid.base.view.AbstractView;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.ResourceObserver;

public abstract class BaseObserver<T> implements Observer<T> {
    private AbstractView mView;

    public BaseObserver(AbstractView mView) {
        this.mView = mView;
    }

    public BaseObserver() {

    }

    @Override
    public void onError(Throwable e) {
        mView.showMessage(e.toString());
    }

    @Override
    public void onComplete() {

    }

    @Override
    public void onSubscribe(Disposable d) {

    }

}
