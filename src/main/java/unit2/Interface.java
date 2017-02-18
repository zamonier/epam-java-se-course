package unit2;

/**
 * Created by Eugene on 18.02.17.
 */
public class Interface {

    public static class A implements IA {
        @Override
        public void m() {
            System.out.println("A");
        }
    }

    public static class AA extends A {

        public void m() {
            System.out.println("AA");
        }

    }

    public static class B {
        private IA field;

        public B(IA IA) {
            field = IA;
            field.m();
        }
    }

    public static void main(String[] args) {
        IA IA = new AA();
        B b = new B(IA);
        IA IA1 = new AA();
        B b2 = new B(IA1);

    }
}
