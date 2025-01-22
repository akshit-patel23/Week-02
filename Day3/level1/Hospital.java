import java.util.Scanner;


class Patient{
	
	
	public static String hospitalName= "XYZ Hospital";
	
	public static int patientCount=0;
	
	private String  name;
	private int age;
	private String ailment;
	
	final String PATIENT_ID;
	
	public static int getTotalPatients(){
		return patientCount;
	}
	
	Patient(String id,String name,int age, String ailment){
		this.PATIENT_ID=id;
		this.name=name;
		this.age=age;
		this.ailment=ailment;
		this.patientCount++;
	}
	
	public void display(){
		System.out.println("-------------------");
		System.out.println(hospitalName);
		System.out.println("Total number of patients :"+getTotalPatients());
		
		System.out.println("-------------------");
		System.out.println("PATIENT DETAILS");
		System.out.println("Patient's id :"+PATIENT_ID);
		System.out.println("Patient's name :"+name);
		System.out.println("Patient's age :"+age);
		System.out.println("Patient's ailment :"+ailment);
		
		
	}
	
}

public class Hospital{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Patient's ID :");
		String id=sc.next();
		
		sc.nextLine();
		
		System.out.print("Enter the Patient's name :");
		String name=sc.nextLine();
		System.out.print("Enter the Patient's age :");
		int age=sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter the Patient's ailment :");
		String ailment=sc.nextLine();
		
		
		Patient p1=new Patient(id,name,age,ailment);
		
		if(p1 instanceof Patient){
			System.out.println("The object is an instance of Patient class");
		}
		else{
			System.out.println("The object is not an instance of Patient class");
		}
		
		p1.display();
	}
}