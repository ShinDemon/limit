package com.animate.until;

/**
 *
 * Created by Administrator on 2017/1/17.
 */
public class ValidationCode {

    public static final String RANDOM_CODE = "13456789abcdefghijklmnpqrstuvwxyABCDEFGHIJKLMNPQRSTUVWXY";

    /**
     * 生成验证码
     * @param length
     * @return
     */
    public static String getValidationCode(int length) {
        java.util.Random random = new java.util.Random();
        StringBuilder str = new StringBuilder("");
        for(int i=0; i<length; i++) {
            int index = (Math.abs(random.nextInt()) % RANDOM_CODE.length());
            str.append(RANDOM_CODE.charAt(index));
        }
        return str.toString();
    }
}
