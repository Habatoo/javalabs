package Mod4.domain;

/**
 * Saving account class
 * @author habatoo
 * */
public class SavingAccount extends Account {
    double interestRate;

    public SavingAccount(double initBalance, double interestRate) {
        this.balance = initBalance;
        this.interestRate = interestRate;
    }

    public void addInterestRate() {
        this.balance = this.balance + this.balance * interestRate / 100;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
