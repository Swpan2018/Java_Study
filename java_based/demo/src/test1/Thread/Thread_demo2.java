package test1.Thread;

public class Thread_demo2 {
    public static void main(String[] args) {
        //第一种方式，使用Thread子类的方式创建线程
        MyThread myThread = new MyThread();
        myThread.start();
        //第二种方式，使用Runnable实现类来创建线程
        Runnable run = new RunnableImp();
        Thread thread = new Thread(run);
        thread.start();

    }
}

class RunnableImp implements Runnable{
    @Override
    public void run(){
        System.out.println("实现类的方式创建的线程");
    }
}
