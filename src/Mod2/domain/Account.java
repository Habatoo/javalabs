package Mod2.domain;

/**
 * Bank Account class
 * @author habatoo
 * */
public class Account {
    private double balance;

    /**
     * Constructor that provides initial balance
     * @param balance must be greater than 0
     * */

    public Account(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    /**
     * Method to add money to account
     * @param amt a positive amount of money
     * */
    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
        }
    }

    /***
     * Method to reduse money from account
     * @param amt less than balance
     */
    public void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
        }
    }

    /**
     * Method to check account balance
     * @return the balance
     * */
    public double getBalance() {
        return balance;
    }
}