package unit6;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {

        ArrayList<A> as = new ArrayList<>();
        Collections.min(as);

        Map<Person, Address> map = new IdentityHashMap<>();

        Person key = new Person("Bob");
        Person key2 = new Person("Bob");
        map.put(key, new Address("Энергетиков 36А"));

        System.out.println(map.get(key2));
    }

    private static class A implements Comparable{
        @Override
        public int compareTo(Object o) {
            return 0;
        }
    }

    private static class Address {

        private String line1;

        public Address(String line1) {
            this.line1 = line1;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "line1='" + line1 + '\'' +
                    '}';
        }
    }

    private static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
