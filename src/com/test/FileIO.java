package com.test;
import java.io.*;

public class FileIO {
    public static void main(String[] args) throws IOException {
        //字节流输入输出
//        //读取文件
//        //输入流
//        FileInputStream fileInputStream = new FileInputStream("C:\\test.txt");
//        //准备一个容器来存
//        byte[] str = new byte[fileInputStream.available()];
//        fileInputStream.read(str);//将流读出来，放到byte[]中
//        String string = new String(str);
//        System.out.println(string);

//        //写文件
//        //输出流
//        FileOutputStream fileOutputStream = new FileOutputStream("C:\\test2.txt");
//        String str = new String("Hello!World!");
//        fileOutputStream.write(str.getBytes());
//        //关闭流
//        fileOutputStream.close();

//        //字符流输入输出
        //字符输入流
//        FileReader fileReader = new FileReader("C:\\test.txt");
//        //需要一个字符容器来存储读入的字符
//        char[] chars = new char[1024];
//        fileReader.read(chars);
//        System.out.println(chars);

//        //字符输出流
//        FileWriter fileWriter = new FileWriter("C:\\text2.txt");
//        fileWriter.write("asdfgh");
//        fileWriter.close();

//        //会分出一个子进程，用来执行命令
//        Runtime runtime = Runtime.getRuntime();
//        //exec用来执行命令，然后会返回一个process对象
//        Process process = runtime.exec("ipconfig");
//        //获取执行结果的输入流
//        InputStream inputStream = process.getInputStream();
//        //输出结果
//        int a = -1;
//        byte[] bytes = new byte[1024];//要是数据量小的话，可以这么写，但是一般用循环
////        inputStream.read(bytes);
////        System.out.println(new String(bytes));
//        //循环赋值
//        //每一次都存数组里，每一次又从数组中取出
//        while((a=inputStream.read(bytes))!=-1){
//            System.out.println(new String(bytes));
//        }

        //输入命令
        ProcessBuilder processBuilder = new ProcessBuilder("ipconfig");
        //开始执行命令
        Process process = processBuilder.start();
        //获取输入流
        InputStream inputStream = process.getInputStream();
        //使用容器一次次获取
        byte[] bytes = new byte[100];
        int a = -1;
        while((a=inputStream.read(bytes))!=-1){
            System.out.println(new String(bytes));
        }


    }

}
