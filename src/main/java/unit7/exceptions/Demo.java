package unit7.exceptions;

/**
 * Created by Eugene on 11.03.17.
 */
public class Demo {

    public static void main(String[] args) {

        Thread thread = new Thread(
                () -> {
                    throw new RuntimeException("It is a greate exception.");
                });

        thread.setUncaughtExceptionHandler(
                (t, e) -> System.out.println(t + " throws exception: " + e));

        thread.start();
    }

}
