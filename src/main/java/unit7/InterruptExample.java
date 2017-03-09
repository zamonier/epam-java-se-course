package unit7;

import java.io.*;

/**
 * Created by Eugene on 09.03.17.
 */
public class InterruptExample {

    public static class Walk implements Runnable {
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(String.valueOf(i) + " Walking");
                Thread me = Thread.currentThread();
                if (me.isInterrupted()) {
                    System.out.println("Somebody tries to interrupt me");
                }
                if (Thread.interrupted()) {
                    System.out.println("+Somebody tries to interrupt me");
                }
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    System.out.println("!Somebody tries to interrupt me");
//                }
                try (InputStream is = new BufferedInputStream(new FileInputStream("ReaderExample.java"))) {
                    System.out.println(String.valueOf(i) + " 1111");

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("finally");
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Walk walk = new Walk();
        Thread t1 = new Thread(walk);
        t1.start();
        System.out.println(Thread.currentThread().getName());
//        t1.interrupt();
        t1.stop();
    }
}

