package com.potato.wanandroid.contract.home;

import com.potato.wanandroid.base.presenter.AbstractPresenter;
import com.potato.wanandroid.base.view.AbstractView;
import com.potato.wanandroid.data.entity.main.ArticleEntity;
import com.potato.wanandroid.data.entity.main.BannerEntity;

import java.util.List;

public interface HomeContract {
    interface Model {
    }

    interface View extends AbstractView {
        void showArticleList(ArticleEntity entity, boolean refresh);
        void showBannerData(List<BannerEntity> bannerEntities);
    }

    interface Presenter extends AbstractPresenter<View> {
        void getArticleList();
        void loadMore();
        void loadHomeData();
    }
}
