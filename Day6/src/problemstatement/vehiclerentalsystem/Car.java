package problemstatement.vehiclerentalsystem;

public class Car extends Vehicle implements Insurable{
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, String type, int rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.1; // Insurance is 10% of the rental rate
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy Number :- " + insurancePolicyNumber);
    }
}