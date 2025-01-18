
import java.util.Scanner;
import java.util.*;
class BookClass{
	public int ISBN;
    protected String title  ;
    private String author ;
	
	public void authors(String author){
	 this.author=author;
	}
	public String show() {
	return author;}
	
	
}

class BookStore extends BookClass{
	BookStore(int ISBN,String title ,String author){
		authors(author);
		this.title =title ;
		this.ISBN=ISBN;
	}
	
	void display(){
		System.out.println("Book ISBN :- "+ISBN);
		System.out.println("Book title  :- "+title );
		System.out.println("Book author :- "+show());
	}
}

public class Book{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter your ISBN :- ");
		int ISBN=sc.nextInt();
		System.out.println();
		 sc.nextLine();
		
		System.out.print("Enter your author  :- ");
		String author =sc.nextLine();
		System.out.println();
		
		System.out.print("Enter title of the book :- ");
		String title=sc.nextLine();
		System.out.println();
		
		BookStore pg = new BookStore(ISBN,title,author);
		pg.display();
		
	}
}
