package com.potato.wanandroid.ui.home;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.potato.wanandroid.R;
import com.potato.wanandroid.base.fragment.BaseFragment;

import static com.potato.wanandroid.app.Constants.ARG_PARAM1;
import static com.potato.wanandroid.app.Constants.ARG_PARAM2;

public class ArticleDetailFragment extends BaseFragment {


    public static ArticleDetailFragment newInstance(String param1, String param2) {
        ArticleDetailFragment fragment = new ArticleDetailFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_article_detail;
    }

    @Override
    protected void initInject() {

    }

    @Override
    protected void initUI() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initToolbar() {

    }

}
