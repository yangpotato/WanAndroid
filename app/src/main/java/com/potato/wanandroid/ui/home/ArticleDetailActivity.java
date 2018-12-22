package com.potato.wanandroid.ui.home;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.just.agentweb.AgentWeb;
import com.just.agentweb.DefaultWebClient;
import com.just.agentweb.NestedScrollAgentWebView;
import com.potato.wanandroid.R;
import com.potato.wanandroid.base.activity.BaseActivity;
import com.potato.wanandroid.utils.JumpUtil;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ArticleDetailActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.article_detail_web_view)
    FrameLayout articleDetailWebView;

    private AgentWeb mAgentWeb;
    private String link, title;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_article_detail;
    }

    @Override
    protected void initInject() {

    }

    @Override
    protected void initToolbar() {
        toolbar.setTitle(title);
    }

    @Override
    protected void initUI() {
        NestedScrollAgentWebView webView = new NestedScrollAgentWebView(this);
        mAgentWeb = AgentWeb.with(this)
                .setAgentWebParent(articleDetailWebView, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT))
                .useDefaultIndicator()
                .setWebView(webView)
                .setSecurityType(AgentWeb.SecurityType.STRICT_CHECK)
                .setMainFrameErrorView(R.layout.agentweb_error_page, -1)
                .setOpenOtherPageWays(DefaultWebClient.OpenOtherPageWays.DISALLOW)
                .interceptUnkownUrl()
                .createAgentWeb()
                .ready()
                .go(link);
    }

    @Override
    protected void initData() {
        link = getIntent().getStringExtra(JumpUtil.P1);
        title = getIntent().getStringExtra(JumpUtil.P2);
    }

}
