package com.animate.until;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * Created by Administrator on 2017/1/13.
 */
public class DateConverter {

    private static final SimpleDateFormat SDF1 = new SimpleDateFormat("yyyy-MM-dd");
    private static final SimpleDateFormat SDF2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static final SimpleDateFormat SDF3 = new SimpleDateFormat("yyyy年MM月dd日");
    private static final SimpleDateFormat SDF4 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
    private static final SimpleDateFormat SDF5 = new SimpleDateFormat("HH:mm:ss");
    private static final SimpleDateFormat SDF6 = new SimpleDateFormat("HH时mm分ss秒");

    public static Date getCurrentDate() {
        Date currentDate = new Date();
        return currentDate;
    }

    /**
     * 获取当前日期
     * state---1 返回字符串格式"yyyy-MM-dd"
     * state---2 返回字符串格式"yyyy-MM-dd HH:mm:ss"
     * state---3 返回字符串格式"yyyy年MM月dd日"
     * state---4 返回字符串格式"yyyy年MM月dd日 HH时mm分ss秒"
     * state---5 返回字符串格式"yyyy-MM-dd"
     * state---6 返回字符串格式"HH时mm分ss秒"
     * else 返回字符串格式""
     * @param state
     * @return currentDateStr
     */
    public static String getCurrentDateStr(int state) {
        Date currentDate = new Date();
        String dateStr = strConverter(currentDate, state);
        return dateStr;
    }

    /**
     * 将字符串转换为日期
     * state---1 返回日期格式"yyyy-MM-dd"
     * state---2 返回日期格式"yyyy-MM-dd HH:mm:ss"
     * state---3 返回日期格式"yyyy年MM月dd日"
     * state---4 返回日期格式"yyyy年MM月dd日 HH时mm分ss秒"
     * state---5 返回日期格式"yyyy-MM-dd"
     * state---6 返回日期格式"HH时mm分ss秒"
     * else 返回null
     * @param dateStr
     * @param state
     * @return Date
     */
    public static Date turnToDate(String dateStr, int state) {
        Date date;
        ParsePosition pos = new ParsePosition(0);
        switch (state) {
            case 1:
                date = SDF1.parse(dateStr,pos);
                break;
            case 2:
                date = SDF2.parse(dateStr,pos);
                break;
            case 3:
                date = SDF3.parse(dateStr,pos);
                break;
            case 4:
                date = SDF4.parse(dateStr,pos);
                break;
            case 5:
                date = SDF5.parse(dateStr,pos);
                break;
            case 6:
                date = SDF6.parse(dateStr,pos);
                break;
            default:
                date = null;
                break;
        }
        return date;
    }

    /**
     * 将日期转换为字符串
     * state---1 返回字符串格式"yyyy-MM-dd"
     * state---2 返回字符串格式"yyyy-MM-dd HH:mm:ss"
     * state---3 返回字符串格式"yyyy年MM月dd日"
     * state---4 返回字符串格式"yyyy年MM月dd日 HH时mm分ss秒"
     * state---5 返回字符串格式"yyyy-MM-dd"
     * state---6 返回字符串格式"HH时mm分ss秒"
     * else 返回字符串格式""
     * @param state
     * @return currentDateStr
     */
    public static String turnToStr(Date date, int state) {
        String dateStr = strConverter(date, state);
        return dateStr;
    }

    private static String strConverter(Date date, int state) {
        String dateStr = "";
        switch (state) {
            case 1:
                dateStr = SDF1.format(date);
                break;
            case 2:
                dateStr = SDF2.format(date);
                break;
            case 3:
                dateStr = SDF3.format(date);
                break;
            case 4:
                dateStr = SDF4.format(date);
                break;
            case 5:
                dateStr = SDF5.format(date);
                break;
            case 6:
                dateStr = SDF6.format(date);
                break;
            default:
                break;
        }
        return dateStr;
    }
}
