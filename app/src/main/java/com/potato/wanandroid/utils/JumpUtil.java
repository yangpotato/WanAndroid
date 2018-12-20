package com.potato.wanandroid.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;


import java.io.Serializable;

public class JumpUtil {
    public static String P1 = "p1";
    public static String P2 = "p2";
    public static String P3 = "p3";
    public static String P4 = "p4";
    public static String P5 = "p5";
    public static String P6 = "p6";
    public static String P7 = "p7";

    public  static void overlay(Context context, Class<? extends Activity> targetClazz){
        Intent mIntent = new Intent(context, targetClazz);
//        mIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(mIntent);
    }

    public static void overlay(Context context, Class<? extends Activity> targetClazz, String key1, String value1, String key2, String value2, int type){
        Intent mIntent = new Intent(context, targetClazz);
        mIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mIntent.putExtra(key1, value1);
        mIntent.putExtra(key2, value2);
        context.startActivity(mIntent);
    }

    public  static void overlay(Context context, Class<? extends Activity> targetClazz, int obj){
        Intent mIntent = new Intent(context, targetClazz);
        mIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mIntent.putExtra(P1, obj);
        context.startActivity(mIntent);
    }



    public  static void overlay(Context context, Class<? extends Activity> targetClazz, String obj){
        Intent mIntent = new Intent(context, targetClazz);
        mIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mIntent.putExtra(P1, obj);
        context.startActivity(mIntent);
    }



    public  static void overlay(Context context, Class<? extends Activity> targetClazz, String obj, int v){
        Intent mIntent = new Intent(context, targetClazz);
        mIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mIntent.putExtra(P1, obj);
        mIntent.putExtra(P2, v);
        context.startActivity(mIntent);
    }

    public  static void overlay(Context context, Class<? extends Activity> targetClazz, String k1, String k2){
        Intent mIntent = new Intent(context, targetClazz);
        mIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mIntent.putExtra(P1, k1);
        mIntent.putExtra(P2, k2);
        context.startActivity(mIntent);
    }

    public  static void overlay(Context context, Class<? extends Activity> targetClazz, Bundle bundle){
        Intent mIntent = new Intent(context, targetClazz);
        mIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mIntent.putExtra(P1, bundle);
        context.startActivity(mIntent);
    }

    public  static void overlay(Context context, Class<? extends Activity> targetClazz, String key, Bundle bundle){
        Intent mIntent = new Intent(context, targetClazz);
        mIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mIntent.putExtra(key, bundle);
        context.startActivity(mIntent);
    }


    public  static void overlay(Context context, Class<? extends Activity> targetClazz, String k1, String k2, String k3){
        Intent mIntent = new Intent(context, targetClazz);
        mIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mIntent.putExtra(P1, k1);
        mIntent.putExtra(P2, k2);
        mIntent.putExtra(P3, k3);
        context.startActivity(mIntent);
    }

    public  static void overlay(Context context, Class<? extends Activity> targetClazz, String k1, String k2, String k3, String k4){
        Intent mIntent = new Intent(context, targetClazz);
        mIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mIntent.putExtra(P1, k1);
        mIntent.putExtra(P2, k2);
        mIntent.putExtra(P3, k3);
        mIntent.putExtra(P4, k4);
        context.startActivity(mIntent);
    }

    public  static void overlay(Context context, Class<? extends Activity> targetClazz, int obj, String key){
        Intent mIntent = new Intent(context, targetClazz);
        mIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mIntent.putExtra(JumpUtil.P1, obj);
        mIntent.putExtra(JumpUtil.P2, key);
        context.startActivity(mIntent);
    }

    public  static void overlay(Context context, Class<? extends Activity> targetClazz, Serializable obj){
        Intent mIntent = new Intent(context, targetClazz);
        mIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mIntent.putExtra(P1, obj);
        context.startActivity(mIntent);
    }

//    public  static void overlayExit(Context context){
//        SPUtils.put(context, SPUtils.ACCOUNT, "");
//        SPUtils.put(context, SPUtils.TOKEN, "");
//        SPUtils.put(context, SPUtils.PWD, "");
//        Constants.TOKEN = "";
//        Intent mIntent = new Intent(context, LoginActivity.class);
//        mIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
//        context.startActivity(mIntent);
//    }
}
