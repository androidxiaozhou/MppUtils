package com.mpp.mpputils.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 字符串判断工具类
 * Created by mengpeipei on 2016/4/12.
 */
public class StringUtil {

    /**
     * 判断是否含有中文
     *
     * @param str 目标字符串
     * @return
     */
    public static boolean isContainChinese(String str) {
        try {
            Pattern p = Pattern.compile("[\u4e00-\u9fa5]");
            Matcher m = p.matcher(str);
            if (m.find()) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    /**
     * 判断是否为纯数字
     *
     * @param value
     * @return
     */
    public static boolean isAllNumber(String value) {
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher matcher = pattern.matcher(value);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    /**
     * 判断字符串是否是float类型数据
     *
     * @param value
     * @return
     * @author mengpeipei
     */
    public static boolean isFloatNumber(String value) {

        Pattern pattern = Pattern.compile("^[0-9|-]?\\d*\\.?\\d*$");
        Matcher matcher = pattern.matcher(value);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    /**
     * 判断是否是手机号
     *
     * @param value
     * @return
     */
    public static boolean isMobile(String value) {
        Pattern pattern = Pattern.compile("1\\d{10}");
        Matcher matcher = pattern.matcher(value);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    /**
     * 判断是否是邮箱地址
     *
     * @param value
     * @return
     */
    public static boolean isEmail(String value) {
        Pattern pattern = Pattern
                .compile("^[\\w\\.-]+(\\.[\\w\\.-]+)*@[\\w-]+(\\.[\\w-]+)+$");
        Matcher matcher = pattern.matcher(value);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    /**
     * 判断是否是电话号码
     *
     * @param value
     * @return
     */
    public static boolean isPhoneNum(String value) {
        Pattern pattern = Pattern.compile("\\d{7}|\\d{8}|\\d{11}|\\d{3}-\\d{8}|\\d{4}-\\d{7}");
        Matcher matcher = pattern.matcher(value);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }
}
