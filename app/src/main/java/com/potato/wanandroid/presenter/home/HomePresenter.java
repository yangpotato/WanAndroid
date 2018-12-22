package com.potato.wanandroid.presenter.home;

import android.support.annotation.NonNull;

import com.potato.wanandroid.app.Constants;
import com.potato.wanandroid.base.presenter.BasePresenter;
import com.potato.wanandroid.contract.home.HomeContract;
import com.potato.wanandroid.data.DataManager;
import com.potato.wanandroid.data.entity.main.ArticleEntity;
import com.potato.wanandroid.data.entity.main.BannerEntity;
import com.potato.wanandroid.data.http.BaseObserver;
import com.potato.wanandroid.data.http.BaseResponse;
import com.potato.wanandroid.utils.RxUtil;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function3;
import io.reactivex.schedulers.Schedulers;

public class HomePresenter extends BasePresenter<HomeContract.View> implements HomeContract.Presenter {
    private DataManager mDataManager;
    private int mCurrentPage = 0;

    @Inject
    public HomePresenter(DataManager dataManager) {
        super(dataManager);
        mDataManager = dataManager;
    }

    @Override
    public void getArticleList() {

    }

    @Override
    public void loadMore() {
        mCurrentPage ++;
        addSubscribe(mDataManager.getMainArticle(mCurrentPage)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .compose(RxUtil.<ArticleEntity>handleResult())
                .subscribeWith(new BaseObserver<ArticleEntity>(mView) {
                    @Override
                    public void onSuccess(ArticleEntity entity) {
                            mView.showArticleList(entity, false);
                    }
                }));
    }

    @Override
    public void loadHomeData() {
        mCurrentPage = 0;
        Observable<BaseResponse<ArticleEntity>> mArticleObservable = mDataManager.getMainArticle(mCurrentPage);
        Observable<BaseResponse<List<BannerEntity>>> mBannerObservable = mDataManager.getHomeBanner();
        addSubscribe(Observable.zip(mArticleObservable, mBannerObservable, new BiFunction<BaseResponse<ArticleEntity>, BaseResponse<List<BannerEntity>>, HashMap<String, Object>>(){
            @Override
            public HashMap<String, Object> apply(BaseResponse<ArticleEntity> articleEntityBaseResponse, BaseResponse<List<BannerEntity>> listBaseResponse) throws Exception {
                return HomePresenter.this.createResponseMap(articleEntityBaseResponse, listBaseResponse);
            }
        })
        .observeOn(AndroidSchedulers.mainThread())
        .subscribeOn(Schedulers.io())
        .subscribeWith(new BaseObserver<HashMap<String, Object>>(mView) {
            @Override
            public void onSuccess(HashMap<String, Object> map) {
                BaseResponse<ArticleEntity> mArticleResponse = (BaseResponse<ArticleEntity>) map.get(Constants.ARTICLE_DATA);
                if(mArticleResponse != null ) {
                    if (mArticleResponse.getErrorCode() == Constants.SUCCESS)
                        mView.showArticleList(mArticleResponse.getData(), true);
                    else
                        mView.showError();
                }

                BaseResponse<List<BannerEntity>> mBannerResponse = (BaseResponse<List<BannerEntity>>) map.get(Constants.BANNER_DATA);
                if(mBannerResponse != null){
                    if(mBannerResponse.getErrorCode() == Constants.SUCCESS)
                        mView.showBannerData(mBannerResponse.getData());
                    else
                        mView.showError();
                }
                mView.showNormal();
            }
        }));
    }


    @NonNull
    private HashMap<String, Object> createResponseMap(BaseResponse<ArticleEntity> loginResponse,
                                                      BaseResponse<List<BannerEntity>> bannerResponse) {
        HashMap<String, Object> map = new HashMap<>(2);
        map.put(Constants.ARTICLE_DATA, loginResponse);
        map.put(Constants.BANNER_DATA, bannerResponse);
        return map;
    }
}
