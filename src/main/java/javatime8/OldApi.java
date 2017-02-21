package javatime8;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * Created by Eugene on 21.02.17.
 */
public class OldApi {

    public static void main(String[] args) {

        Date date = new Date(107, 11, 13, 16, 40);
        TimeZone timeZone = TimeZone.getTimeZone("+08:00 - extended");
        Calendar calendar = new GregorianCalendar(timeZone);
        calendar.setTime(date);
        DateFormat dateFormat = new SimpleDateFormat("HH:MM Z");
        String string = dateFormat.format(calendar.getTime());
        System.out.println(string);
    }
}
