package com.test.ClassLoadTest;

public class AppClassLoadDemo1 {
    public static void main(String[] args) {
        ClassLoader classLoader = AppClassLoadDemo1.class.getClassLoader();
        System.out.println(classLoader);
    }
}
