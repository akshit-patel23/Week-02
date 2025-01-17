import java.util.Scanner;

// Creating Class with name MobilePhone to represent the details of a mobile phone
class MobilePhone {
    String brand;  
    String model;  
    double price;  

    // Constructor to initialize the attributes of the MobilePhone class
	
    MobilePhone(String brand, String model, double price)  
	{
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display all details of the mobile phone 
	
    void displayPhoneDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

// Main class  

public class MobilePhoneDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the first mobile phone
        System.out.println("Enter details for Phone 1:");
        System.out.print("Brand: ");
        String brand1 = scanner.nextLine();
        System.out.print("Model: ");
        String model1 = scanner.nextLine();
        System.out.print("Price: ");
        double price1 = scanner.nextDouble(); 
		
        scanner.nextLine(); // Consume the leftover newline

        // Taking input for the second mobile phone
        System.out.println("\nEnter details for Phone 2:");
        System.out.print("Brand: ");
        String brand2 = scanner.nextLine();
        System.out.print("Model: ");
        String model2 = scanner.nextLine();
        System.out.print("Price: ");
        double price2 = scanner.nextDouble(); 
		
		System.out.println();

        // Creating objects of the MobilePhone class
        MobilePhone phone1 = new MobilePhone(brand1, model1, price1);
        MobilePhone phone2 = new MobilePhone(brand2, model2, price2);

        // Displaying details of each mobile phone
        System.out.println("Details of the Phones:");
        System.out.println("----------------------------------");
        phone1.displayPhoneDetails();
        System.out.println(); // Blank line for better readability
        phone2.displayPhoneDetails();

        scanner.close();
    }
}
