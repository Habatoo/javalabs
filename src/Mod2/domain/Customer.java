package Mod2.domain;

import java.util.Arrays;

/**
 * Bank customer class
 * @author habatoo
 * */
public class Customer {
    private int customerNumber;
    private String fullName;
    private Account[] accounts;

    private static  int customerNumberBase = 1000;
    private int numOfAccounts;

    public Customer(String fullName) {
        accounts = new Account[10];
        this.fullName = fullName;
        this.customerNumber = customerNumberBase++;
        this.numOfAccounts = 0;
    }

    /**
     * Get all accounts of customer
     * */
    public Account getAccounts(int accNo) {
        if (accNo < accounts.length && numOfAccounts != 0) {
            return  accounts[accNo];
        }
        return null;
    }

    public void addAccount(Account acc) {
        if (numOfAccounts < 10) {
            accounts[numOfAccounts] = acc;
            numOfAccounts++;
        }
    }

    @Override
    public String toString() {
        return "Customer" +
                "customerNumber=" + customerNumber +
                ", fullName='" + fullName + '\'' +
                ", numOfAccounts=" + numOfAccounts;
    }
}
