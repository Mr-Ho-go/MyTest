package Thread.basic;


public class ThreadDemoInstance1 extends Thread {



    @Override
    public void run(){
        // 显示线程名称
        System.out.println("-----ThreadDemoInstance1-------"+Thread.currentThread().getName()+"======"+Thread.currentThread().getId());
    }



}
