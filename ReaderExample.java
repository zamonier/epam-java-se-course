package unit4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Eugene on 25.02.17.
 */
public class ReaderExample {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("FileReaderExample.java");
        BufferedReader br = new BufferedReader(fr);
        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
            fr.close();
        }
    }
}
