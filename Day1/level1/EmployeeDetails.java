import java.util.Scanner;

class Employee{	// Class Employee have properties name, id, salary
	String name;
	int id;
	int salary;
	
	Employee(String name, int id, int salary){ // Constructor of Employee class
	this.name=name;
	this.id = id;
	this.salary= salary;
	}
	
	public void display(){		// Method to display information of employees
		System.out.println("The name of employee is :"+name);
		System.out.println("The id of employee is :"+id);
		System.out.println("The salary of employee is :"+salary);
	}
}
public class EmployeeDetails{ 

	public static void main (String args[]){
		
	Scanner sc= new Scanner(System.in); 
	System.out.println("Enter employee name");
	String name = sc.next();
	System.out.println("Enter employee id");
	int id = sc.nextInt();
	System.out.println("Enter employee salary");
	int salary=sc.nextInt();
	
	Employee emp= new Employee(name,id,salary); // instantiating Employee 
	
	emp.display();
	}
	
}
