package problemstatement.vehiclerentalsystem;

public class Bike extends Vehicle implements Insurable{
    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, String type, int rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.9; // 10% discount for bikes
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05; // Insurance is 5% of the rental rate
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy Number :- " + insurancePolicyNumber);
    }
}