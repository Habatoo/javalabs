package Mod4.data;

import Mod4.domain.Bank;
import Mod4.domain.CheckingAccount;
import Mod4.domain.Customer;
import Mod4.domain.SavingAccount;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DataSource {
    private File dataFile;

    public DataSource(String dataFilePath) {
        dataFile = new File(dataFilePath);
    }

    public void loadData() throws IOException {
        Scanner input = new Scanner(dataFile);
        Bank bank = Bank.getBank();

        Customer customer;

        int numOfCustomers = input.nextInt();
        for (int i=0; i<numOfCustomers; i++) {
            String firstName = input.next();
            String lastName = input.next();
            bank.addCustomers(new Customer(firstName, lastName));
            customer = bank.getCustomers(i);

            int numOfAccounts = input.nextInt();
            while (numOfAccounts-- >0) {
                char accounType = input.next().charAt(0);
                switch (accounType) {
                    case 'S' : {
                        float initBalance = input.nextFloat();
                        float interestRate = input.nextFloat();
                        customer.addAccount(new SavingAccount(initBalance, interestRate));
                        break;
                    }
                    case 'C' : {
                        float initBalance = input.nextFloat();
                        float overdraftAmount = input.nextFloat();
                        customer.addAccount(new CheckingAccount(initBalance, overdraftAmount));
                        break;
                    }
                }
            }
        }
    }
}
