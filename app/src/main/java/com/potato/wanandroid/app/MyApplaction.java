package com.potato.wanandroid.app;

import android.app.Application;

import com.potato.wanandroid.dagger.component.ApplicationComponent;
import com.potato.wanandroid.dagger.component.DaggerApplicationComponent;
import com.potato.wanandroid.dagger.module.ApplicationModule;

public class MyApplaction extends Application {
    private static MyApplaction myApplaction;
    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        myApplaction = this;
        initComponent();
    }

    private void initComponent() {
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public static synchronized MyApplaction getInstance(){
        return myApplaction;
    }

    public ApplicationComponent getApplicationComponent(){
        return applicationComponent;
    }
}
