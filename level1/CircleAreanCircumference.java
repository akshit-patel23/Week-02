import java.util.*;
import java.lang.*;

class Circle{
	int radius;
	
	Circle(int r){				//Constructor Circle()
		this.radius=r;
	}
	private double area (){			//method to calculate area
		return Math.PI*(radius*radius);
	}
	
	private double circumference(){		// method to calculate circumference
		return 2*Math.PI*radius;
	}
	
	public void display(){				// method to display area and circumference
		double ar= area();
		double circum=circumference();
		System.out.println("The area of circle is "+ar+ "and the circumference is "+circum);
		
	}
}

public class CircleAreanCircumference{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the radius of circle");
		int r=sc.nextInt();
		
		
		Circle c= new Circle(r);		// Creating object of class Circle
		c.display();
	}
}
