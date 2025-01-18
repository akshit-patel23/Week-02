
import java.util.*;
class LibrarySystem{
	String title;
	String author;
	double prize;
	boolean availability;
	
	LibrarySystem(){
		title = "Raygan";
		author = "Dev";
		prize = 347;
        availability = true;
	}

    LibrarySystem(String title, String author, double prize, boolean availability){
        this.title = title;
		this.author = author;
		this.prize = prize;
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
	
	void displayDetails(){
		System.out.println("Title: " +title+ " Author: " +author+ " Prize: " +prize);
		System.out.println("Available: " + (availability ? "Yes" : "No"));
	}
}

public class LibrarySystem{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the title of the book :- ");
		String title = sc.nextLine();
		System.out.println();
		
		System.out.print("Enter the author of the book :- ");
		String author = sc.nextLine();
		System.out.println();
		
		System.out.print("Enter the prize of the book :- ");
		double prize = sc.nextDouble();
		System.out.println();
		
		
		LibrarySystem c1 = new LibrarySystem();
		c1.displayDetails();
		System.out.println();
		
		LibrarySystem c2 = new LibrarySystem(title,author,prize,true);
		c2.displayDetails();
	}
}
