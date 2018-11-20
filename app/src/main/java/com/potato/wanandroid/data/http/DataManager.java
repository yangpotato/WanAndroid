package com.potato.wanandroid.data.http;

import android.content.Context;
import android.database.Observable;

import com.potato.wanandroid.data.entity.BaseResponse;
import com.potato.wanandroid.data.entity.main.ArticleEntity;

public class DataManager {
    private ApiServer apiServer;
    private static DataManager mDataManager;

    public static DataManager getInstance(){
        if(mDataManager == null){
            mDataManager = new DataManager();
        }
        return mDataManager;
    }

    public DataManager() {
        apiServer = RetrofitHelper.getInstance().getApiServer();
    }

    public Observable<BaseResponse<ArticleEntity>> getMainArticle(int page){
        return apiServer.getMainArticle(page);
    }
}
