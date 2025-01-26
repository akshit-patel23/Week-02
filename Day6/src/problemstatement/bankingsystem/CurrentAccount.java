
package problemstatement.bankingsystem;

public class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return 0; // No interest for current accounts
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan application submitted for amount :- " + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() + overdraftLimit;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Overdraft Limit :- " + overdraftLimit);
        System.out.println("Loan Eligibility :- " + calculateLoanEligibility());
    }
}
