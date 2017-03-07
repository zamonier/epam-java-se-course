package unit5;

import java.util.function.Consumer;

/**
 * Created by Eugene on 02.03.17.
 */
public class LambdaExample {
    public static void main(String[] args) throws Exception {
        Consumer f = (a) -> {
            throw new RuntimeException();
        };
    }
}
