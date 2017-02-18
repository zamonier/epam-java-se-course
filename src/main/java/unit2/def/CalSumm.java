package unit2.def;

/**
 * Created by Eugene on 18.02.17.
 */
public class CalSumm implements Calculator, Summator {
    public static void main(String[] args) {
        CalSumm calSumm = new CalSumm();
        int add = calSumm.add(2, 4);
        System.out.println(add);
    }

    @Override
    public int add(int a, int b) {

        System.out.println("CalSumm");
        return a + 3 * b;
    }
}
