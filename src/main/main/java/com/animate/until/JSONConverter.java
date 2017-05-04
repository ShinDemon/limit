package com.animate.until;

import java.lang.reflect.Field;

/**
 *
 * Created by Administrator on 2017/1/12.
 */
public class JSONConverter {

    private String str1;
    private Integer int1;
    private Page page;

    //在 JSON 里 [] 是 Array(也就是数组)   {} 是 Object（也就是对象）
    public String toJSONArray(Object object) {
        StringBuilder str = new StringBuilder();
        Field[] fields = object.getClass().getDeclaredFields();
        for(Field field : fields) {
            if(field.getDeclaringClass().isPrimitive()) { //boolean, byte, char, short, int, long, float, 和double

            }
            if(field.getDeclaringClass().equals(String.class)) { //String

            }
        }
        return null;
    }

    public String toJSONObject() {
        return null;
    }

    public Object analysisJSONArray(String json) {
        return null;
    }

    public Object analysisJSONObject(String json, Class clazz) {
        try {
            Object obj = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
