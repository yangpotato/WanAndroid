package com.potato.wanandroid.utils;

import com.orhanobut.logger.Logger;

public class LogUtil {

    public synchronized static void httpV(String msg) {
        Logger.t("HTTPLOG").v(msg);
    }

    public synchronized static void v(String msg) {
        StackTraceElement traceElement = ((new Exception()).getStackTrace())[1];
        String toStringBuffer = "[" + traceElement.getFileName() + " | " +
                traceElement.getLineNumber() + " | " + traceElement.getMethodName() + "]" + msg;
        Logger.t("POTATOLOG").i(toStringBuffer);
    }

}
