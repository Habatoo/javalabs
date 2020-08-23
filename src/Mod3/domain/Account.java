package Mod3.domain;

/**
 * Bank Account class
 * @author habatoo
 * */
public class Account {
    protected double balance;

    /**
     * Constructor that provides initial balance
     * @param balance must be greater than 0
     * */

    protected Account(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    public Account() {
        this.balance = 0;
    }

    /**
     * Method to add money to account
     * @param amt a positive amount of money
     * */
    public boolean deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            return true;
        }
        return false;
    }

    /***
     * Method to take money from account
     * @param amt less than balance
     */
    public boolean withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            return true;
        }
        return false;
    }

    /**
     * Method to check account balance
     * @return the balance
     * */
    public double getBalance() {
        return balance;
    }
}