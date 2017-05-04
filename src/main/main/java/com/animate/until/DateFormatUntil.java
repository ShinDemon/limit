package com.animate.until;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * Created by Administrator on 2016/12/8.
 */
public class DateFormatUntil {

    private static SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
    private static SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static Date getCurrentDate() {
        return new Date();
    }

    public static String getCurrentDateStr() {
        Date date = new Date();
        return sdf1.format(date);
    }

    public static Timestamp getCurrentTimestamp() {
        return new Timestamp(System.currentTimeMillis());
    }

    public static String getCurrentTimestampStr() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return sdf2.format(timestamp);
    }

    public static Date stringToDate(String dateStr) {
        try {
            Date date = sdf1.parse(dateStr);
            return date;
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public static Timestamp stringToTimestamp(String timestamp) {
        return Timestamp.valueOf(timestamp);
    }

    public static String formatDate(Date date) {
        String str = sdf1.format(date);
        return str;
    }

    public static String formatTimestamp(Timestamp timestamp) {
        String str = sdf2.format(timestamp);
        return str;
    }
}
