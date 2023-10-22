package com.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectTest {
    public static void main(String[] args) {
        try{
            //获取字节码文件
            Class<User> userClass = User.class;
            //获得构造方法
            Object obj = userClass.getConstructor(Integer.class).newInstance(56);
            //System.out.println(user.getNo());
            //使用方法(无参方法)
            Method getNo = userClass.getMethod("getNo");
            //最终是通过invoke来调用的
            getNo.invoke(obj);
            //使用方法(有参方法)
            Method setNo = userClass.getMethod("setNo", Integer.class);
            setNo.invoke(obj,99);
            getNo.invoke(obj);
        }catch (Exception e){
            System.out.println("出错了！");
            e.printStackTrace();
        }
    }
}
