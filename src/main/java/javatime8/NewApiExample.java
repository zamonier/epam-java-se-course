package javatime8;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.util.TreeSet;

/**
 * Created by Eugene on 21.02.17.
 */
public class NewApiExample {

    public static void main(String[] args) {
        try {
            Instant start = Instant.now();
            Thread.sleep(2000);
            Instant end = Instant.now();
            Instant instant = start.plusMillis(100);
            Duration timeElapsed = Duration.between(start, end);
            System.out.println(timeElapsed.toMillis());

            System.out.println(new TreeSet(ZoneId.getAvailableZoneIds()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
