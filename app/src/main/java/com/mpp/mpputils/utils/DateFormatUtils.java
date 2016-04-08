package com.mpp.mpputils.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期格式化工具类
 * Created by mpp on 2016/4/8.
 */
public class DateFormatUtils {

    private static String[] formatType = new String[]{"yyyy-MM-dd HH:mm:ss","yyyy-MM-dd HH:mm","yyyy-MM-dd","MM-dd","yyyy年MM月","HH:mm:ss","MM.dd"} ;

    /**
     * DATE_TIME_ALL: 例2012-12-12 12:12:12<br/>
     * DATE_HOUR_MINUTE: 例2012-12-12 12:12<br/>
     * DATE_ALL: 例2012-12-12<br/>
     * MONTH_DAY_1: 例12-12<br/>
     * MONTH_DAY_2: 例12:12<br/>
     * YEAR_MONTH: 例2012年12月<br/>
     * TIME_ALL： 例12:12:12
     */
    public enum  FormatType {DATE_TIME_ALL,DATE_HOUR_MINUTE,DATE_ALL,MONTH_DAY_1,YEAR_MONTH,TIME_ALL,MONTH_DAY_2};


    private static String getFormateType(FormatType type){
        String t = null ;
        switch (type){
            case DATE_TIME_ALL:
                t = formatType[0] ;
                break;
            case DATE_HOUR_MINUTE:
                t = formatType[1] ;
                break;
            case DATE_ALL:
                t = formatType[2] ;
                break;
            case MONTH_DAY_1:
                t = formatType[3] ;
                break;
            case YEAR_MONTH:
                t = formatType[4] ;
                break;
            case TIME_ALL:
                t = formatType[5] ;
                break;
            case MONTH_DAY_2:
                t = formatType[6] ;
                break;
            default:
                t = formatType[0] ;
                break;
        }
        return t ;
    }

    public static String getDateFormat(long longdate,FormatType type) {

        String t = getFormateType(type) ;
        SimpleDateFormat commonDateFormat = new SimpleDateFormat(t) ;
        Date date = new Date(longdate);
        return commonDateFormat.format(date);
    }


    public static String getDateFormat(String stringdate,FormatType type) {

        String t = getFormateType(type) ;
        SimpleDateFormat commonDateFormat = new SimpleDateFormat(t) ;
        Date date = new Date(stringdate);
        return commonDateFormat.format(date);
    }


}
