package driver;

import transport.Car;
import transport.Truck;

public class DriverB extends Driver<Car> {
    public DriverB(String fullName, String category, int drivingExperience, Car car) {
        super(fullName, "B", drivingExperience, car);
    }
}