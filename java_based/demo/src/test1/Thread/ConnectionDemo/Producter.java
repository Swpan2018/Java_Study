package test1.Thread.ConnectionDemo;

//生产者
public class Producter extends Thread{
    private Apple apple;
    public Producter(Apple apple){
        this.apple=apple;
    }
    @Override
    public void run(){
        while(true){
            synchronized(apple){
                try {
                    //有苹果，则进入等待状态，等待消费者的通知
                    if(apple.getFlag()){
                        apple.wait();
                    }
                    //唤醒之后，开始生产苹果
                    System.out.println("生产者开始生产苹果");
                    Thread.sleep(1000);
                    System.out.println("生产好苹果了");
                    apple.setFlag(true);
                    Thread.sleep(1000);
                    apple.notify();//去唤醒消费者
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
