package com.potato.wanandroid.data.http;

import com.potato.wanandroid.data.entity.main.LoginEntity;

import javax.inject.Inject;

import io.reactivex.Observable;

public class HttpHelperImpl implements HttpHelper {
    private ApiServer mApiServer;

    @Inject
    public HttpHelperImpl(ApiServer apiServer) {
        this.mApiServer = apiServer;
    }

    @Override
    public Observable<BaseResponse<LoginEntity>> login(String username, String password) {
        return mApiServer.login(username, password);
    }
}
