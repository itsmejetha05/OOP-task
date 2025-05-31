// 2. You are building a banking application that has a BankAccount class. Implement the BankAccount class with 
// encapsulation principles in mind. Include private instance variables for the account number, account holder name, 
// and account balance. Provide public methods to allow clients to deposit and withdraw funds, as well as access the 
// account balance. Ensure that the account balance cannot be accessed or modified directly.

public class BankAccount {
    // Private variables
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    // Get account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Get account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Set account holder name
    public void setAccountHolderName(String name) {
        this.accountHolderName = name;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Get balance (read-only)
    public double getBalance() {
        return balance;
    }
}
