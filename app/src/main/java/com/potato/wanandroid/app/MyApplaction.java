package com.potato.wanandroid.app;

import android.app.Application;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;
import com.potato.wanandroid.BuildConfig;
import com.potato.wanandroid.R;
import com.potato.wanandroid.dagger.component.ApplicationComponent;
import com.potato.wanandroid.dagger.component.DaggerApplicationComponent;
import com.potato.wanandroid.dagger.module.ApplicationModule;
import com.potato.wanandroid.dagger.module.HttpModule;


public class MyApplaction extends Application {
    private static MyApplaction myApplaction;
    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        myApplaction = this;
        initComponent();
        initLogger();
    }

    private void initLogger() {
        if(BuildConfig.DEBUG) {
            Logger.addLogAdapter(new AndroidLogAdapter(PrettyFormatStrategy.newBuilder().tag(getString(R.string.app_name)).build()));
        }
    }

    private void initComponent() {
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .httpModule(new HttpModule(Constants.BASE_URL))
                .build();
    }

    public static synchronized MyApplaction getInstance(){
        return myApplaction;
    }

    public ApplicationComponent getApplicationComponent(){
        return applicationComponent;
    }
}
