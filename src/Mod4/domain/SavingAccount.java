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
        this.balance = this.balance * (1 + interestRate);
    }

    public double getInterestRate() {
        return interestRate;
    }
}
