package Volatile;

public class FinalConstructor {

    final int a;
    int b;
    static FinalConstructor finalConstructor;
    public FinalConstructor() {
        a = 1;
        b = 2;
    }

    public static void write() {
        finalConstructor = new FinalConstructor();

    }

    public static void read() {
        FinalConstructor constructor = finalConstructor;
        int A = constructor.a;
        int B = constructor.b;
        System.out.println("---A---"+A);
        System.out.println("---B---"+B);
    }

    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                FinalConstructor.write();
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                FinalConstructor.read();
            }
        };
        t2.start();
        t1.start();
    }

}
