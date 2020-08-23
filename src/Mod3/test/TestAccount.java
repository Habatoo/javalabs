package Mod3.test;

import Mod3.domain.Bank;
import Mod3.domain.CheckingAccount;
import Mod3.domain.Customer;
import Mod3.domain.SavingAccount;

/**
 * Test class for class Account
 * @author habatoo
 * */
public class TestAccount {
    /**
     * main point
     * */
    public static void main(String[] args) {

        Customer firstCustomer = new Customer("John Doe");
        Customer secondCustomer = new Customer("Jane Doe");

        SavingAccount johnSaving = new SavingAccount(1000, 7);
        CheckingAccount johnAccount = new CheckingAccount(5000, 1000);
        CheckingAccount janeAccount = new CheckingAccount(500, 100);
        firstCustomer.addAccount(johnSaving);
        firstCustomer.addAccount(johnAccount);
        secondCustomer.addAccount(janeAccount);
        Bank.addCustomers(firstCustomer);
        Bank.addCustomers(secondCustomer);

        System.out.println(Bank.getCustomers(0));

        Bank.getCustomers(0).getAccounts(0).deposit(2000);
        Bank.getCustomers(0).getAccounts(1).withdraw(5500);
        ((SavingAccount) Bank.getCustomers(0).getAccounts(0)).addInterestRate();

        System.out.println(Bank.getCustomers(0).getAccounts(0).getBalance()+"\n");
        System.out.println(Bank.getCustomers(0).getAccounts(1).getBalance()+"\n");

        System.out.println(Bank.getCustomers(1));
    }
}
