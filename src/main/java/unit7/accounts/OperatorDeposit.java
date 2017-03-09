package unit7.accounts;

public class OperatorDeposit extends Thread {

    private Account account;

    public OperatorDeposit(Account account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < Account.NUM; i++) {
            account.deposit(Account.AMOUNT);
        }
    }
}

