package problemstatement.vehiclerentalsystem;

public class Truck extends Vehicle implements Insurable{
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, String type, int rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.2; //  20% extra charge for trucks
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy Number :- " + insurancePolicyNumber);
    }
}