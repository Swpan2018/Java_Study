package com.test;

import java.io.*;

public class Serialize {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Student stu = new Student(35,"601",18,"Mike");
//        //序列化
//        //获取文件流
//        FileOutputStream fileOutputStream = new FileOutputStream("c:\\stu.ser");
//        //使用ObjectOuptStream进行序列化
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//        //将要序列化的类传进去
//        objectOutputStream.writeObject(stu);
//        //关闭
//        fileOutputStream.close();
//        objectOutputStream.close();

        //反序列化
        FileInputStream fileInputStream = new FileInputStream("c:\\1.ser");
        //这个用来进行反序列化,将读入的文件传入进去
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object ob = objectInputStream.readObject();

//        Student student = (Student) ob;
//        System.out.println(student.getName());



    }
}
