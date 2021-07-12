package test1.Thread.ConnectionDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Connection {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Producter producter = new Producter(apple);
        Consumer consumer = new Consumer(apple);
        producter.start();
        consumer.start();
        ExecutorService executorService = Executors.newFixedThreadPool(3);//创建三个线程
        executorService.submit(()->{
            System.out.println(Thread.currentThread()+"正在运行");
        });

    }
}
