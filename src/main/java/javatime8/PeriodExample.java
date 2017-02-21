package javatime8;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static java.time.Period.between;

/**
 * Created by Eugene on 21.02.17.
 */
public class PeriodExample {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        LocalDate programmersDay = LocalDate.of(now.getYear(), 1, 1).plusDays(255);
        Period period = between(now, programmersDay.plusWeeks(52));
        System.out.println(period.getYears() + " years " +
                period.getMonths() + " months and "
                        + period.getDays() + " days before Programmers Day!");
        System.out.println(period);

        ZonedDateTime apollo11launch = ZonedDateTime.of(
                1969, 7, 16, 9, 32, 0, 0, ZoneId.of("America/New_York"));

        System.out.println(apollo11launch.getZone());
        System.out.println(ZoneId.systemDefault());


    }
}
