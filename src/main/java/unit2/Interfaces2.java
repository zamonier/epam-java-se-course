package unit2;

/**
 * Created by Eugene on 18.02.17.
 */
public interface Interfaces2 {

    static void main(String[] s) {

        System.out.println("333");

        Interfaces2 interfaces2 = new Interfaces2() {
            @Override
            public int apply(int a, int b) {
                return a * b;
            }
        };
        int x = interfaces2.method(2, 4);
        int y = interfaces2.apply(2, 4);
        System.out.println(x);
        System.out.println(y);
    }

    default int method(int a, int b) {
        return a + b;
    }

    int apply(int a, int b);

}
