package problemstatement.vehiclerentalsystem;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("C09000", "Petrol", 600, "Car-118--8-1878771");
        Vehicle truck = new Truck("T29909", "Petrol", 890, "Truck-1e298090987");
        Vehicle bike = new Bike("B783188", "Petrol", 300, "Bike-0-10288u1234");
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(truck);
        vehicles.add(bike);
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            System.out.println("Rental Cost for 5 days :- " + vehicle.calculateRentalCost(5));

            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println("Insurance Cost :- " + insurable.calculateInsurance());
                insurable.getInsuranceDetails();
            }

        }

    }
}