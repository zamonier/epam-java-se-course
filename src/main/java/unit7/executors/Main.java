package unit7.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Eugene on 11.03.17.
 */
public class Main {

    public static class SimpleThread implements Runnable {
        private final String name;
        int count = 0;

        public SimpleThread(String name1) {
            this.name = name1;
        }

        public void run() {
            for (int i = 0; i < 1_000; i++) {
//                System.out.println(Thread.currentThread().getName() +"|"+ count);
                count++;
                throw new RuntimeException();
            }
            System.out.println(Thread.currentThread().getName() + "  " + name + "|!!!!!");
        }
    }

    public static void main(String[] args) {

        ExecutorService ex = Executors.newFixedThreadPool(1000);
        ex.execute(new SimpleThread("name1"));
        ex.execute(new SimpleThread("name2"));
        ex.execute(new SimpleThread("name3"));
        ex.execute(new SimpleThread("name4"));
        ex.shutdown();
    }
}

