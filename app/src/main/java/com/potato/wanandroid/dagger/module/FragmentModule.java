package com.potato.wanandroid.dagger.module;

import android.app.Activity;
import android.support.v4.app.Fragment;

import dagger.Module;
import dagger.Provides;

@Module
public class FragmentModule {
    Fragment fragment;

    public FragmentModule(Fragment fragment) {
        this.fragment = fragment;
    }

    @Provides
    public Fragment provideFragment(){
        return fragment;
    }

    @Provides
    public Activity provideActivity(){
        return fragment.getActivity();
    }
}
