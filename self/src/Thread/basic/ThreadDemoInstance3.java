package Thread.basic;


import java.util.concurrent.Callable;

public class ThreadDemoInstance3 implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("-----ThreadDemoInstance3-------"+Thread.currentThread().getName()+"======"+Thread.currentThread().getId());
        // 带返回值
        return 123;
    }
}
