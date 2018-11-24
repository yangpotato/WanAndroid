package com.potato.wanandroid.contract.login;

import com.potato.wanandroid.base.presenter.AbstractPresenter;
import com.potato.wanandroid.base.view.AbstractView;

public interface LoginContract {
    interface Model {
    }

    interface View extends AbstractView {
    }

    interface Presenter extends AbstractPresenter<View> {
        void setLoginAccount(String account);

        void setLoginPassword(String password);
    }
}
