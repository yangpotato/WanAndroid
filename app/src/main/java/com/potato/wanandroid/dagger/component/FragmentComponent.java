package com.potato.wanandroid.dagger.component;

import android.app.Activity;


import com.potato.wanandroid.dagger.Applicaton_Annotation;
import com.potato.wanandroid.dagger.module.FragmentModule;
import com.potato.wanandroid.ui.home.HomeFragment;

import dagger.Component;

@Applicaton_Annotation
@Component(dependencies = ApplicationComponent.class, modules = FragmentModule.class)
public interface FragmentComponent {
    Activity getActivity();
//    void inject(HomeFragment fragment);

}
