package unit4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Eugene on 25.02.17.
 */
public class IOExample {
    public static void main(String[] args) throws IOException {

        byte[] bytesToWrite = {1, 2, 3};
        String fileName = "1.txt";

        writeToFile(bytesToWrite, fileName);

        byte[] bytes = readFromFile(fileName);

        for (byte b : bytes) {
            System.out.println(b);
        }
    }

    private static byte[] readFromFile(String fileName) throws IOException {

        FileInputStream inFile = new FileInputStream(fileName);
        System.out.println("Файл открыт для чтения");

        int bytesAvailable = inFile.available();
        System.out.println("Готово к считыванию: " + bytesAvailable + " байт");

        byte[] bytesReaded = new byte[bytesAvailable];
        System.out.println("Считано: " + inFile.read(bytesReaded) + " байт");

        inFile.close();
        System.out.println("Входной поток закрыт");

        return bytesReaded;
    }

    private static void writeToFile(byte[] bytesToWrite, String fileName) throws IOException {

        FileOutputStream outFile = new FileOutputStream(fileName);
        System.out.println("Файл открыт для записи");

        outFile.write(bytesToWrite);
        System.out.println("Записано: " + bytesToWrite.length + " байт");

        outFile.close();
        System.out.println("Выходной поток закрыт");
    }
}
