package com.test.ClassLoadTest;

import com.sun.javafx.webkit.WebPageClientImpl;

public class ExtClassLoadDemo1 {
    public static void main(String[] args) {
        ClassLoader classLoader = WebPageClientImpl.class.getClassLoader();
        System.out.println(classLoader);
    }
}
