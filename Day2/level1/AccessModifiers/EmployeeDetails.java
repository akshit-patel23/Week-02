 import java.util.*;
 
  public class EmployeeDetails{
	 public static void main(String args[]){
		 Scanner sc = new Scanner (System.in);
		 
		 System.out.print("Enter the employeeId :");
		 int id= sc.nextInt();
		 sc.nextLine();
		 System.out.print("Enter the employee Department:");
		 String name=sc.nextLine();
		 System.out.print("Enter the employee Salary :");
		 float salary=sc.nextFloat();
		 
		 
		 Manager m1=new Manager(id,name,salary);
		 m1.display();
		 System.out.print("Enter the new salary :");
		 
		 float 	newsal= sc.nextFloat();
		 
		 m1.changeSalary(newsal);
		 
		m1.display();
		 
		 
	 }
 }
 
 
class Employee{
	 
	public int employeeId;
	protected String department;
	private float salary;
	
	Employee(int employeeId,String department, float salary){
		this.employeeId=employeeId;
		this.department=department;
		this.salary=salary;
	}
	
	public void changeSalary(float newsalary){
		this.salary=newsalary;
	}
	public void display(){
		System.out.println("Employee Details-----------------");
		System.out.println("Employee id :"+employeeId);
		System.out.println("Employee Department :"+department);
		System.out.println("Employee salary :"+salary);
	}
 }
 
class Manager extends Employee{
	 Manager(int employeeId,String department,float salary){
		 super(employeeId,department,salary);
	 }
	
 }
 
