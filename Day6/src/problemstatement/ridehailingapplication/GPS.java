package problemstatement.ridehailingapplication;

public interface GPS {
    String getCurrentLocation();

    void updateLocation(String newLocation);
}
