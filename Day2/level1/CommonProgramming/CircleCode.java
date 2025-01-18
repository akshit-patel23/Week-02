
import java.util.Scanner;

class Circle{
   int radius;
	
    // Constructor to initialize 
     Circle(){
		this.radius=250;
	}

     Circle(int radius){
		this.radius=radius;
	}

   
    // display
    void display() {
        System.out.println("The radius of Circle is " + radius);
    }
}

class  CircleCode {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Get the info
        

        System.out.print("Enter the radius: ");
        int radius = sc.nextInt();

       
         Circle  circlep = new  Circle(radius);
		 circlep.display();
		
		 Circle  circle=new  Circle();
		 circle.display();

       
    }
}
