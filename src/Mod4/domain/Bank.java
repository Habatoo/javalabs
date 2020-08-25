package Mod4.domain;

public class Bank {
    private Customer[] customers = new Customer[1000];
    private int numOfClients = 0;
    private static Bank myBank = new Bank();

    public static Bank getBank() {
        return myBank;
    }

    private Bank() {

    }

    public Customer getCustomers(int custNo) {
        if (custNo < customers.length) {
            return customers[custNo];
        }
        return null;
    }

    public void addCustomers(Customer newCustomer) {
        customers[numOfClients] = newCustomer;
        numOfClients++;
    }

    public int getNumOfClients() {
        return numOfClients;
    }
}
