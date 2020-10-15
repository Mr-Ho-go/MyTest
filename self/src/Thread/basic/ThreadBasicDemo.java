package Thread.basic;

import jdk.management.resource.internal.inst.ThreadRMHooks;

import java.util.concurrent.FutureTask;

/**
 * 三种线程实现方式
 *
 */
public class ThreadBasicDemo {


    // 线程使用
    public static void main(String[] args) throws Exception {


//        // 继承Thread
//        ThreadDemoInstance1 th1 = new ThreadDemoInstance1();
//        System.out.println("------------"+Thread.currentThread().getName()+"======"+Thread.currentThread().getId());
//        // 开启线程执行任务
//        th1.start();



//        // 实现Runnable
//        ThreadDemoInstance2 th2 = new ThreadDemoInstance2();
//        System.out.println("------------"+Thread.currentThread().getName()+"======"+Thread.currentThread().getId());
//        // 开启线程执行任务
//        Thread thread = new Thread(th2);
//        thread.start();


        // 实现Callable
        ThreadDemoInstance3 th3 = new ThreadDemoInstance3();
        System.out.println("------------"+Thread.currentThread().getName()+"======"+Thread.currentThread().getId());
        FutureTask ft = new FutureTask<>(th3);
        Thread thread = new Thread(ft);
        thread.start();
        // 守护线程
        thread.setDaemon(true);
        System.out.println("返回值"+ft.get());







    }


















}
