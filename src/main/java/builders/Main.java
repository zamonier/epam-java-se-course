package builders;

/**
 * Created by Eugene on 14.02.17.
 */
public class Main {
    public static void main(String[] args) {

        A.Builder builder = new A().new Builder();
        A a = builder.x(5).build();

    }
}
