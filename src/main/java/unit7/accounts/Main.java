package unit7.accounts;

/**
 * Created by Eugene on 09.03.17.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        long l = System.currentTimeMillis();
        Account account = new Account(0);
        OperatorDeposit opD = new OperatorDeposit(account);
        OperatorWithdraw opW = new OperatorWithdraw(account);
        opD.start();
        opW.start();
        Thread.sleep(1);
        System.out.println(opD.getState());
        System.out.println(opW.getState());
        opD.join();
        opW.join();
        System.out.println(System.currentTimeMillis() - l + ": " + account);
    }

}
