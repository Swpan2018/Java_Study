package test1.lambda;

public class demo1 {
    public static void main(String[] args) {

        Test1 t = (int a,int b)->{
            return a+b;
        };

        Test2 t2 = ()-> System.out.println("无参");

        Test3 t3 = a->a;
        t2.test();
        System.out.println(t3.test(5));

        System.out.println(t.add(3,4));

        //方法引用(用对象::实例方法)
        TestA testa = new TestA();
        Test1 t11 = testa::test;//方法引用
        System.out.println( t11.add(3,4));//调用接口中对应的功能
    }
}

//接口
interface Test1{
    int add(int a,int b);
}

//方法，用来作为lambda体
class TestA{
    public int test(int a,int b){
        return a+b;
    }
}


//接口2
interface Test2{
    void test();
}

//接口3
interface Test3{
    int test(int a);
}
