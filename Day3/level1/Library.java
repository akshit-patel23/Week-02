
import java.util.Scanner;
import java.util.*;
class LibraryManagementSystem{
	static String libraryName="Dev Library";
	String title;
	String author;
	int isbn;
	boolean availability;
	
	LibraryManagementSystem(){
		title = "Raygan";
		author = "Dev";
		isbn = 347;
        availability = true;
	}
	 LibraryManagementSystem(String title, String author, int isbn, boolean availability){
        this.title = title;
		this.author = author;
		this.isbn=isbn;
		this.availability = availability;
	}
		void borrow(){
		if(availability){
			System.out.println("The book " +title+ "is available to borrow");
			availability = false;
		}
		else{
			System.out.println("The book " +title+ "is not available");
		}
	}
	
		
	public static void displayLibraryName(){
		System.out.println("Name of Library :- " + libraryName);
		
	}
	public void displayDetails() {
        System.out.println("Author of book :- " + author);
		System.out.println("The title of book :- " + title);
		System.out.println("The isbn number of book :- " + isbn);
		
		
		
        
    }
	//new function
}
	
	


public class Library{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the title of the book :- ");
		String title = sc.nextLine();
		System.out.println();
		
		System.out.print("Enter the author of the book :- ");
		String author = sc.nextLine();
		System.out.println();
		
		System.out.print("Enter the isbn of the book :- ");
		int isbn = sc.nextInt();
		System.out.println();
		
		
		LibraryManagementSystem Book = new LibraryManagementSystem(title,author,isbn,true);
		Book.displayDetails();
		System.out.println();
		
		
		LibraryManagementSystem.displayLibraryName();
		 
		System.out.print("This object is type of :- " +(Book instanceof LibraryManagementSystem));
		
	}
}
