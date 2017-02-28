package unit4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Created by Eugene on 25.02.17.
 */
public class ReaderExample {

    public static final String NAME = "ReaderExample.java";

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader(NAME);
        BufferedReader br = new BufferedReader(fr);
        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
        fr.close();

        System.out.println("-------------");

        File file = new File(NAME);
        Stream<String> lines = Files.lines(file.toPath());

        System.out.println(System.in.read());

        Object a = new Object();

        Objects.requireNonNull(a);
    }
}
