package Mod2.test;

import Mod2.domain.*;

import java.util.Arrays;

/**
 * Test class for class Account
 * @author habatoo
 * */
public class TestAccount {
    /**
     * main point
     * */
    public static void main(String[] args) {
        Bank myBank = new Bank();

        Customer firstCustomer = new Customer("John Doe");
        Customer secondCustomer = new Customer("Jane Doe");

        SavingAccount johnSaving = new SavingAccount(1000, 7);
        CheckingAccount johnAccount = new CheckingAccount(5000, 1000);
        CheckingAccount janeAccount = new CheckingAccount(500, 100);
        firstCustomer.addAccount(johnSaving);
        firstCustomer.addAccount(johnAccount);
        secondCustomer.addAccount(janeAccount);
        myBank.addCustomers(firstCustomer);
        myBank.addCustomers(secondCustomer);

        System.out.println(myBank.getCustomers(0));

        myBank.getCustomers(0).getAccounts(0).deposit(2000);
        myBank.getCustomers(0).getAccounts(0).withdraw(5500);
        System.out.println(myBank.getCustomers(0).getAccounts(0).getBalance()+"\n");
        System.out.println(myBank.getCustomers(0).getAccounts(1).getBalance()+"\n");
    }
}
