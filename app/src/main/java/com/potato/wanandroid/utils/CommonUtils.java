package com.potato.wanandroid.utils;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

public class CommonUtils {
    public static void showMessage(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
