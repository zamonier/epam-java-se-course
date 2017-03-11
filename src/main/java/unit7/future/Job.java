package unit7.future;

import java.util.concurrent.Callable;

public class Job implements Callable<Integer> {
    public int count = 0;

    public Integer call() {

        for (int i = 0; i < 1_000_000; i++) {
            count++;
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return count;

    }
}
