package test1.Thread;

public class MyThread extends Thread {
    @Override
    public void run(){
        for(int i=0;i<100;i++)
            System.out.println("MyThread线程正在执行中");
    }
}
