package unit5;

/**
 * Created by Eugene on 02.03.17.
 */
public class ArithmeticExample {
    public static void main(String[] args) {
        int d, a;
        try {
            d = 0;
            a = 42 / d;
            System.out.println("Этот текст никогда "
                    + "не будет напечатан.");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль.");
        }
        System.out.println(1);

        try {
            int a2 = 1;
            throw new Ex3();
        } catch (Ex1 | Ex2 e) {
            e.m1();
        }
    }

    public static abstract class Ex0 extends RuntimeException {
        public abstract void m1();
    }

    public static class Ex1 extends Ex0 {

        @Override
        public void m1() {
            System.out.println("Ex1");
        }

        public void m2() {

            System.out.println("Ex1+");
        }
    }

    public static class Ex2 extends Ex0 {

        @Override
        public void m1() {
            System.out.println("Ex2");
        }
    }

    public static class Ex3 extends Ex0 {

        @Override
        public void m1() {
            System.out.println("Ex3");
        }
    }

}
