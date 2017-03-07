package unit5;

/**
 * Created by Eugene on 02.03.17.
 */
public class FinallyExample {

    public static void main(String[] args) {
        System.out.println(f(1));
    }

    static int f(int a) {
        try {
            if (a == 0) {
                return 1;
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            try {
                return 7;
            } finally {
                return 6;
            }
        } finally {
            try {
                return 2;
            } finally {
                return 3;
            }
        }
    }
}
