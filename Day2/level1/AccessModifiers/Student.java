
import java.util.Scanner;
import java.util.*;
class StudentMarks{
	public int rollNumber;
    protected String name;
    private int CGPA ;
	
	public void marks(int CGPA){
	 this.CGPA=CGPA;
	}
	public int show() {
	return CGPA;}
	
	
}

class PostgraduateStudent extends StudentMarks{
	PostgraduateStudent(int rollNumber,String name,int CGPA){
		marks(CGPA);
		this.name=name;
		this.rollNumber=rollNumber;
	}
	
	void display(){
		System.out.println("Your roll number :- "+rollNumber);
		System.out.println("Your name :- "+name);
		System.out.println("Your CGPA :- "+show());
	}
}

public class Student{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter your roll number :- ");
		int rollNumber=sc.nextInt();
		System.out.println();
		 sc.nextLine();
		
		System.out.print("Enter your name :- ");
		String name=sc.nextLine();
		System.out.println();
		
		System.out.print("Enter your CGPA :- ");
		int CGPA=sc.nextInt();
		System.out.println();
		
		PostgraduateStudent pg = new PostgraduateStudent(rollNumber,name,CGPA);
		pg.display();
		
	}
}
