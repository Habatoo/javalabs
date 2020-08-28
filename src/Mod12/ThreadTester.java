package Mod12;

public class ThreadTester {
    public static void main(String[] args) {
        Runnable tread = new PrintMe();
        Thread t1 = new Thread(tread);
        Thread t2 = new Thread(tread);
        Thread t3 = new Thread(tread);

        t1.setName("Tread 1 - John");
        t2.setName("Thread 2 - Jane");
        t3.setName("Thread 3 - Jake");

        t3.setPriority(Thread.MAX_PRIORITY);
        //t1.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
