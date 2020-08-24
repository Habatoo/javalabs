package Mod4.domain;

/**
 * Checking account class
 * @author habatoo
 * */
public class CheckingAccount extends Account {
    double overdraftAmount;

    public CheckingAccount(double initBalance, double overdraftAmount) {
        this.balance = initBalance;
        this.overdraftAmount = overdraftAmount;
    }

    public CheckingAccount(double initBalance) {
        this(initBalance, 0);
    }

    /***
     * Method to take money from Checking account
     * @param amt less than overdraftAmount
     */
    //@Override
    public boolean withdraw(double amt) throws OverdraftException {
        if (amt <= balance + overdraftAmount) {
            balance = balance - amt;
            return true;
        }
        throw new OverdraftException(amt - balance - overdraftAmount, "Error insuficient funds!");
    }

    public double getOverdraftAmount() {
        return overdraftAmount;
    }
}
