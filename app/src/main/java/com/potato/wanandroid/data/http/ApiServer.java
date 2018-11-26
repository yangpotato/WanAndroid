package com.potato.wanandroid.data.http;


import com.potato.wanandroid.data.entity.main.ArticleEntity;
import com.potato.wanandroid.data.entity.main.LoginEntity;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ApiServer {
    @GET("article/list/{page}/json")
    Observable<BaseResponse<ArticleEntity>> getMainArticle(@Path("page") int page);

    @POST("user/login")
    @FormUrlEncoded
    Observable<BaseResponse<LoginEntity>> login(@Field("username") String username, @Field("password") String password);
}
