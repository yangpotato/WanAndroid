package com.potato.wanandroid.data.http;

import android.database.Observable;

import com.potato.wanandroid.data.entity.BaseResponse;
import com.potato.wanandroid.data.entity.main.ArticleEntity;

import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiServer {
    @GET("article/list/{page}/json")
    Observable<BaseResponse<ArticleEntity>> getMainArticle(@Path("page") int page);
}
