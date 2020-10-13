package Thread.basic;


import java.util.concurrent.Callable;

public class ThreadDemoInstance3 implements Callable {


    @Override
    public Object call() throws Exception {
        System.out.println("------------"+Thread.currentThread().getName()+"======"+Thread.currentThread().getId());
        return 123;
    }




}
