package com.test.reflect;

import com.test.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest3 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Person person = new Person("Mike",20);
        //先获取Class
        Class methon = person.getClass();
        //获取方法
        //指定获取的方法，也可以使用数组
        Method eat = methon.getMethod("eat");
        //如果方法有参数的话，需要加上参数对应的引用类型class
        Method setAge = methon.getMethod("setAge",Integer.class);
        Method getAge = methon.getMethod("getAge");
        //使用invoke调用方法
        eat.invoke(person);
        //给方法传参
        //返回一个Object对象
        setAge.invoke(person, 99);

        //使用get进行调用看看
        //使用getAge.invoke进行调用
        System.out.println(getAge.invoke(person));
    }
}
