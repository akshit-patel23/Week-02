import java.util.*;

class MovieTicket{
String movieName;

int seatNumber;

float price;

MovieTicket(String movieName,int seatNumber,float price){		//Constructor of MovieTicket Class
	this.movieName=movieName;
	this.seatNumber=seatNumber;
	this.price=price;
}

 public void display(){						// Display method to display details of ticket
	 System.out.println("Order Details :");
	 System.out.println("Movie Name :"+movieName);
	 System.out.println("Seat Number :"+seatNumber);
	 System.out.println("Price :"+price);
 }
}

public class MovieBooking{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		
		System.out.printf("Enter the name of movie :");
		String moviename=sc.nextLine();
		System.out.printf("Enter the Seat number :");
		int seatno= sc.nextInt();
		System.out.printf("Enter the price :");
		float price = sc.nextFloat();
		
		MovieTicket ticket=new MovieTicket(moviename,seatno,price);		//Creating object of MovieTicket class
		
		ticket.display();
	}
}