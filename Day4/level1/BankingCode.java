package level1;
/* Bank and Account Holders (Association)
Description: Model a relationship where a Bank has Customer objects associated with it. A Customer can have multiple bank accounts, and each account is linked to a Bank.
Tasks:
Define a Bank class and a Customer class.
Use an association relationship to show that each customer has an account in a bank.
Implement methods that enable communication, such as openAccount() in the Bank class and viewBalance() in the Customer class.
Goal: Illustrate association by setting up a relationship between customers and the bank.
*/

import java.util.*;

class BankAccount{
	 private String accountNumber;
	 private double bankBalance;
	 
	 public BankAccount(String accountNumber){
		 this.accountNumber=accountNumber;
		 this.bankBalance=0.0;
	 }
	 
	 public double showBalance(){
		 return bankBalance;
	 }
	 
	 public void deposit(int amount){
		 if(amount>0){
		 bankBalance+=amount;
	 }
	 else{
		 System.out.println("Please enter the valid amount");
	 }
	 }
	 public void withdrawl(int amount){
		 if(bankBalance>amount&&amount>0){
			 bankBalance-=amount;
		 }
		 else{
		 System.out.println("Withdraw successfull");
	 }
	 }
	  public String getAccountNumber(){
		  return accountNumber;
	  }
	  
	 
}
class Customer{
	
	private String customerName;
    private String customerId;
    private ArrayList<BankAccount> Accounts;


	
	public Customer(String customerName,String customerId){
		this.customerName=customerName;
		this.customerId=customerId;
		this.Accounts=new ArrayList<>();
	}
	public void viewBalance() {
        for (BankAccount account : Accounts) {
            System.out.println("Account Number: " + account.getAccountNumber() + " Balance: " + account.showBalance());
        }
    }

	public void openAccount(BankAccount account){
		Accounts.add(account);
	}
	
	public void showBanks(){
		for(BankAccount account: Accounts){
			System.out.println(account);
		}
	}
	
	public String getCustomerName() {
        return customerName;
    }
}

class Bank{
	private String bankName;
	private ArrayList<BankAccount> Accounts;

     public Bank(String bankName) {
        this.bankName = bankName;
        this.Accounts = new ArrayList<>();
    }
	public BankAccount openAccount(Customer customer) {
        String accountNumber = "ACC0000" + (Accounts.size() + 1);
        BankAccount newAccount = new BankAccount(accountNumber);
        customer.openAccount(newAccount); 
        Accounts.add(newAccount); 
        System.out.println("New account opened for " + customer.getCustomerName() + " with Account Number: " + accountNumber);
        return newAccount;
    }

     public String getBankName() {
        return bankName;
    }
}
	

public class BankingCode{
	public static void main(String args[]){
	    Bank bank1 = new Bank("Reserve Bank of india");
        Bank bank2 = new Bank("State bank of india");
        Bank bank3 = new Bank("B ank of india");
		
		// Customers
		Customer customer1 = new Customer("Devi", "C123");
        Customer customer2 = new Customer("Dev", "C124");
        Customer customer3 = new Customer("Ram", "C125");
        Customer customer4 = new Customer("Raya", "C126");

        // accounts
        BankAccount account1 = bank1.openAccount(customer1);
        BankAccount account2 = bank2.openAccount(customer2);
        BankAccount account3 = bank3.openAccount(customer3);
        BankAccount account4 = bank1.openAccount(customer4);

        // money deposit
        account1.deposit(500);
        account2.deposit(1000);
        account3.deposit(1500);
        account4.deposit(200);

        // withdraw
        account1.withdrawl(200);
        account2.withdrawl(150);
        account3.withdrawl(100);
        account4.withdrawl(50);

        //balance checking
        System.out.println("\n" + customer1.getCustomerName() + "'s Accounts:");
        customer1.viewBalance();

        System.out.println("\n" + customer2.getCustomerName() + "'s Accounts:");
        customer2.viewBalance();

        System.out.println("\n" + customer3.getCustomerName() + "'s Accounts:");
        customer3.viewBalance();

        System.out.println("\n" + customer4.getCustomerName() + "'s Accounts:");
        customer4.viewBalance();
    }
}