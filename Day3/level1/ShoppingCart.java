
import java.util.Scanner;

class ShoppingCartSystem {
    static int discount = 20;
    String productName;
    int price;
    int quantity;
    final int productID;
    double amount = 0;

    // Default Constructor
    ShoppingCartSystem() {
        productName = "Book";
        price = 340;
        productID = 21345;
        quantity = 1;
    }

    // Constructor with parameters
    ShoppingCartSystem(String productName, int price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Static method to update discount
    public static void updateDiscount(int discount) {
        ShoppingCartSystem.discount = discount;
    }

    // Method to calculate price after discount
    public void price() {
        amount = (price - ((price * discount) / 100.0)) * quantity; // Applying discount and multiplying by quantity
    }

    public void displayDetails() {
        System.out.println("The name of the product  :- " + productName);
        System.out.println("The productID of item :- " + productID);
    }

     public void display() {
        System.out.println("Overall price  :- " + amount);
    }
}

public class ShoppingCart {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the name of product :- ");
        String productName = sc.nextLine();
        
        System.out.print("Enter the price of the item :- ");
        int price = sc.nextInt();
        
        System.out.print("Enter the quantity of the item :- ");
        int quantity = sc.nextInt();
        
        System.out.print("Enter the productID of the item :- ");
        int productID = sc.nextInt();
        sc.nextLine();  
        // Create Product object
        ShoppingCartSystem product = new ShoppingCartSystem(productName, price, quantity, productID);
        product.price(); 
		
        System.out.print("If you want to give a new discount rate, please press Y to enter, or press N to proceed :- ");
        String decision = sc.nextLine();

         switch (decision.toUpperCase()) {
            case "Y":
                System.out.print("Enter the new rate of discount :- ");
                int newDiscount = sc.nextInt();
                ShoppingCartSystem.updateDiscount(newDiscount);  // Update discount
                sc.nextLine(); 
                break;
            case "N":
                break;
        }

        product.displayDetails();
        product.price();  
        product.display();

        System.out.println("This object is of type: " + (product instanceof ShoppingCartSystem));
    }
}
