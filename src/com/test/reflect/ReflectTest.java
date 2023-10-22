package com.test.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class ReflectTest {
    public static void main(String[] args) {
        //获得命令行用户输入的参数
        String name;
        if (args.length > 0)name = args[0];
        else{
            Scanner in = new Scanner(System.in);
            System.out.println("Enter class name (e.g.java.util.Date):");
            name  = in.next();
        }

        try{
            //输出cl与supercl的class名
            //获取字节码
            Class cl = Class.forName(name);
            Class supercl = cl.getSuperclass();
            //返回的是整型数据
            //Modifier.toString使用modifier将整型数据改为修饰符
            String modifiers = Modifier.toString(cl.getModifiers());
            if(modifiers.length()>0) System.out.print(modifiers+" ");
            System.out.print("class "+name);
            if(supercl!=null && supercl!= Object.class) System.out.println("extends"+supercl.getName());
            System.out.print("\n{\n");
            printConstructors(cl);
            System.out.println();
            printMethods(cl);
            System.out.println();
            printFields(cl);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //获取构造方法的
    public static void printConstructors(Class cl){
        //获取构造方法
        Constructor[] constructors = cl.getDeclaredConstructors();
        for (Constructor con:constructors){
            String name = con.getName();
            System.out.println("  ");
            String modifiers = Modifier.toString(con.getModifiers());
            if(modifiers.length()>0) System.out.print(modifiers+" ");
            System.out.print(name + "(");

            //输出参数类型
            Class[] paramTypes = con.getParameterTypes();
            for(int j =0;j<paramTypes.length;j++){
                if(j>0) System.out.print(", ");
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    //获取方法
    public static void printMethods(Class cl){
        //获取这个类下的所有方法
        Method[] methods = cl.getDeclaredMethods();
        for(Method m:methods){
            //获取返回类型
            Class retType = m.getReturnType();
            String name = m.getName();

            System.out.print("  ");
            //打印修饰符，返回类型，方法名称
            String modifiers = Modifier.toString(cl.getModifiers());
            if(modifiers.length()>0) System.out.print(modifiers+" ");
            System.out.print(retType.getName()+" "+name+"(");

            //打印参数类型
            Class[] paramTypes = m.getParameterTypes();
            for(int j=0;j<paramTypes.length;j++){
                if(j>0) System.out.print(", ");
                System.out.print(");");
            }
        }
    }

    //获取成员变量
    public static void printFields(Class cl){
        Field[] fields = cl.getDeclaredFields();
        for(Field f:fields){
            Class type = f.getType();
            String name = f.getName();
            System.out.print("  ");
            String modifiers = Modifier.toString(f.getModifiers());
            if(modifiers.length()>0) System.out.print(modifiers+" ");
            System.out.println(type.getName()+" "+ name +";");

        }
    }





}
