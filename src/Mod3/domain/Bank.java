package Mod3.domain;

public class Bank {
    private static Customer[] customers = new Customer[1000];
    private static int numOfClients = 0;

    private Bank() {
    }

    public static Customer getCustomers(int custNo) {
        if (custNo < customers.length) {
            return customers[custNo];
        }
        return null;
    }

    public static void addCustomers(Customer newCustomer) {
        customers[numOfClients] = newCustomer;
        numOfClients++;
    }

    public static int getNumOfClients() {
        return numOfClients;
    }
}
