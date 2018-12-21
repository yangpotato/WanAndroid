package com.potato.wanandroid.ui.home;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.potato.wanandroid.R;
import com.potato.wanandroid.adapter.home.HomeArticleAdapter;
import com.potato.wanandroid.base.fragment.BaseFragment;
import com.potato.wanandroid.contract.home.HomeContract;
import com.potato.wanandroid.data.entity.main.ArticleEntity;
import com.potato.wanandroid.presenter.home.HomePresenter;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

import static com.potato.wanandroid.app.Constants.ARG_PARAM1;
import static com.potato.wanandroid.app.Constants.ARG_PARAM2;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends BaseFragment<HomePresenter> implements HomeContract.View {
    @BindView(R.id.recycler)
    RecyclerView recycler;
    @BindView(R.id.normal)
    SmartRefreshLayout normal;
    Unbinder unbinder;

    private HomeArticleAdapter articleAdapter;
    private List<ArticleEntity.DatasBean> articleList;

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
        mFragmentComponent.inject(this);
    }

    @Override
    protected void initUI() {
        showLoading();
        initRecycler();
        mPresenter.getArticleList(0);
    }

    private void initRecycler() {
        articleList = new ArrayList<>();

        recycler.setLayoutManager(new LinearLayoutManager(activity));
        articleAdapter = new HomeArticleAdapter(articleList);
        articleAdapter.setEmptyView(R.layout.empty_view, normal);
        recycler.setAdapter(articleAdapter);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initToolbar() {

    }

    @Override
    public void ArticleResult(ArticleEntity entity) {
        articleList = entity.getDatas();
        articleAdapter.setNewData(articleList);
        normal.finishRefresh();
        showNormal();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
