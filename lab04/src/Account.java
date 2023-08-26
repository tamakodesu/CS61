/**
 * This class represents a bank account whose current balance is a nonnegative
 * amount in US dollars.
 */
public class Account {

    private int balance;


    /** Initialize an account with the given balance. */
    public Account(int balance) {
        this.balance = balance;
        this.parentAccount=null;
    }
    Account parentAccount;
    /** Returns the balance for the current account. */
    public int getBalance() {
        return balance;
    }
    public Account(int balance,Account parent){
        this.balance=balance;
        this.parentAccount=parent;
    }
    /** Deposits amount into the current account. */
    public void deposit(int amount) {
        if (amount < 0) {
            System.out.println("Cannot deposit negative amount.");
        } else {
            balance += amount;
        }
    }

    /**
     * Subtract amount from the account if possible. If subtracting amount
     * would leave a negative balance, print an error message and leave the
     * balance unchanged.
     */
    public boolean withdraw(int amount) {
        // TODO
        if (amount < 0) {
            System.out.println("Cannot withdraw negative amount.");
        } else if ((this.parentAccount==null && this.balance < amount) ||(this.parentAccount!=null && this.getBalance()+this.parentAccount.getBalance() < amount)) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
            if(balance<0)
            {
                this.parentAccount.balance+=this.balance;
                this.balance=0;
            }
            return true;
        }
        return false;
    }

    /**
     * Merge account other into this account by removing all money from other
     * and depositing it into this account.
     */
    public void merge(Account other) {
        this.balance=this.getBalance()+other.getBalance();
        other.balance=0;
        // TODO
    }

}
