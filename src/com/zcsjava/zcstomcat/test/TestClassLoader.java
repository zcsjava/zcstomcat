package com.zcsjava.zcstomcat.test;
 
public class TestClassLoader {
 
    public static void main(String[] args) {
        Object o = new Object();
         
        System.out.println(o);
         
        Class<?> clazz = o.getClass();
         
        System.out.println(clazz);
         
    }
}
