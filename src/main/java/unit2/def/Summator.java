package unit2.def;

/**
 * Created by Eugene on 18.02.17.
 */
public interface Summator {

    default int add(int a, int b) {

        System.out.println("Summator");
        return a + 2 * b;
    }
}
