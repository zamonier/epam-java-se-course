package unit7.future;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
        Future<Integer> firstJob = ex.submit(new Job());
        Future<Integer> secondJob = ex.submit(new Job());
        try {
            System.out.println("а я уже здесь");

            while (!firstJob.isDone()) {
                System.out.println("полезная работа");
                TimeUnit.MILLISECONDS.sleep(10);
            }
            System.out.println(firstJob.get());

            while (!secondJob.isDone()) {
                System.out.println("полезная работа 2");
                TimeUnit.MILLISECONDS.sleep(10);
            }
            System.out.println(secondJob.get());

        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        } finally {
            ex.shutdown();
        }
    }
}
