package week1;

public class FactoryMain {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        Vehicle v1 = factory.getVehicle("car");
        if (v1 != null) v1.start();

        Vehicle v2 = factory.getVehicle("bike");
        if (v2 != null) v2.start();

        Vehicle v3 = factory.getVehicle("truck");
        if (v3 != null)
            v3.start();
        else
            System.out.println("Invalid vehicle type.");
    }
}
