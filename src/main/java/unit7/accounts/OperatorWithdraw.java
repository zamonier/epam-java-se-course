package unit7.accounts;

/**
 * Created by Eugene on 09.03.17.
 */
public class OperatorWithdraw extends Thread {

    private Account account;

    public OperatorWithdraw(Account account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < Account.NUM; i++) {
            account.withdraw(Account.AMOUNT);
        }
    }
}
