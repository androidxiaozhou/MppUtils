package com.mpp.mpputils.utils;

import android.util.Log;

/**
 * Log打印工具类
 * Created by mengpeipei on 2016/4/12.
 */
public class LogUtil {
    private static final String TAG = "MPPLog";

    private static final int LOGCAT_LEVEL = false ? 100 : 0;// logcat level
    private static final int LOG_LEVEL_ERROR = 16;
    private static final int LOG_LEVEL_WARN = 8;
    private static final int LOG_LEVEL_INFO = 4;
    private static final int LOG_LEVEL_DEBUG = 2;

    private static final boolean DEBUG = (LOGCAT_LEVEL <= LOG_LEVEL_DEBUG);
    private static final boolean INFO = (LOGCAT_LEVEL <= LOG_LEVEL_INFO);
    private static final boolean WARN = (LOGCAT_LEVEL <= LOG_LEVEL_WARN);
    private static final boolean ERROR = (LOGCAT_LEVEL <= LOG_LEVEL_ERROR);

    public static void d(String tag, String msg) {
        if (DEBUG) {
            tag = Thread.currentThread().getName() + ":" + tag;
            Log.d(TAG, tag + " : " + msg);
        }
    }

    public static void d(String tag, String msg, Throwable error) {
        if (DEBUG) {
            tag = Thread.currentThread().getName() + ":" + tag;
            Log.d(TAG, tag + " : " + msg, error);
        }
    }

    public static void i(String tag, String msg) {
        if (INFO) {
            tag = Thread.currentThread().getName() + ":" + tag;
            Log.i(TAG, tag + " : " + msg);
        }
    }

    public static void i(String tag, String msg, Throwable error) {
        if (INFO) {
            tag = Thread.currentThread().getName() + ":" + tag;
            Log.i(TAG, tag + " : " + msg, error);
        }
    }

    public static void w(String tag, String msg) {
        if (WARN) {
            tag = Thread.currentThread().getName() + ":" + tag;
            Log.w(TAG, tag + " : " + msg);
        }
    }

    public static void w(String tag, String msg, Throwable error) {
        if (WARN) {
            tag = Thread.currentThread().getName() + ":" + tag;
            Log.w(TAG, tag + " : " + msg, error);
        }
    }

    public static void e(String tag, String msg) {
        if (ERROR) {
            tag = Thread.currentThread().getName() + ":" + tag;
            Log.e(TAG, tag + " : " + msg);
        }
    }

    public static void e(String tag, String msg, Throwable error) {
        if (ERROR) {
            tag = Thread.currentThread().getName() + ":" + tag;
            Log.e(TAG, tag + " : " + msg, error);
        }
    }

}
