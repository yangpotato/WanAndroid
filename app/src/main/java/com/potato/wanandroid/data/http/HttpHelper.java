package com.potato.wanandroid.data.http;

import com.potato.wanandroid.data.entity.main.LoginEntity;

import io.reactivex.Observable;
import retrofit2.http.Field;

public interface HttpHelper {
    Observable<BaseResponse<LoginEntity>> login(@Field("username") String username, @Field("password") String password);
}
