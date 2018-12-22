package com.potato.wanandroid.utils;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.potato.wanandroid.R;
import com.potato.wanandroid.data.entity.main.BannerEntity;
import com.zhouwei.mzbanner.MZBannerView;
import com.zhouwei.mzbanner.holder.MZViewHolder;

public class BannerViewHolder implements MZViewHolder<BannerEntity> {
    private ImageView mImageView;

    @Override
    public View createView(Context context) {
        View view = LayoutInflater.from(context).inflate(R.layout.banner_item,null);
        mImageView = (ImageView) view.findViewById(R.id.banner_image);
        return view;
    }

    @Override
    public void onBind(Context context, int i, BannerEntity s) {
        GlideUtil.show(context, s.getImagePath(), mImageView);
    }
}
