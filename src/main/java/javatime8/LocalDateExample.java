package javatime8;

import java.time.LocalDate;
import java.time.Month;

/**
 * Created by Eugene on 21.02.17.
 */
public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2001, Month.APRIL, 28);
        System.out.println(date.plusWeeks(2));
        System.out.println(date.withMonth(2));
        LocalDate localDate = LocalDate.of(2017, 1, 1).plusDays(255);
        System.out.println(localDate.getDayOfWeek());
    }
}
