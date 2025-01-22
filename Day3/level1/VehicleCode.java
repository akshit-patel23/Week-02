
import java.util.*;
 class Vehicle{
	static int registrationFee=0;
	final int registrationNumber;
	String ownerName, vehicleType;
   
	Vehicle(){
		this.ownerName="Item";
		this.vehicleType="Item";
		Vehicle.registrationFee=2000;
		registrationNumber=0;
		}
	Vehicle(String ownerName,String vehicleType,int registrationNumber){
		this.registrationNumber=registrationNumber;
		this.ownerName=ownerName;
		this.vehicleType=vehicleType;
		Vehicle.registrationFee=2000;
		
		
		
	}
	public void displayVehicleDetails() {
        System.out.println("Owner of vehicle  :- " + ownerName);
		System.out.println("vehicle type :- " + vehicleType);
		System.out.println("registration number :- " + registrationNumber);
		
        
    }
	//new function
	public static void updateRegistrationFee(int n){
		Vehicle.registrationFee=n;
	}
	 public static void displayinstituteName() {
        System.out.println("Registration fees of vehicle :- " + registrationFee);
    }
 }
 

  public class VehicleCode{
	 public static void main(String args[]){
		 Scanner sc = new Scanner (System.in);
		 
		 System.out.print("Enter the name of Vehicle :- ");
		 String name=sc.nextLine();
		 
		 System.out.print("Enter the type of Vehicle(wheeler type) :- ");
		 String type=sc.nextLine();
		 
		 System.out.print("Enter the registration number of vehicle :- ");
		 int registrationNumber=sc.nextInt();
		 
		 
		 Vehicle p=new Vehicle(name,type,registrationNumber);
		 p.displayVehicleDetails();
		 
		 Vehicle.displayinstituteName();
		 
		  System.out.print("This object is type of :- " +(p instanceof Vehicle));
		
		 
		 
	 }
 }
 
 
