package com.potato.wanandroid.dagger.component;

import android.app.Activity;

import com.potato.wanandroid.dagger.Applicaton_Annotation;
import com.potato.wanandroid.dagger.module.ActivityModule;
import com.potato.wanandroid.ui.MainActivity;
import com.potato.wanandroid.ui.login.LoginActivity;


import dagger.Component;

@Applicaton_Annotation
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    Activity getActivity();
    void inject(LoginActivity activity);
//    void inject(MainActivity activity);


}
