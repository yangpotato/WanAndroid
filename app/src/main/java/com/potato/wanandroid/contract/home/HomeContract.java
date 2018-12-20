package com.potato.wanandroid.contract.home;

import com.potato.wanandroid.base.presenter.AbstractPresenter;
import com.potato.wanandroid.base.view.AbstractView;

public interface HomeContract {
    interface Model {
    }

    interface View extends AbstractView {
    }

    interface Presenter extends AbstractPresenter<View> {
    }
}
