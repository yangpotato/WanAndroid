package com.potato.wanandroid.dagger.module;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
    Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    public Activity provideActivity(){
        return activity;
    }
}
