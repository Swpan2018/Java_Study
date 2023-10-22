package com.test.SqlTest;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirTest {
    public static void main(String[] args) throws IOException {
        String fileName = "..\\..\\FileTest.txt";//可控
        String pathName="C:\\Users\\Administrator\\Desktop\\test\\"+fileName;
        Path srcFile = Paths.get(pathName);
        System.out.println(srcFile);//一个路径
        File file = srcFile.toFile();//得到一个File实例
        File file2 = new File("C:\\Users\\Administrator\\Desktop\\test\\Test.txt");
        InputStream inputStream = new FileInputStream(file);
        OutputStream outputStream = new FileOutputStream(file2);
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes);
        outputStream.write(bytes);
        inputStream.close();
        outputStream.close();

    }
}
