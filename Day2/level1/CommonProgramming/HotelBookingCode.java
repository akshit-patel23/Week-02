import java.util.Scanner;

class HotelBooking{
	String guestName, roomType;
    int nights;
	
	HotelBooking(){
		this.guestName="For couples";
		this.roomType="Suites";
		this.nights=4;
	}
    // Constructor to initialize 
     HotelBooking(String guestName,String roomType,int nights){
		this.guestName=guestName;
		this.roomType=roomType;
		this.nights=nights;}

     HotelBooking(HotelBooking person){
		this.nights=person.nights;
		this.roomType=person.roomType;
	    this.guestName=person.guestName;
	
	}

   
    // display
    void display() {
        System.out.println("The name of the guest is " + guestName);
		System.out.println("The type of room is " + roomType);
        System.out.println("The nights :- " + nights);
   
    }
}

class  HotelBookingCode {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Get the info
        
        System.out.print("Enter the name of the guest: ");
        String guestName = sc.nextLine();
		
        System.out.print("Enter the type of your room: ");
        String roomType = sc.nextLine();

        System.out.print("Enter the number of nights you wants to stay : ");
        int nights = sc.nextInt();
		System.out.println();
        


        System.out.println("---------Default constructor--------- ");
        
         HotelBooking hotelBooking1 = new  HotelBooking();
		 hotelBooking1.display();
		 
		System.out.println("---------Parameterized constructor--------- ");
        
		 HotelBooking hotelBooking2= new  HotelBooking(guestName,roomType,nights);
		 hotelBooking2.display();
		 
         System.out.println("---------Copy constructor--------- ");
         
		 HotelBooking hotelBooking3 = new  HotelBooking(hotelBooking2);
		 hotelBooking3.display();

       
    }
}