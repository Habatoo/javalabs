package Mod4.test;

import Mod4.domain.*;

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
        try {
            myBank.getCustomers(0).getAccounts(1).withdraw(6500);
        } catch (OverdraftException ex) {
            System.out.println(ex.getMessage()+": $"+ex.getDeficit()+"!\n");
        }
        catch (Exception ex) {
            System.out.println("Something went wrong"+ex.getMessage());;
        }
        ((SavingAccount) myBank.getCustomers(0).getAccounts(0)).addInterestRate();

        System.out.println(myBank.getCustomers(0).getAccounts(0).getBalance()+"\n");
        System.out.println(myBank.getCustomers(0).getAccounts(1).getBalance()+"\n");

        System.out.println(myBank.getCustomers(1));
    }
}
