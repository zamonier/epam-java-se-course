package unit5;

/**
 * Created by Eugene on 02.03.17.
 */
public class AutoClosableExample {

    public static void main(String[] args) {

        System.out.println(f());


        try (BrokenClosable b = new BrokenClosable()) {
            throw new RuntimeException("0");
        } catch (Exception e) {
            throw new RuntimeException("1");
        } finally {
            throw new RuntimeException("2");
        }
    }

    public static String  f() {
        try {
            System.out.println("2");
            System.exit(7);
            return "5";
        } catch (Exception e) {
            throw new RuntimeException("1");
        } finally {
            System.out.println("3");
            return "6";
        }
    }
}
