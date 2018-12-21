package com.potato.wanandroid.presenter.home;

import com.potato.wanandroid.app.Constants;
import com.potato.wanandroid.base.presenter.BasePresenter;
import com.potato.wanandroid.contract.home.HomeContract;
import com.potato.wanandroid.data.DataManager;
import com.potato.wanandroid.data.entity.main.ArticleEntity;
import com.potato.wanandroid.data.http.BaseObserver;
import com.potato.wanandroid.data.http.BaseResponse;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class HomePresenter extends BasePresenter<HomeContract.View> implements HomeContract.Presenter {
    private DataManager mDataManager;

    @Inject
    public HomePresenter(DataManager dataManager) {
        super(dataManager);
        mDataManager = dataManager;
    }

    @Override
    public void getArticleList(int page) {
        addRxBindingSubscribe(mDataManager.getMainArticle(page)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new BaseObserver<BaseResponse<ArticleEntity>>(mView) {
                    @Override
                    public void onSuccess(BaseResponse<ArticleEntity> articleEntityBaseResponse) {
                        if(articleEntityBaseResponse.getErrorCode() == Constants.SUCCESS)
                            mView.ArticleResult(articleEntityBaseResponse.getData());
                    }
                }));
    }
}
