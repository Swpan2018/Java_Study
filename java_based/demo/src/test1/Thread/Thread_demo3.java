package test1.Thread;

public class Thread_demo3 {
    public static void main(String[] args) {
        RunnableIm run = new RunnableIm();
        //出现线程安全的案例
        Thread thread = new Thread(run);
        Thread thread2 = new Thread(run);
        Thread thread3 = new Thread(run);
        thread.start();
        thread2.start();
        thread3.start();
    }
}

class RunnableIm implements Runnable{
    private int ticket=100;
    //创建一个锁对象,必须创建在run方法外面
//    Object obj = new Object();
//    int ticket = 100;
    @Override
    public void run(){
        //使用同步代码块的方法解决同步问题
//        while(true){
//            synchronized (obj){
//                if(ticket>0){
//                    try {
//                        System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票");
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }else {
//                    break;
//                }
//                ticket--;
//            }
//        }


        method();
    }

    //同步方法
    public synchronized void method(){
        while(true) {
            if(ticket>0){
                try {
                    System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票");
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                break;
            }
            ticket--;
        }

            }
    }
