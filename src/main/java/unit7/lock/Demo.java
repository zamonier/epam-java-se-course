package unit7.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo implements Runnable {

    public static int count;
    private static Lock lock = new ReentrantLock();

    public void run() {
        for (int i = 0; i < 10000000; i++) {
            if (lock.tryLock()) {
                count++;
                lock.unlock();
            } else {
                i--;
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        Demo lock1 = new Demo();
        Demo lock2 = new Demo();
        Thread th1 = new Thread(lock1);
        Thread th2 = new Thread(lock2);
        th1.start();
        th2.start();
        th1.join();
        th2.join();
        System.out.println(count);

    }
}
