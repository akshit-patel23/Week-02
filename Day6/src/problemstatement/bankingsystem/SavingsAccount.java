
package problemstatement.bankingsystem;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Interest Rate :- " + interestRate + "%");
        System.out.println("Interest :- " + calculateInterest());
    }
}
