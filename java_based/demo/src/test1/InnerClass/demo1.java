package test1.InnerClass;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class demo1 {//外部类
    public class inner{//内部类
        public void method(){
            System.out.println("我是内部类的方法");
            System.out.println("内部类可以使用外部类的成员变量name:"+name);
        }
    }
    private String name="Mike";
    private int age=100;
    public void method(){
        System.out.println("我是外部类的方法");
        //实例化一个内部类对象
        new inner().method();
    }

    public static void main(String[] args) {
        System.out.println("1.===========");
        demo1 d1 = new demo1();
        d1.method();
        //用第二种方法使用内部类
        System.out.println("2.===========");
        demo1.inner in = new demo1().new inner();
        in.method();

        //使用匿名内部类实现接口的方法重写
        MyInterface myInterface = new MyInterface() {
            @Override
            public void method() {
                System.out.println("实现了匿名内部类");
            }
        };
        myInterface.method();

        //第二种方法，将匿名内部类改写成lambda表达式的形式
        MyInterface myInterface2 = ()->System.out.println("使用lambda表达式实现了匿名内部类");
        myInterface2.method();
    }
}
