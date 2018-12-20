package com.potato.wanandroid.dagger.component;


import com.potato.wanandroid.app.MyApplaction;
import com.potato.wanandroid.dagger.module.ApplicationModule;
import com.potato.wanandroid.dagger.module.HttpModule;
import com.potato.wanandroid.data.DataManager;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, HttpModule.class})
public interface ApplicationComponent {
//    void inject(MyApplaction applaction);
    MyApplaction getApplaction();

    DataManager getDataManager();
}
