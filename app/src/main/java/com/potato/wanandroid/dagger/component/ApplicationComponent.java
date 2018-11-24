package com.potato.wanandroid.dagger.component;

import android.app.Application;

import com.airbnb.lottie.animation.content.Content;
import com.potato.wanandroid.app.MyApplaction;
import com.potato.wanandroid.dagger.module.ApplicationModule;

import dagger.Component;

@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    MyApplaction getApplaction();
}
