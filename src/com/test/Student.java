package com.test;

import java.io.Serializable;

public class Student implements Serializable {//序列化需要使用这个接口
    private int number;
    private String classnumber;
    private int age;
    private String name;
    private String sex;

    Student(int x, String y, int z, String p) {
        number = x;//学号
        classnumber = y;//班级号
        age = z;//年龄
        name = "qqqq";//姓名
    }

    public int getNumber() {
        return number; //返回学号
    }

    public String getSClassnumber() {
        return classnumber; //返回班号
    }

    public int getAge() {
        return age;   //返回年龄
    }

    public void getName() {
        System.out.println(this.name);  //返回姓名
    }

    public String getSex() {
        return sex;  //返回性别
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setClassnumber(String classnumber) {
        this.classnumber = classnumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String toString() {
        return "学号:" + number + " 班号:" + classnumber + " 姓名:" + name + " 性别:" + sex + " 年龄:" + age;
    }
}
