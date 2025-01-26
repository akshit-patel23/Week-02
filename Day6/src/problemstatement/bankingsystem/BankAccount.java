
package problemstatement.bankingsystem;

public abstract class BankAccount {
    private String accountNumber;

    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Concrete methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance :- " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance :- " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
    public abstract double calculateInterest();

    // Display account details
    public void displayDetails() {
        System.out.println("Account Number :- " + accountNumber);
        System.out.println("Name of Account Holder :- " + holderName);
        System.out.println("Account Balance :- " + balance);
    }
}
