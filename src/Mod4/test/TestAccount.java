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
        Bank bank = Bank.getBank();

        Customer firstCustomer = new Customer("John", "Doe");
        Customer secondCustomer = new Customer("Jane", "Doe");

        SavingAccount johnSaving = new SavingAccount(1000, 7);
        CheckingAccount johnAccount = new CheckingAccount(5000, 1000);
        CheckingAccount janeAccount = new CheckingAccount(500, 100);
        firstCustomer.addAccount(johnSaving);
        firstCustomer.addAccount(johnAccount);
        secondCustomer.addAccount(janeAccount);
        bank.addCustomers(firstCustomer);
        bank.addCustomers(secondCustomer);

        System.out.println(bank.getCustomers(0));

        bank.getCustomers(0).getAccounts(0).deposit(2000);
        try {
            bank.getCustomers(0).getAccounts(1).withdraw(5500);
        } catch (OverdraftException ex) {
            System.out.println(ex.getMessage()+": $"+ex.getDeficit()+"!\n");
        }
        catch (Exception ex) {
            System.out.println("Something went wrong"+ex.getMessage());;
        }
        ((SavingAccount) bank.getCustomers(0).getAccounts(0)).addInterestRate();

        System.out.println(bank.getCustomers(0).getAccounts(0).getBalance()+"\n");
        System.out.println(bank.getCustomers(0).getAccounts(1).getBalance()+"\n");

        System.out.println(bank.getCustomers(1));
    }
}
