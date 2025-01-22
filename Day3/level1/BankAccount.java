
import java.util.Scanner;
import java.util.*;
class BankAccountClass{
	static int totalNumber=0;
	static String bankName;
	 String accountHolder ;
    final int accountNumber  ;
	
	BankAccountClass(){
		this.accountHolder="Item";
		this.accountNumber=0;
		BankAccountClass.bankName="State Bank";
		BankAccountClass.totalNumber++;
		}
	BankAccountClass(String accountHolder,int accountNumber,String bankName){
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		BankAccountClass.bankName=bankName;
		BankAccountClass.totalNumber++;
		
		
	}
		
		
	public static void getTotalAccounts(){
		System.out.println("The total number of account opened :- "+BankAccountClass.totalNumber);
	}
	public void displayBankAccountClassDetails() {
        System.out.println("Owner of Bank Account :- " + accountHolder);
		System.out.println("Bank Account number :- " + accountNumber);
		System.out.println("Name of Bank :- " + bankName);
		
		
        
    }
	//new function
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
		
		System.out.print("Enter your bank name :- ");
		String bankName=sc.nextLine();
		System.out.println();
		 
		 BankAccountClass bankAccount=new BankAccountClass(accountHolder,accountNumber,bankName);
		 bankAccount.displayBankAccountClassDetails();
		 
		 BankAccountClass.getTotalAccounts();
		 
		  System.out.print("This object is type of :- " +(bankAccount instanceof BankAccountClass));
		
		 
		 
	 }
 }
 
 
