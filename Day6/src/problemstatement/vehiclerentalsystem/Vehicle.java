
package problemstatement.vehiclerentalsystem;

public abstract class Vehicle {
    private int rentalRate;
    private String vehicleNumber,type;
    public Vehicle(String vehicleNumber, String type, int rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(int rentalRate) {
        this.rentalRate = rentalRate;
    }


    public abstract double calculateRentalCost(int days);

    public void displayDetails() {
        System.out.println("Vehicle Number :- " + vehicleNumber);
        System.out.println("Type :- " + type);
        System.out.println("Rental Rate :- " + rentalRate);
    }
}
