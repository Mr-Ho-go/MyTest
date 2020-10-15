package Thread.basic;


public class ThreadDemoInstance1 extends Thread {
    @Override
    public void run(){
        System.out.println("-----ThreadDemoInstance1-------"+Thread.currentThread().getName()+"======"+Thread.currentThread().getId());
    }
}
