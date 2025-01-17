import java.util.Scanner;

class Item{

int itemCode;
String itemName;
float price;

Item(int itemCode,String itemName,float price){		// Creating Constructor 
	this.itemCode= itemCode;
	this.itemName= itemName;
	this.price= price;
}

public void display(){								//Display method to display Item Details
	System.out.println("Item details ----------");
	System.out.println("Item Code: "+itemCode);
	System.out.println("Item Name: "+itemName);
	System.out.println("Item price: "+price);
}
public void totalCost(int qty){						//Calculating Total Cost
	System.out.printf("Total cost :"+qty*price);
}

}

public class Inventory{
	public static void main (String args[]){
		Scanner sc= new Scanner(System.in);
		
		System.out.printf("Enter itemCode :");
		int itemCode= sc.nextInt();
		
		System.out.printf("Enter name of  item :");
		String itemName=sc.next();
		
		System.out.printf("Enter price of item :");
		float price=sc.nextInt();
		
		Item it= new Item(itemCode,itemName,price);	//Instantiating Item class
		
		it.display();
		System.out.printf("Enter the quantity of item :");
		int qty=sc.nextInt();
		
		it.totalCost(qty);
		
	}
}