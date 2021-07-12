package test1.InnerClass;

public class Outer2 {
    public void methodOuter(){
        System.out.println("外部类的方法");
        //局部内部类在这里创
        class Inner{
            public void methodInner(){
                System.out.println("内部类");
            }
        }
        //在方法中对内部类进行实例化
        Inner inner = new Inner();
        inner.methodInner();
    }

    public static void main(String[] args) {
        //使用一下局部内部类
        Outer2 outer = new Outer2();
        outer.methodOuter();//因为内部类就是在外部类的方法中创建并且实例化的，所以我们可以通过外部类的对象调用方法，进而使用局部内部类
    }
}
