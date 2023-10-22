package com.test.ClassLoadTest;

import com.test.Person;

import java.io.*;

//1.继承ClassLoad
//2.重写findClass
public class MyClassLoader extends ClassLoader{
    //写上要加载的类的路径
    private String classPath;//写的是d:/这样的路径
    public MyClassLoader(String classPath){
        this.classPath = classPath;
    }
    public MyClassLoader(String classPath,ClassLoader parent){
        //调用父类的parent
        super(parent);
        this.classPath = classPath;
    }

    //重写findClass
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        //1.从本地或网络，读取一个输入流到内存中
        //先处理得到完整class路径
        //name是 com.test.demo
        // d:/com/test/demo.class  这样就加载到了.class
        String path = this.classPath+name.replace(".", File.separator)+".class";

        //读取到内存
        //根据路径
        try {
           //通过输入流获取.class文件
            InputStream InputStream = new FileInputStream(path);
           //构建字节输出流
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            //使用一个容器装一下文件的流
            byte[] bytes = new byte[1024];
            int len = -1;
            while((len=InputStream.read(bytes))!=-1){//流一直往容器中读进去,每次读入1024字节
                //将容器的东西写出到输出流中
                bos.write(bytes,0,len);
            }
            //将输出流转为字节
            byte[] bytes1 = bos.toByteArray();
            //关闭流
            InputStream.close();
            bos.close();
            //使用defineClass将字节数组转为Class
            return super.defineClass(name,bytes1,0,bytes1.length);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //加载com.test.Person.class字节码文件，然后将字节码文件进行实力话
        MyClassLoader myClassLoader = new MyClassLoader("G:\\javaProject\\src\\");
        //加载全限定名类,生成Class
        Class<?> aClass = myClassLoader.loadClass("com.test.Person");
        //使用Class实例化对象
        Person person = (Person) aClass.newInstance();
        person.eat();

    }
}
