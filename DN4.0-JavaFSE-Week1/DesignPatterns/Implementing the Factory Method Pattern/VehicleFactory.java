package week1;

public class VehicleFactory {
    public Vehicle getVehicle(String type) {
        if (type.equalsIgnoreCase("car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("bike")) {
            return new Bike();
        } else {
            return null;
        }
    }
}
