package com.potato.wanandroid.base.presenter;

import com.potato.wanandroid.base.view.AbstractView;

import io.reactivex.disposables.Disposable;

public interface AbstractPresenter<T extends AbstractView> {
    /**
     * 注入View
     *
     * @param view view
     */
    void attachView(T view);

    /**
     * 回收View
     */
    void detachView();

    /**
     * Add rxBing subscribe manager
     *
     * @param disposable Disposable
     */
    void addRxBindingSubscribe(Disposable disposable);
}
