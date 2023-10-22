package com.test;

import java.io.*;

public class Serializable {
    public static void main(String[] args) throws IOException {
        //序列化

        //实例化对象
        test test = new test("kkk");
        //指定序列化后的文件位置,后缀名为.ser
        FileOutputStream fileOutputStream = new FileOutputStream("test.ser");
        //确定流的去向
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        //把对象放进去，进行序列化
        objectOutputStream.writeObject(test);
        //最后序列化的内容就放在了test.ser中

    }
}
