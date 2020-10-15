package Thread.Executor;

import Thread.basic.ThreadDemoInstance1;
import Thread.basic.ThreadDemoInstance2;

import java.util.concurrent.*;


/**
 * 线程池创建
 */
public class ExecutorDemo {

    public static void main(String[] args) {


        //常见线程池
        ExecutorService executorService1 = Executors.newCachedThreadPool();
        ExecutorService executorService2 = Executors.newFixedThreadPool(10);
        ExecutorService executorService3 = Executors.newScheduledThreadPool(10);
        ExecutorService executorService4 = Executors.newSingleThreadExecutor();


        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                2,10, 1L,TimeUnit.SECONDS,new SynchronousQueue<>());



        //将线程池最大线程数设置为 可用的CPU数量+1  获取CPU的数量
        Runtime runtime = Runtime.getRuntime();

        int i = runtime.availableProcessors();


        executorService3.execute(new ThreadDemoInstance1());
        executorService3.shutdown();

//        for (int i = 0; i < 5; i++) {
//
//            executorService.execute(new ThreadDemoInstance2());
//
//        }
//
//        executorService.shutdown();



//        new ThreadPoolExecutor();








        


    }










}
