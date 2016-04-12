package com.mpp.mpputils.utils;

import android.graphics.Color;
import android.text.TextUtils;

import java.util.regex.Pattern;

/**
 * 文字颜色工具类
 * Created by mengpeipei on 2016/4/11.
 */
public class TextColorUtil {




    /**
     * 判断是否是Color的格式，即#后3、6、8位16进制的格式
     *
     * @param colorStr
     * @return 是否是颜色格式
     */
    public static boolean isColor(String colorStr) {
        if (TextUtils.isEmpty(colorStr)) {
            return false;
        }
        colorStr = colorStr.trim();
        if (!colorStr.startsWith("#") || (colorStr.length() != 4 && colorStr.length() != 7 && colorStr.length() != 9)) {
            return false;
        }
        String pattern = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3}|[A-Fa-f0-9]{8})$";
        return Pattern.matches(pattern, colorStr);
    }



    /**
     * 判断从接口拿到的color是否可用，可用的话返回可用的color，否则返回默认的
     * @param strColor
     * @param defaultColor
     * @return
     */
    public static int getColor(String strColor, String defaultColor) {
        String color = isColor(strColor) ? strColor.trim() : defaultColor;
        return Color.parseColor(color);
    }

    /**
     * 返回指定颜色的html字体<br/>
     * 传入color格式不正确时，显示颜色为#999999
     *
     * @param text
     * @param colorStr
     * @return
     */
    public static String getHtmlColorText(String text, String colorStr) {

        String color = isColor(colorStr) ? colorStr : ",\"#999999\"";
        String redFontHtmlString = "<font color=" + color + ">" + text
                + "</font>";
        return redFontHtmlString;
    }




}
