package com.potato.wanandroid.adapter.home;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.potato.wanandroid.R;
import com.potato.wanandroid.data.entity.main.ArticleEntity;

import java.util.List;

public class HomeArticleAdapter extends BaseQuickAdapter<ArticleEntity.DatasBean, BaseViewHolder> {
    public HomeArticleAdapter(@Nullable List<ArticleEntity.DatasBean> data) {
        super(R.layout.item_article, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, ArticleEntity.DatasBean item) {
        helper.setText(R.id.tv_article_icon, item.getAuthor().substring(0, 1));
        helper.setText(R.id.tv_article_name, item.getAuthor());
        helper.setText(R.id.tv_article_time, item.getNiceDate());
        helper.setText(R.id.tv_article_title, item.getTitle());
        helper.setText(R.id.tv_article_origin, item.getSuperChapterName() + "/" + item.getChapterName());

    }
}
