package Mod2.test;

import Mod2.domain.Account;

/**
 * Test class for class Account
 * @author habatoo
 * */
public class TestAccount {
    /**
     * main point
     * */
    public static void main(String[] args) {
        Account myAccount = new Account(255.86);
        myAccount.deposit(120);
        myAccount.withdraw(120);
        myAccount.withdraw(400);
        System.out.println("Account balance is $"+ myAccount.getBalance());
    }
}
