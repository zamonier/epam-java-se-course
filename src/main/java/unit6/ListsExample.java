package unit6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Eugene on 16.03.17.
 */
public class ListsExample {

    static final int N = 1_000;
    static final int INDEX = (int) (N / 2.0);
    public static final int ZZZ = 100;

    public static void main(String[] args) {

        long delta = 0;
        for (int i = 0; i < 100; i++) {
            ArrayList<Object> l = new ArrayList<>();
            LinkedList l1 = new LinkedList();
            delta += (long) Math.signum((double) (doo(l) - doo(l1)));
        }

        System.out.println(delta);
    }

    private static long doo(List l) {
        l.addAll(Collections.nCopies(N, 0));

        long start = System.nanoTime();
        for (int i = 0; i < ZZZ; i++) {
            l.add(INDEX, 6);
        }
        return System.nanoTime() - start;
    }

}
