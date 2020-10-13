package Thread.basic;

import jdk.management.resource.internal.inst.ThreadRMHooks;

import java.util.concurrent.FutureTask;

public class ThreadBasicDemo {


    // 线程使用
    public static void main(String[] args) throws Exception {


        // 继承Thread
//        ThreadDemoInstance1 th1 = new ThreadDemoInstance1();
//        System.out.println("------------"+Thread.currentThread().getName()+"======"+Thread.currentThread().getId());
//        th1.start();



        // 实现Runnable
//        ThreadDemoInstance2 th2 = new ThreadDemoInstance2();
//        System.out.println("------------"+Thread.currentThread().getName()+"======"+Thread.currentThread().getId());
//        Thread thread = new Thread(th2);
//        thread.start();


        // 实现Callable
        ThreadDemoInstance3 th3 = new ThreadDemoInstance3();
        System.out.println("------------"+Thread.currentThread().getName()+"======"+Thread.currentThread().getId());
        FutureTask ft = new FutureTask<>(th3);
        Thread thread = new Thread(ft);
        thread.start();
        System.out.println(ft.get());

    }


















}
