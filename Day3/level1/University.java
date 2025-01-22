
import java.util.Scanner;
import java.util.*;
class UniversityStudentManagement{
	static String universityName="Dev University";
	static int totalNumber=0;
	String name;
	String grade;
	final int rollNumber;

	UniversityStudentManagement(){
		name = "Raygan";
		grade = "D";
		rollNumber = 347;
		totalNumber++;
      }
	 UniversityStudentManagement(String name, String grade, int rollNumber){
        this.name =name;
		this.grade = grade;
		this.rollNumber=rollNumber;
		totalNumber++;
		}
		
	
		
	public static void displayTotalStudents(){
		System.out.println("Number of students :- " + totalNumber);
		
	}
	public void displayDetails() {
        System.out.println("The name of student :- " +name);
		System.out.println("The rollNumber number of student :- " + rollNumber);
		System.out.println("University Name of student :- " + universityName);
		System.out.println("grade of student :- " + grade);
		
        
    }
	
}
	
	


public class University{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of the student :- ");
		String name = sc.nextLine();
		System.out.println();
		
		System.out.print("Enter the grade of the student :- ");
		String grade = sc.nextLine();
		System.out.println();
		
		System.out.print("Enter the rollNumber of the student :- ");
		int rollNumber = sc.nextInt();
		System.out.println();
		
		
		UniversityStudentManagement student = new UniversityStudentManagement(name,grade,rollNumber);
		System.out.println();
		
		student.displayDetails();
		System.out.println();
		
		
		UniversityStudentManagement.displayTotalStudents();
		 
		System.out.print("This object is type of :- " +(student instanceof UniversityStudentManagement));
		
	}
}
