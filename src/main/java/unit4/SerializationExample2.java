package unit4;

import java.io.*;

/**
 * Created by Eugene on 28.02.17.
 */
public class SerializationExample2 {

    public static class Man implements Serializable {

        String name;
        final int age;
        Hand rightHand = new Hand();
        transient Hand leftHand = new Hand();


        public Man(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Man{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", rightHand=" + rightHand +
                    ", leftHand=" + leftHand +
                    '}';
        }
    }

    public static class Hand implements Serializable {
        @Override
        public String toString() {
            return "Hand{}";
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        byte[] bytesForInteger = convertToBytes(1);
        printAsChars(bytesForInteger);

        System.out.println();

        byte[] bytesForMan = convertToBytes(new Man("Joe", 257));
        printAsChars(bytesForMan);

        System.out.println();

        System.out.println(convertFromBytes(bytesForMan));

        System.out.println("--------");

        byte[] bytesForMan2 = convertToBytes(new Man("Joe", 257).getClass());
        printAsChars(bytesForMan2);
    }

    private static Object convertFromBytes(byte[] bytes) throws IOException, ClassNotFoundException {

        ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(bytes);
        ObjectInputStream bytesStream = new ObjectInputStream(arrayInputStream);

        return bytesStream.readObject();
    }

    private static byte[] convertToBytes(Object o) throws IOException {
        ByteArrayOutputStream bytesStream = new ByteArrayOutputStream();
        ObjectOutputStream objectsStream = new ObjectOutputStream(bytesStream);

        objectsStream.writeObject(o);

        return bytesStream.toByteArray();
    }

    private static void printAsChars(byte[] bytes) {
        System.out.println(bytes.length);
        for (byte b : bytes) {
            System.out.print((char) b);
        }
    }

}
