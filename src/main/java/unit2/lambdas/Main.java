package unit2.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Eugene on 18.02.17.
 */
public class Main {

    public static void main(String[] args) {

        FunInt[] funcs = {() -> 0};

        FunInt f = () -> 0;
        f = f::add;
        System.out.println(f.add2());

        int index = Integer.parseInt(args[0]);

        System.out.println(funcs[index].add());

        int[] a = {1, 2, 3, 4, 5};
        Arrays.stream(a)
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .forEach(System.out::println);

        List<Integer> l = new ArrayList<>();
        l.add(4);
        l.add(4);
        l.add(4);
        l.add(4);
        l.stream();
    }

}
