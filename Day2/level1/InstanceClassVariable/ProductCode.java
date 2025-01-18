
import java.util.*;
 class Product{
	static int totalProducts=0;
	String productName;
    int price;
	
	Product(){
		this.productName="Item";
		this.price=0;
		Product.totalProducts++;
	}
	Product(String productName,int price){
		this.productName=productName;
		this.price=price;
		Product.totalProducts++;
	
	}
	public void displayProductDetails() {
        System.out.println("Product Name :- " + productName);
        System.out.println("Price :- " + price);
    }
	 public static void displayTotalProducts() {
        System.out.println("Total numbers of products created :- " + totalProducts);
    }
 }
 

  public class ProductCode{
	 public static void main(String args[]){
		 Scanner sc = new Scanner (System.in);
		 
		 System.out.print("Enter the name of product :- ");
		 String name=sc.nextLine();
		 
		 System.out.print("Enter the price of product :- ");
		 int price= sc.nextInt();
		 sc.nextLine();
		
		 Product p=new Product(name,price);
		 p.displayProductDetails();
		 
		 Product.displayTotalProducts();
		 
		 
	 }
 }
 
 
