package unit2.lambdas;

public interface FunInt {

    default int add() {
        System.out.println("aaa");
        return 0;
    }

    int add2();
}
