package com.test.reflect;

import com.test.Person;

import java.lang.reflect.Field;

public class RefectTest2 {
    //获取成员变量的具体内容

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Person person = new Person("Mike",18);
        //获取Class
        Class field = person.getClass();
        Field declaredFields = field.getDeclaredField("age");
        //允许访问内容
        declaredFields.setAccessible(true);
        //使用get获取内容
        //返回的是age这个成员变量的具体值
        Object o = declaredFields.get(person);
        System.out.println(o);

    }
}
