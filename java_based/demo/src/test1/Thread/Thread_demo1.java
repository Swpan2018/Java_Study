package test1.Thread;

public class Thread_demo1 {
    public static void main(String[] args) {
        //创建线程，必须要实现Runnable接口
        Runnable r = new Runnable() {
            @Override
            public void run(){
                try{
                    for(int i=0;i<100;i++){
                        System.out.println("线程1正在执行 "+i+" 中");
                        Thread.sleep(1000);
                    }
                }catch (InterruptedException e){
                    System.out.println("捕获了异常");
                }

            }
        };
        //线程创建
        Thread thread = new Thread(r);
        //lambad表达式实现Runnable接口
        Thread thread2 = new Thread(()->{
            try{
                for(int i=0;i<100;i++){
                    System.out.println("线程2正在执行 "+i+" 中");
                    Thread.sleep(1000);
                }
            }catch (InterruptedException e){
                System.out.println("捕获了异常");
            }
        });
        //启动线程
        thread.start();
        thread2.start();

    }
}
