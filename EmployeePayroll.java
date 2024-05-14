class Customer {
    private final String name;
    private final int customerId;

    public Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public int getCustomerId() {
        return customerId;
    }
}

class Account {
    private final int accountId;
    private final Customer customer;
    private double balance;

    public Account(int accountId, Customer customer, double balance) {
        this.accountId = accountId;
        this.customer = customer;
        this.balance = balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    public void transfer(Account destinationAccount, double amount) {
        if (balance >= amount) {
            withdraw(amount);
            destinationAccount.deposit(amount);
        }
    }
}

public class EmployeePayroll {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Alice", 1);
        Customer customer2 = new Customer("Bob", 2);

        Account account1 = new Account(101, customer1, 1000);
        Account account2 = new Account(102, customer2, 500);

        account1.deposit(500);
        account1.withdraw(200);
        account1.transfer(account2, 300);

        System.out.println("Final balance in account " + account1.getAccountId() + ": " + account1.getBalance());
        System.out.println("Final balance in account " + account2.getAccountId() + ": " + account2.getBalance());
    }
}

