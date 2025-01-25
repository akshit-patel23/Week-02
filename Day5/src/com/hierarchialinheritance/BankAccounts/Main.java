package com.hierarchialinheritance.BankAccounts;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA123", 5000.00, 3.5);
        CheckingAccount checking = new CheckingAccount("CA456", 2000.00, 1000.00);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD789", 10000.00, 12);

        System.out.println("--- Savings Account Details ---");
        savings.displayDetails();
        savings.displayAccountType();

        System.out.println("\n--- Checking Account Details ---");
        checking.displayDetails();
        checking.displayAccountType();

        System.out.println("\n--- Fixed Deposit Account Details ---");
        fixedDeposit.displayDetails();
        fixedDeposit.displayAccountType();
    }
}
