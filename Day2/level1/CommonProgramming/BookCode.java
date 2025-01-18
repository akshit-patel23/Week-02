import java.util.Scanner;

class Book {
    String title  ;
    String author ;
	int price;
	
    // Constructor to initialize
    Book(){
		this.title="New Story";
		this.author="Dev";
		this.price=250;
	}

    Book(String title,String author,int price){
		this.title=title;
		this.author=author;
	    this.price=price;
	}

   
    // display
    void display() {
        System.out.println("The name of book is " + title + ". The author of book is " + author + " and price of book is " + price);
    }
}

class BookCode {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Get the info
        System.out.print("Enter the name of book: ");
        String name = sc.nextLine();
		System.out.print("Enter the name author : ");
        String author = sc.nextLine();


        System.out.print("Enter the price: ");
        int price = sc.nextInt();

       
        Book bookp = new Book(name,author,price);
		bookp.display();
		
		Book book=new Book();
		book.display();

       
    }
}