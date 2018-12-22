package com.potato.wanandroid.data;


import com.potato.wanandroid.data.entity.main.ArticleEntity;
import com.potato.wanandroid.data.entity.main.BannerEntity;
import com.potato.wanandroid.data.entity.main.LoginEntity;
import com.potato.wanandroid.data.http.ApiServer;
import com.potato.wanandroid.data.http.BaseResponse;
import com.potato.wanandroid.data.http.HttpHelper;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;

public class DataManager {
    private ApiServer mApiServer;

    @Inject
    public DataManager(ApiServer apiServer) {
        this.mApiServer = apiServer;;
    }

    //首页文章
    public Observable<BaseResponse<ArticleEntity>> getMainArticle(int page){
        return mApiServer.getMainArticle(page);
    }

    //首页Banner
    public Observable<BaseResponse<List<BannerEntity>>> getHomeBanner(){
        return mApiServer.getHomeBanner();
    }

    public Observable<BaseResponse<LoginEntity>> login(String username, String password) {
        return mApiServer.login(username, password);
    }
}
