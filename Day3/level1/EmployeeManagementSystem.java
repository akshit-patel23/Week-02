import java.util.Scanner;
import java.util.*;
class Employee{
	static String companyName="Dev Interprises";
	static int totalNumber=0;
	String name;
	String designation;
	final int id;

	Employee(){
		name = "Raygan";
		designation = "akshit";
		id = 347;
		totalNumber++;
      }
	 Employee(String name, String designation, int id){
        this.name =name;
		this.designation = designation;
		this.id=id;
		totalNumber++;
		}
		
	
		
	public static void displayTotalEmployees(){
		System.out.println("Number of employers :- " + totalNumber);
		
	}
	public void displayDetails() {
        System.out.println("designation of employee :- " + designation);
		System.out.println("The name of employee :- " +name);
		System.out.println("The id number of employee :- " + id);
		System.out.println("Company Name of Employee :- " + companyName);
		
		
		
        
    }
	
}
	
	


public class EmployeeManagementSystem{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of the employee :- ");
		String name = sc.nextLine();
		System.out.println();
		
		System.out.print("Enter the designation of the employee :- ");
		String designation = sc.nextLine();
		System.out.println();
		
		System.out.print("Enter the id of the employee :- ");
		int id = sc.nextInt();
		System.out.println();
		
		
		Employee emp1 = new Employee(name,designation,id);
		System.out.println();
		
		emp1.displayDetails();
		System.out.println();
		
		
		emp1.displayTotalEmployees();
		 System.out.print("This object is type of :- " +(emp1 instanceof Employee));
		
	}
}