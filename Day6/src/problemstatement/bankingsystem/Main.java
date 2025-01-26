
package problemstatement.bankingsystem;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount("Acc2919896", "Akshit", 5000, 3.5);
        BankAccount currentAccount = new CurrentAccount("Acc0394856", "Ashika", 10000, 5000);

        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(savingsAccount);
        accounts.add(currentAccount);

        for (BankAccount account : accounts) {
            account.displayDetails();
            System.out.println();
        }

        // Demonstrating loan functionality
        if (currentAccount instanceof Loanable) {
            Loanable loanable = (Loanable) currentAccount;
            loanable.applyForLoan(20000);
            System.out.println("Loan Eligibility :- " + loanable.calculateLoanEligibility());
        }
    }
}
