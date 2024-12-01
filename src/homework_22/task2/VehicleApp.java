package homework_22.task2;

public class VehicleApp {
    public static void main(String[] args) {

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Motorcycle motorcycle = new Motorcycle();

        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = car;
        // vehicles[1] = new  Bicycle();
        vehicles[2] = motorcycle;

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].startEngine();
        }
    }
}
