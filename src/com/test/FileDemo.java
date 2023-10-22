package com.test;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        //使用File来创建文件
        File file = new File("test.txt");
        //System.out.println(System.getProperty("user.dir"));
        file.createNewFile();//创建了一个新文件
    }
}
