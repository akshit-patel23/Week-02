
import java.util.Scanner;
import java.util.*;
class BankAccountClass{
	public int accountNumber;
    protected String accountHolder ;
    private int balance ;
	
	public void accountNumber(int balance){
	 this.balance=balance;
	}
	public int show() {
	return balance;}
	
	
}

class SavingsAccount extends BankAccountClass{
	SavingsAccount(int accountNumber,String accountHolder,int balance){
		accountNumber(balance);
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
	}
	
	void display(){
		System.out.println("Your accountNumber :- "+accountNumber);
		System.out.println("Your accountHolder :- "+accountHolder);
		System.out.println("Your balance :- "+show());
	}
}

public class BankAccount{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter your accountNumber :- ");
		int accountNumber=sc.nextInt();
		System.out.println();
		 sc.nextLine();
		
		System.out.print("Enter your accountHolder :- ");
		String accountHolder=sc.nextLine();
		System.out.println();
		
		System.out.print("Enter your balance :- ");
		int balance=sc.nextInt();
		System.out.println();
		
		SavingsAccount pg = new SavingsAccount(accountNumber,accountHolder,balance);
		pg.display();
		
	}
}
