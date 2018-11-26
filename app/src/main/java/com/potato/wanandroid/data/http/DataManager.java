package com.potato.wanandroid.data.http;


import com.potato.wanandroid.data.entity.main.ArticleEntity;
import com.potato.wanandroid.data.entity.main.LoginEntity;

import io.reactivex.Observable;

public class DataManager {
    private ApiServer mApiServer;

    public DataManager(ApiServer apiServer) {
        this.mApiServer = apiServer;;
    }

    public Observable<BaseResponse<ArticleEntity>> getMainArticle(int page){
        return mApiServer.getMainArticle(page);
    }

    public Observable<BaseResponse<LoginEntity>> login(String username, String password) {
        return mApiServer.login(username, password);
    }
}
