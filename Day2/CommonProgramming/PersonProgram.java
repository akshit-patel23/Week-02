
import java.util.Scanner;

class Person{
   int height;
	
    // Constructor to initialize 
     Person(int height){
		this.height=height;
	}

     Person(Person p){
		this.height=p.height;
	}

   
    // display
    void display() {
        System.out.println("The height of Person is " + height);
    }
}

class  PersonProgram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Get the info
        

        System.out.print("Enter the height: ");
        int height = sc.nextInt();

       
         Person personp = new  Person(height);
		 personp.display();
		
		 Person person=new  Person(personp);
		 person.display();

       
    }
}
