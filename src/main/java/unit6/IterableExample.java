package unit6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterableExample {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        strings.add("abc");
        strings.add("dec");
        strings.add("ggg");

//        replaceElementWithoutIterator(strings);

        replaceElementWithIterator(strings);
    }

    private static void replaceElementWithoutIterator(List<String> strings) {
        for (String s : strings) {
            System.out.println(s);
            if (s.startsWith("d")) {
                strings.remove(s);
                strings.add("fff");
            }
            System.out.println(strings);
        }
    }

    private static void replaceElementWithIterator(List<String> strings) {
        Iterator<String> iterator1 = strings.iterator();
        for (ListIterator<String> iterator = strings.listIterator(); iterator.hasNext(); ) {
            String s = iterator.next();
            System.out.println(s);
            if (s.startsWith("d")) {
                iterator.remove();
                iterator.add("fff");
                iterator.previous();
            }
            System.out.println(s);
            System.out.println(strings);
            iterator1.next();
            iterator1.remove();
        }
    }
}
