import java.util.*;


class StudentReport{


public static void main(String args[]){



Scanner sc=new Scanner(System.in);

System.out.println("Enter the number of Students: ");
int n=sc.nextInt();

Student obj[]=new Student[n];


for(int i=0;i<n;i++){
sc.nextLine();
System.out.println("--------------------------------------");
System.out.println("Enter Name of the "+(i+1)+" Student: ");
String name=sc.nextLine();

System.out.println("Enter Roll Number: ");
String roll=sc.nextLine();

System.out.println("Enter Marks (out of 300 Physics, chemistry and maths): ");
int marks=sc.nextInt();

obj[i]=new Student(name,roll,marks);

}
System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
System.out.println("Results\n");

for(int i=0;i<n;i++){
obj[i].display();

}

}


}




public class Student{
// calculating marks of physics chemistry and maths
private String name,rollNumber;
private int marks;

Student(String name, String rollNumber, int marks){

	this.name=name;
	this.rollNumber=rollNumber;
	this.marks=marks;

}

public void display(){
System.out.printf("Name: %s\nRoll Number: %s\nMarks: %d\n",name,rollNumber,marks);
if((marks/3)>=80)System.out.println("Grade A \n---------------------------------------------");

else if((marks/3)>=60 && (marks/3)<=79)System.out.println("Grade B \n---------------------------------------------");

else if((marks/3)>=40 && (marks/3)<=59)System.out.println("Grade C \n---------------------------------------------");

else if((marks/3)>=30 && (marks/3)<=29)System.out.println("Grade D \n---------------------------------------------");

else System.out.println("Grade F \n---------------------------------------------");

}

}