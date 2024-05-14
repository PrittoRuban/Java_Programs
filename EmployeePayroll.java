
class Customer {

    private String name;
    private String address;
    private String phoneNumber;

    public Customer(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Getters and setters for name, address, and phoneNumber
}

class Account {

    private int accountNumber;
    private double balance;
    private Customer customer;

    public Account(int accountNumber, double balance, Customer customer) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customer = customer;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void transfer(Account destinationAccount, double amount) {
        if (amount <= balance) {
            balance -= amount;
            destinationAccount.deposit(amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Getters and setters for accountNumber, balance, and customer
    public double getBalance() {
        return balance;
    }
}

public class EmployeePayroll {

    public static void main(String[] args) {
        // Create customers
        Customer customer1 = new Customer("John Doe", "123 Main St", "123-456-7890");
        Customer customer2 = new Customer("Jane Smith", "456 Elm St", "987-654-3210");

        // Create accounts
        Account account1 = new Account(1, 1000.0, customer1);
        Account account2 = new Account(2, 500.0, customer2);

        // Perform transactions
        account1.deposit(500.0);
        account1.withdraw(200.0);
        account1.transfer(account2, 300.0);

        // Print account details
        System.out.println("Account 1 balance: " + account1.getBalance());
        System.out.println("Account 2 balance: " + account2.getBalance());
    }
}
