package com.potato.wanandroid.base.view;

public interface AbstractView {
    void showMessage(String msg);
    void showNormal();
    void showError();
    void showLoading();
    void reload();
}
