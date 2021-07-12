package test1.Thread.ConnectionDemo;

public class Consumer  extends Thread{
    private Apple apple;
    public Consumer(Apple apple){
        this.apple=apple;
    }

    @Override
    public void  run(){
        synchronized (apple){
            try {
                if(apple.getFlag()){
                    System.out.println("消费者开始吃苹果");
                    Thread.sleep(1000);
                    System.out.println("消费者吃完苹果了");
                    apple.setFlag(false);
                    Thread.sleep(1000);
                    apple.notify();
                }
                apple.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
