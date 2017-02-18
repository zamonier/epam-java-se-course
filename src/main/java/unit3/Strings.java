package unit3;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/**
 * Created by Eugene on 16.02.17.
 */
public class Strings {
    public static void main(String[] args) {
        String[] split = "   ff    ggg    ".split(" ");
        for (String s : split){
            System.out.println("- " + s);
        }
        System.out.println(String.valueOf(split.length));
    }
}
