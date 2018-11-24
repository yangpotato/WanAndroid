package com.potato.wanandroid.dagger.component;

import android.app.Activity;

import com.potato.wanandroid.dagger.module.ActivityModule;
import com.potato.wanandroid.ui.login.LoginActivity;

import dagger.Component;

@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    Activity getActivity();
    void inject(LoginActivity activity);
}
