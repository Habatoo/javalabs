package Mod3.domain;

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
        accounts[numOfAccounts] = acc;
        numOfAccounts++;
    }

    @Override
    public String toString() {
        String s =  "Customer" + "customerNumber=" + customerNumber +
                ", fullName='" + fullName + '\'' +
                ", numOfAccounts=" + numOfAccounts;
        for (int i = 0; i < this.numOfAccounts; i++) {
            Account acc = getAccounts(i);
            if (acc instanceof SavingAccount) {
                s = s + "\n\t" + (i+1) + " Saving account with interest rate %" + ((SavingAccount) acc).getInterestRate();
            } else  {
                s = s + "\n\t" + (i+1) + " Checking account with overdfaft  $" + ((CheckingAccount) acc).getOverdraftAmount();
            }
            s = s + ", balance $" + acc.getBalance();
        }
        s = s + "\n";
        return s;
    }
}
