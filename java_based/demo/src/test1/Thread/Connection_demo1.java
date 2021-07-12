package test1.Thread;

public class Connection_demo1 {
    public static void main(String[] args) {
        Apple apple = new Apple();//用来做锁对象
        //生产者线程
        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (apple) {
                        try {
                            System.out.println("生成水果,等待消费者拿走苹果");
                            apple.wait();//生产者进入等待状态
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        //消费者线程
        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (apple) {
                        System.out.println("拿走水果,等待生产者生成苹果");
                        apple.notify();//通知生产者
                    }
                }
            }
        });
        producer.start();
        consumer.start();
    }

}

//水果资源类
class Apple{
    private boolean isEmpty;
    public  boolean isEmpty(){
        return this.isEmpty;
    }
    public void setEmpty(boolean isEmpty){
        this.isEmpty=isEmpty;
    }
}



