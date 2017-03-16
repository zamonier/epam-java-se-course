package unit6;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by Eugene on 14.03.17.
 */
public class CollectionExample {
    public static void main(String[] args) {

        List<Integer> l = Collections.emptyList();
        l.add(1);
        l.add(2);
        l.add(3);

        for (Integer integer : l) {

        }

        for (Iterator<Integer> iterator = l.iterator(); iterator.hasNext(); ) {
            Integer next = iterator.next();

        }

        Collections.sort(l);

        List<Integer> integers = Arrays.asList(1, 3, 4);

        Stream.of(1, 3, 5);

        System.out.println(integers);

        List<Integer> list = Collections.unmodifiableList(l);

        Collections.synchronizedList(l);
    }
}
