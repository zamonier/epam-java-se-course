package unit2.def;

/**
 * Created by Eugene on 18.02.17.
 */
public class SummSumm extends CalSumm implements Summator {
    public static void main(String[] args) {
        SummSumm s = new SummSumm();
        int add = s.add(3, 5);
        System.out.println(add);
    }
}
