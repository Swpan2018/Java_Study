package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassLoaderTest {
    public static void main(String[] args) throws Exception {
        //实例化classloader
        MyClassLoader myClassLoader = new MyClassLoader();
        //打开文件输入流
        FileInputStream fileInputStream = new FileInputStream("G:\\javaProject\\src\\Loader.class");
        //创建字节数组，接收文件内容
        byte[] bytes = new byte[fileInputStream.available()];
        fileInputStream.read(bytes);
        //将文件内容和类名传入defineclass文件中
        Class loaderclass = myClassLoader.defineClass("Loader",bytes);
        //调用构造方法实例化
        Object obj = loaderclass.newInstance();
        //调用print方法
        Method print = loaderclass.getMethod("print");
        print.invoke(obj);

    }
    static class MyClassLoader extends ClassLoader{
        public Class<?> defineClass(String name,byte[] b){
            return defineClass(name,b,0,b.length);
        }
    }
}
