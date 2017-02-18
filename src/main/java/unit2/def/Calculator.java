package unit2.def;

/**
 * Created by Eugene on 18.02.17.
 */
public interface Calculator {

    default int add(int a, int b) {
        System.out.println("Calc");
        return a + b;
    }
}
