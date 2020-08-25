package Mod4.domain;

import java.util.ArrayList;

/**
 * Bank customer class
 * @author habatoo
 * */
public class Customer {
    private int customerNumber;
    private String firstName;
    private String lastName;
    private ArrayList<Account> accounts;

    private static  int customerNumberBase = 1000;
    private int numOfAccounts;

    public Customer(String firstName, String lastName) {
        accounts = new ArrayList<>();
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerNumber = customerNumberBase++;
        this.numOfAccounts = 0;
    }

    /**
     * Get all accounts of customer
     * */
    public Account getAccounts(int accNo) {
        if (accNo < accounts.size() && numOfAccounts != 0) {
            return  accounts.get(accNo);
        }
        return null;
    }

    public void addAccount(Account acc) {
        accounts.add(acc);
        numOfAccounts++;
    }

    @Override
    public String toString() {
        return "Customer" +
                "customerNumber=" + customerNumber +
                ", fullName='" + firstName + lastName + '\'' +
                ", numOfAccounts=" + numOfAccounts;
    }
}
