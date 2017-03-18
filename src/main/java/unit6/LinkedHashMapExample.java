package unit6;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("A", 1);
        map.put("E", 3);
        map.put("D", 2);
        map.put("Q", 4);

        System.out.println(map);

        map.put("D", 10);

        System.out.println(map);
    }
}
