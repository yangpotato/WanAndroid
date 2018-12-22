package com.potato.wanandroid.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class GlideUtil {
    public static void show(Context mContext, String url, ImageView imageView){
        Glide.with(mContext).load(url).into(imageView);
    }
}
