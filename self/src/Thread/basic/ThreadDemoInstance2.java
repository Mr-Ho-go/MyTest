package Thread.basic;


public class ThreadDemoInstance2 implements Runnable {


    @Override
    public void run() {

        System.out.println("------------"+Thread.currentThread().getName()+"======"+Thread.currentThread().getId());



    }
}
