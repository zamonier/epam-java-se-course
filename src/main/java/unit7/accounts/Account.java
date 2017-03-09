package unit7.accounts;

/**
 * Created by Eugene on 09.03.17.
 */
public class Account {

    public final static int NUM = 1000000;
    public final static int AMOUNT = 1;

    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public synchronized void deposit(int amount) {
        int x = balance + amount;
        balance = x;
    }

    public synchronized void withdraw(int amount) {
        int x = balance - amount;
        balance = x;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}
