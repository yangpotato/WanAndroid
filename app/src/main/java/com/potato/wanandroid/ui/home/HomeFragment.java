package com.potato.wanandroid.ui.home;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.potato.wanandroid.R;
import com.potato.wanandroid.app.Constants;
import com.potato.wanandroid.base.fragment.BaseFragment;

import static com.potato.wanandroid.app.Constants.ARG_PARAM1;
import static com.potato.wanandroid.app.Constants.ARG_PARAM2;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends BaseFragment {

    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initInject() {
//        mFragmentComponent.inject(this);
    }

    @Override
    protected void initUI() {
        showLoading();
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initToolbar() {

    }
}
