package Thread.basic;


public class ThreadDemoInstance1 extends Thread {



    @Override
    public void run(){

        System.out.println("------------"+Thread.currentThread().getName()+"======"+Thread.currentThread().getId());
    }





}
