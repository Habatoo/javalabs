package Mod2.domain;

public class Bank {
    private Customer[] customers;
    private int numOfClients;

    public Bank() {
        customers = new Customer[1000];
        numOfClients = 0;
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
}
