package problemstatement.ridehailingapplication;
import java.util.ArrayList;

public class Main {
    public static void calculateFares(ArrayList<Vehicle> vehicles, double distance) {
        for (Vehicle vehicle : vehicles) {
            vehicle.getVehicleDetails();
            double fare = vehicle.calculateFare(distance);
            System.out.println("Fare for the ride :- " + fare);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Vehicle car=new Car("Akshit","Car-i232y19hii","petrol",70);
        Vehicle bike=new Bike("Kunal","Bike-9u21e9679","Petrol",40);
        Vehicle auto=new Auto("ujjwal","Auto-018eo99712","E-rickshaw",50);

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        calculateFares(vehicles, 25);
    }
}