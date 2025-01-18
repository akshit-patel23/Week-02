
import java.util.*;
 class Vehicle{
	static int registrationFee=2000;
	String ownerName, vehicleType;
   
	Vehicle(){
		this.ownerName="Item";
		this.vehicleType="Item";
			}
	Vehicle(String ownerName,String vehicleType){
		this.ownerName=ownerName;
		this.vehicleType=vehicleType;
		
	}
	public void displayVehicleDetails() {
        System.out.println("Owner of vehicle  :- " + ownerName);
		System.out.println("vehicle type :- " + vehicleType);
        
    }
	 public static void displayinstituteName() {
        System.out.println("Registration fees of vehicle :- " + registrationFee);
    }
 }
 

  public class VehicleProgram{
	 public static void main(String args[]){
		 Scanner sc = new Scanner (System.in);
		 
		 System.out.print("Enter the name of Vehicle :- ");
		 String name=sc.nextLine();
		 
		 System.out.print("Enter the type of Vehicle(wheeler type) :- ");
		 String type=sc.nextLine();
		 
		 
		 Vehicle p=new Vehicle(name,type);
		 p.displayVehicleDetails();
		 
		 Vehicle.displayinstituteName();
		 
		 
	 }
 }
 
 
