package com.mpp.mpputils.utils;

import android.content.Context;

/**
 * dp、px、sp之间单位转换
 * Created by mengpeipei on 2016/4/11.
 */
public class DisplayUtils {
    /**
     * @Description 根据手机的分辨率从 dip 的单位 转成为 px(像素)
     * @param context
     *            环境
     * @param dipValue
     *            需要转化的dip值
     * @return int 转化后的px值
     */
    public static int dipToPx(Context context, float dipValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dipValue * scale + 0.5f);
    }


    /**
     * @Description 根据手机的分辨率从 px(像素) 的单位 转成为 dip
     * @param context
     *            环境
     * @param pxValue
     *            需要转换的像素值
     * @return int 转化后的dip值
     */
    public static int pxToDip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }


    /**
     * 将px值转换为sp值，保证文字大小不变
     * @param context
     * @param pxValue
     */
    public static int pxToSp(Context context, float pxValue) {
        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (pxValue / fontScale + 0.5f);
    }

    /**
     * 将sp值转换为px值，保证文字大小不变
     * @param context
     * @param spValue
     *            （DisplayMetrics类中属性scaledDensity）
     */
    public static int spToPx(Context context, float spValue) {
        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (spValue * fontScale + 0.5f);
    }


}
