import java.util.*;

 class Book{
 String title;
 String author;
 int price;
 
 Book(String title,String author,int price){	// Constructor for Book class
	 this.title=title;
	 this.author=author;
	 this.price=price;
 }
 public void display(){						//Display method for book details
	 System.out.println("The Book "+title+" is authored by "+author+ " having price "+price);
 }

}

public class BookDetails{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the title of book :");
		String title=sc.nextLine();
		
		
		System.out.println("Enter the author of book :");
		String author=sc.nextLine();
		
		System.out.println("Enter the price of book :");
		int price=sc.nextInt();
		
		Book b1= new Book(title,author,price);	// creating object of book class
		
		b1.display();
	}
}