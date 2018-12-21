package com.potato.wanandroid.contract.home;

import com.potato.wanandroid.base.presenter.AbstractPresenter;
import com.potato.wanandroid.base.view.AbstractView;
import com.potato.wanandroid.data.entity.main.ArticleEntity;

public interface HomeContract {
    interface Model {
    }

    interface View extends AbstractView {
        void ArticleResult(ArticleEntity entity);
    }

    interface Presenter extends AbstractPresenter<View> {
        void getArticleList(int page);
    }
}
