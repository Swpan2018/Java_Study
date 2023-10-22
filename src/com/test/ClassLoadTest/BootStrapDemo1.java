package com.test.ClassLoadTest;

public class BootStrapDemo1 {
    public static void main(String[] args) {
        //获得Object的类加载器
        ClassLoader classLoader = Object.class.getClassLoader();
        System.out.println(classLoader);
    }
}
