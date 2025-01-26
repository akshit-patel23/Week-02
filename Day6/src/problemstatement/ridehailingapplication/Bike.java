package problemstatement.ridehailingapplication;

public class Bike extends Vehicle implements GPS{
    private String newLocation;
    private String driverName;
    Bike(String driverName,String vehicleNumber, String type, int rentalRate){
        super(vehicleNumber,driverName,rentalRate);
        this.driverName=driverName;
    }

    @Override
    public String getCurrentLocation() {
        return newLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.newLocation=newLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return distance*getRatePerKm();
    }
}
