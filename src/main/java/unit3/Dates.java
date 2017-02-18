package unit3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Eugene on 16.02.17.
 */
public class Dates {

    public static void main(String[] args) {
        Date d = new Date(Long.MAX_VALUE);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        System.out.println(sdf.format(d).toString());
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        System.out.println(instance == instance2);
        long time = instance.getTime().getTime();
        instance.set(Calendar.YEAR, 1997);
    }
}
