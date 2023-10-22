package com.test;

import java.io.*;

public class FileStreamDemo {
    public static void main(String[] args) throws IOException {
        //字节流

//        //首先实例化两个对象
//        File file1 = new File("test.txt");
//        File file2 = new File("test2.txt");
//        //读出test中的数据
//        //使用输入流获取它的文件
//        FileInputStream in = new FileInputStream(file1);
//        //需要使用一个存放字节的容器来存输入流读入的数据
//        //in.available() 会自动配置好长度
//        byte[] b = new byte[in.available()];
//        //in.read(b) 会返回读的字节长度
//        //in.read(b);
//        //这时候，字节都被读入到数组中了,只要把数组中的数据表示出来就行
//        //String str = new String(b);
//        //System.out.println(str);
//        //使用上面的方法，最后读入的时候，会把一些不需要的空格也读了，所以我们需要进行限制
//        in.read(b);
//        System.out.println(new String(b));
//        //将文件内容写入到新的文件中，完成copy的功能
//        FileOutputStream out = new FileOutputStream(file2);
//        //文件内容写入
//        out.write(b);
//        in.close();
//        out.close();
//
//        //字符流
//        FileReader fileReader = new FileReader("zifu.txt");
//        char[] c = new char[10];
//        //会返回一个长度
//        int length = fileReader.read(c);
//        System.out.println(c);


//        //字节节流转为字符流
//        //先获取字节读入流
//        FileInputStream f = new FileInputStream("zijie.txt");
//        //将字节流转为字符流
//        InputStreamReader in = new InputStreamReader(f,"utf-8");
//        System.out.println((char)in.read());
//        System.out.println((char)in.read());

        //缓冲流
        //获取字节流
        FileInputStream fileInputStream = new FileInputStream("test.txt");
        //将字节流转为字符流
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        //缓冲流,现在可以用readline进行读取
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println(bufferedReader.readLine());






    }
}
