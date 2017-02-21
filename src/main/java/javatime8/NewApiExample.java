package javatime8;

import java.time.Duration;
import java.time.Instant;

/**
 * Created by Eugene on 21.02.17.
 */
public class NewApiExample {

    public static void main(String[] args) {
        try {
            Instant start = Instant.now();
            Thread.sleep(2000);
            Instant end = Instant.now();
            Duration timeElapsed = Duration.between(start, end);
            System.out.println(timeElapsed.toMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
