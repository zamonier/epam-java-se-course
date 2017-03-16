package unit6;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IterableExample {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        strings.add("abc");
        strings.add("dec");
        strings.add("ggg");

        replaceElementWithoutIterator(strings);

//        replaceElementWithIterator(strings);
    }

    private static void replaceElementWithoutIterator(List<String> strings) {
        for (String s : strings) {
            System.out.println(s);
            if (s.startsWith("a")) {
                strings.remove(s);
            }
            System.out.println(strings);
        }
    }

    private static void replaceElementWithIterator(List<String> strings) {
        ListIterator<String> iterator = strings.listIterator();
        iterator.forEachRemaining((s) -> {
            System.out.println(s);
            if (s.startsWith("d")) {
//                iterator.remove();
//                iterator.add("fff");
//                iterator.previous();
            }
            System.out.println(s);
            System.out.println(strings);
        });
    }
}
