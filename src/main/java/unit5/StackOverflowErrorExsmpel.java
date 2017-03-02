package unit5;

/**
 * Created by Eugene on 02.03.17.
 */
public class StackOverflowErrorExsmpel {

    public static void main(String[] args) {
        try {

            f(1);
        } catch (StackOverflowError e){
            System.out.println(e.getStackTrace().length);
        }
    }

    public static void f(int i){
        f(++i);
    }
}
