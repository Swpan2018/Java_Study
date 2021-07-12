package test1.InnerClass;

public class Outer {
    private int num=10;//外部类成员变量
    public class Inner{
        private int num=20;//内部类成员变量
        public void method(){
            int num=30;//局部变量
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer.this.num);
        }
    }

    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.method();
    }
}
