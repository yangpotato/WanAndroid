package com.potato.wanandroid.base.view;

public interface AbstractView {
    void showProgress();
    void cancelProgress();
    void showMessage(String msg);
    void showNormal();
    void showError();
    void showLoading();
    void reload();
}
