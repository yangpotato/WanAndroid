package com.potato.wanandroid.dagger.module;

import com.potato.wanandroid.app.MyApplaction;
import com.potato.wanandroid.data.DataManager;
import com.potato.wanandroid.data.http.HttpHelperImpl;
import com.potato.wanandroid.data.http.HttpHelper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    private MyApplaction applaction;

    public ApplicationModule(MyApplaction applaction) {
        this.applaction = applaction;
    }

    @Singleton
    @Provides
    public MyApplaction provideMyApplaction(){
        return applaction;
    }

//
//    @Singleton
//    @Provides
//    public HttpHelper provideHttpModule(HttpHelperImpl apiServer){
//        return apiServer;
//    }



}
