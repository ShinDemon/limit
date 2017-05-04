package com.animate.until;

import java.io.UnsupportedEncodingException;

/**
 *
 * Created by Administrator on 2017/1/17.
 */
public class EncodingConverter {

    /**
     * 填充字符串，右对齐
     * @param source
     * @param length
     * @param alexin
     * @return
     */
    public static String fillLength(String source, int length, char alexin) {
        if(source.length() >= length) {
            return source;
        }
        StringBuilder str = new StringBuilder("");
        for(int i=0; i<length-source.length(); i++) {
            str.append(alexin);
        }
        str.append(source);
        return str.toString();
    }

    /**
     * 转换编码
     * @param source
     * @param encoder
     * @return
     */
    public static String turnToOtherEncoder(String source, String encoder) {
        try {
            String str = new String(source.getBytes(), encoder);
            return str;
        } catch (UnsupportedEncodingException e) {
            //TODO
            e.printStackTrace();
            return null;
        }
    }
}
