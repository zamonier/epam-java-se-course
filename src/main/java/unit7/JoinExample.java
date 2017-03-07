package unit7;

/**
 * Created by Eugene on 07.03.17.
 */
public class JoinExample {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            System.out.println("111");
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            int a = 0;
            int s = 0;
            while (a < 1000000) {
                s += a;
                a++;
            }
        });
        t1.start();


        System.out.println(t1.getState());
        t1.interrupt();
    }
}
