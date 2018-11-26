package com.potato.wanandroid.contract.login;

import com.potato.wanandroid.base.presenter.AbstractPresenter;
import com.potato.wanandroid.base.view.AbstractView;
import com.potato.wanandroid.data.entity.main.LoginEntity;

public interface LoginContract {
    interface Model {
    }

    interface View extends AbstractView {
        void loginSuccess(LoginEntity entity);

    }

    interface Presenter extends AbstractPresenter<View> {
        void setLoginAccount(String account);

        void setLoginPassword(String password);

        void getLoginData(String account, String password);
    }
}
