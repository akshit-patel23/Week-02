
import java.util.*;
class CarRentalSystem {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate;
    double totalCost;

    // Default Constructor
    CarRentalSystem() {
        customerName = "Dev";
        carModel = "Maruti";
        rentalDays = 3;
        dailyRate = 20; 
        totalCost = 500;
    }

    // Parameterized Constructor
    CarRentalSystem(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
        TotalCost(); 
    }

    // Copy Constructor
    CarRentalSystem(CarRentalSystem rental) {
        this.customerName = rental.customerName;
        this.carModel = rental.carModel;
        this.rentalDays = rental.rentalDays;
        this.dailyRate = rental.dailyRate;
        this.totalCost = rental.totalCost;
    }

    // Method to calculate total cost
    void TotalCost() {
        totalCost = rentalDays * dailyRate;
    }

    // Method to display rental details
    void displayDetails() {
        System.out.println("Customer Name: " +customerName+ " carModel: " +carModel+ " rentalDays: " +rentalDays+ " dailyRate: " +dailyRate+ "Total Cost: " +totalCost);
    }
}

public class CarRentalSystemCode{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of the customer :- ");
		String customerName = sc.nextLine();
		System.out.println();
		
		System.out.print("Enter the model of the car :- ");
		String carModel = sc.nextLine();
		System.out.println();
		
		System.out.print("Enter number of rental days :- ");
		int rentalDays = sc.nextInt();
		System.out.println();
		
		System.out.print("Enter the daily rate of renting :- ");
		double dailyRate = sc.nextDouble();
		System.out.println();
		
        CarRentalSystem c1= new CarRentalSystem();
        c1.displayDetails();
		System.out.println();
		
		
		CarRentalSystem c2 = new CarRentalSystem(customerName,carModel,rentalDays,dailyRate);
		c2.displayDetails();
		System.out.println();
		
		
		CarRentalSystem c3 = new CarRentalSystem(c2);
		c3.displayDetails();
	}
}

       
    
