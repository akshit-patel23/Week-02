package com.hybridinheritance.VehicleSystem;

public class Main {
    public static void main(String[] args) {
        ElectricVehicle electricCar = new ElectricVehicle("Tesla Model X", 250, 100);
        PetrolVehicle petrolCar = new PetrolVehicle("Ford Mustang", 220, 60);

        System.out.println("--- Electric Vehicle Details ---");
        electricCar.displayDetails();
        electricCar.charge();

        System.out.println("\n--- Petrol Vehicle Details ---");
        petrolCar.displayDetails();
        petrolCar.refuel();
    }
}

