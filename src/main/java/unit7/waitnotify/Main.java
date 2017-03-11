package unit7.waitnotify;

/**
 * Created by Eugene on 09.03.17.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        SharedResource r = new SharedResource();

        IntegerSetterGetter sg1 = new IntegerSetterGetter("1", r);
        IntegerSetterGetter sg2 = new IntegerSetterGetter("2", r);
        IntegerSetterGetter sg3 = new IntegerSetterGetter("3", r);
        IntegerSetterGetter sg4 = new IntegerSetterGetter("4", r);

        sg1.start();
        sg2.start();
        sg3.start();
        sg4.start();

        Thread.sleep(100);

        sg1.stopThread();
        sg2.stopThread();
        sg3.stopThread();
        sg4.stopThread();

        sg1.join();
        sg2.join();
        sg3.join();
        sg4.join();

        System.out.println("main");
    }
}
