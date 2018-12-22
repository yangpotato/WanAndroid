package com.potato.wanandroid.ui.home;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.potato.wanandroid.R;
import com.potato.wanandroid.adapter.home.HomeArticleAdapter;
import com.potato.wanandroid.base.fragment.BaseFragment;
import com.potato.wanandroid.contract.home.HomeContract;
import com.potato.wanandroid.data.entity.main.ArticleEntity;
import com.potato.wanandroid.data.entity.main.BannerEntity;
import com.potato.wanandroid.presenter.home.HomePresenter;
import com.potato.wanandroid.utils.BannerViewHolder;
import com.potato.wanandroid.utils.JumpUtil;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.zhouwei.mzbanner.MZBannerView;
import com.zhouwei.mzbanner.holder.MZHolderCreator;

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
    SmartRefreshLayout refreshView;

    private MZBannerView banner;
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
        mPresenter.loadHomeData();
        setRefresh();

        articleAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                JumpUtil.overlay(activity, ArticleDetailActivity.class, articleList.get(position).getLink(), articleList.get(position).getTitle());
            }
        });
    }

    private void setRefresh() {
        refreshView.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                mPresenter.loadHomeData();
            }
        });

        refreshView.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                mPresenter.loadMore();
            }
        });
    }

    private void initRecycler() {
        articleList = new ArrayList<>();

        recycler.setLayoutManager(new LinearLayoutManager(activity));
        articleAdapter = new HomeArticleAdapter(articleList);
        articleAdapter.setEmptyView(R.layout.empty_view, refreshView);

        View view = LayoutInflater.from(activity).inflate(R.layout.home_header, null);
        banner = view.findViewById(R.id.banner);
        articleAdapter.addHeaderView(view);
        recycler.setAdapter(articleAdapter);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initToolbar() {

    }

    @Override
    public void showArticleList(ArticleEntity entity, boolean refresh) {
        if (refresh)
            articleList = entity.getDatas();
        else
            articleList.addAll(entity.getDatas());

        articleAdapter.replaceData(articleList);
        refreshView.finishRefresh();
        refreshView.finishLoadMore();
    }

    @Override
    public void showBannerData(List<BannerEntity> bannerEntities) {
        if(banner != null) {
            banner.setPages(bannerEntities, new MZHolderCreator<BannerViewHolder>() {
                @Override
                public BannerViewHolder createViewHolder() {
                    return new BannerViewHolder();
                }
            });
            banner.start();
        }
    }

    @Override
    public void onSupportVisible() {
        super.onSupportVisible();
        if(banner != null) {
            banner.start();
        }
    }

    @Override
    public void onSupportInvisible() {
        super.onSupportInvisible();
        if(banner != null)
            banner.pause();

    }

}
