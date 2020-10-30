package Volatile;

public class VolatileTestDemo {

    volatile boolean isStop = false;
    public void test() {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                isStop = true;
            }
         };
        Thread t2 = new Thread() {
             @Override
             public void run() {
                 while (!isStop) {
//                     System.out.println("");
                 }
             }
         };
        t2.start();
        t1.start();
    }

    public static void main(String args[]) throws InterruptedException {
        new VolatileTestDemo().test();
    }



}
