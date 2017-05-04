package com.animate.until;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *
 * Created by Administrator on 2016/12/6.
 */
public class Reflect {

    public void relect(Class clazz) {
        this.republic(clazz);
    }

    public void relect(Object object) {
        this.republic(object);
    }

    private void republic(Object object) {
        Field[] fields;
        Method[] methods;
        if(object instanceof Class)
            fields = ((Class) object).getDeclaredFields();
        else
            fields = object.getClass().getDeclaredFields();
        for(int i = 0; i < fields.length; i++) {
            Field f = fields[i];
            f.setAccessible(true);
            try {
                if(object instanceof Class)
                    System.out.println("属性名:" + f.getName());
                else
                    System.out.println("属性名:" + f.getName() + " 属性值:" + f.get(object));
            } catch (Exception ex) {

            }
        }
    }
}
