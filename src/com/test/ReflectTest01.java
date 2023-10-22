package com.test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectTest01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //      StringBuilder s = new StringBuilder();
//      Student stu = new Student(35,"601",18,"Mike");
//      System.out.println(stu.getClass());
        //使用反射,获取这个类的字节码文件
        //Class studentClass = Class.forName("com.test.Student");
        //Modifier对访问修饰符进行解码
        //s.append(Modifier.toString(studentClass.getModifiers())+" class "+studentClass.getSimpleName()+"{\n");
        //获取所有属性
//        Field[] fields = studentClass.getDeclaredFields();
//        for(Field f:fields){
//            s.append("\t");
//            s.append(Modifier.toString(f.getModifiers()));
//            if(f.getModifiers()!=0)s.append(" ");
//            s.append(f.getType().getSimpleName());//获取属性类型
//            s.append(" ");
//            s.append(f.getName());//获取属性的名字
//            s.append(";\n");
//        }
//        s.append("}");
//        System.out.println(s);

        //使用一个Stringbuilder 来存放字符串
        StringBuilder str = new StringBuilder();
        //使用反射，加载字节码文件
        Class studentClass = Class.forName("com.test.Student");
        //通过字节码获取属性，返回的是一个数组
        Field[] fields = studentClass.getDeclaredFields();
        //获取类的修饰符,以及类名
        str.append(Modifier.toString(studentClass.getModifiers())+" class "+studentClass.getSimpleName()+"{\n");
        for(Field field:fields){
            str.append("\t");
            if(field.getModifiers()==0){
                str.append(" ");
            }else{
                str.append(Modifier.toString(field.getModifiers()));
                str.append(" ");
            }
            str.append(field.getType().getSimpleName()+" ");
            str.append(field.getName()+";\n");
        }
        str.append("}");
        System.out.println(str);
    }
}
