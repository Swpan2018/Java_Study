package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class UnSerializabale {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //找到序列化后的文件
        FileInputStream fileInputStream = new FileInputStream("test.ser");
        //将反序列化的文件放入
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        //反序列化
        Object obj = objectInputStream.readObject();
        //类型强制转换
        test test = (com.test.test) obj;
        System.out.println(test.getName());
    }
}
