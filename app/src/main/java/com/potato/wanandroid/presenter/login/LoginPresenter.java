package com.potato.wanandroid.presenter.login;

import com.potato.wanandroid.base.presenter.BasePresenter;
import com.potato.wanandroid.contract.login.LoginContract;
import com.potato.wanandroid.data.http.DataManager;

import io.reactivex.disposables.Disposable;

public class LoginPresenter extends BasePresenter<LoginContract.View> implements LoginContract.Presenter {
    public LoginPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void setLoginAccount(String account) {

    }

    @Override
    public void setLoginPassword(String password) {

    }

    @Override
    public void attachView(LoginContract.View view) {

    }

    @Override
    public void detachView() {

    }

    @Override
    public void addRxBindingSubscribe(Disposable disposable) {

    }
}
