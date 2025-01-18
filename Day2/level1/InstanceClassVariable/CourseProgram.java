
import java.util.*;
 class Course{
	static String instituteName="Technocrats";
	String courseName;
    int duration, fee;
	
	Course(){
		this.courseName="Item";
		this.duration=0;
		this.fee=0;
			}
	Course(String courseName,int duration,int fee){
		this.courseName=courseName;
		this.duration=duration;
		this.fee=fee;
		
	}
	public void displayCourseDetails() {
        System.out.println("Course Name :- " + courseName);
		System.out.println("Course duration :- " + duration);
        System.out.println("Course fee :- " + fee);
        
    }
	 public static void displayinstituteName() {
        System.out.println("Name of institute :- " + instituteName);
    }
 }
 

  public class CourseProgram{
	 public static void main(String args[]){
		 Scanner sc = new Scanner (System.in);
		 
		 System.out.print("Enter the name of course :- ");
		 String name=sc.nextLine();
		 
		 System.out.print("Enter the duration of course :- ");
		 int duration= sc.nextInt();
		 
		 System.out.print("Enter the fee of course :- ");
		 int fee= sc.nextInt();
		 
		 sc.nextLine();
		
		 Course p=new Course(name,duration,fee);
		 p.displayCourseDetails();
		 
		 Course.displayinstituteName();
		 
		 
	 }
 }
 
 
