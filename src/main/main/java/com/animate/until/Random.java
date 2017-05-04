package com.animate.until;

/**
 *
 * Created by Administrator on 2017/1/17.
 */
public class Random {

    public static final String ALL_CHAR = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String LETTER_CHAR = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /**
     * 获取单个随机数，不能连续使用
     * @param max
     * @return
     */
    public static int getOnlyRandom(int max) {
        return (int)(System.currentTimeMillis() % max);
    }

    /**
     * 获取单个随机数(带范围)，不能连续使用
     * @param min
     * @param max
     * @return
     */
    public static int getOnlyRandom(int min, int max) {
        return (int)(min + System.currentTimeMillis() % (max - min + 1));
    }

    /**
     * 获取单个随机数
     * @param max
     * @return
     */
    public static int getRandom(int max) {
        java.util.Random random = new java.util.Random();
        return (Math.abs(random.nextInt()) % max);
    }

    /**
     * 获取单个随机数(带范围)
     * @param min
     * @param max
     * @return
     */
    public static int getRandom(int min, int max) {
        java.util.Random random = new java.util.Random();
        return (min + Math.abs(random.nextInt()) % (max - min + 1));
    }

    /**
     * 获取随机码（纯字母）
     * @param length
     * @return
     */
    public static String getRandomLetterCharString(int length) {
        java.util.Random random = new java.util.Random();
        StringBuilder str = new StringBuilder("");
        for(int i=0; i<length; i++) {
            int index = (Math.abs(random.nextInt()) % LETTER_CHAR.length());
            str.append(LETTER_CHAR.charAt(index));
        }
        return str.toString();
    }

    /**
     * 获取随机码（字母+数字）
     * @param length
     * @return
     */
    public static String getRandomCharString(int length) {
        java.util.Random random = new java.util.Random();
        StringBuilder str = new StringBuilder("");
        for(int i=0; i<length; i++) {
            int index = (Math.abs(random.nextInt()) % ALL_CHAR.length());
            str.append(ALL_CHAR.charAt(index));
        }
        return str.toString();
    }
}
