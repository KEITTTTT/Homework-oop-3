package driver;

import transport.Bus;
import transport.Truck;

public class DriverD extends Driver<Bus> {
    public DriverD(String fullName, String category, int drivingExperience, Bus car) {
        super(fullName, "D", drivingExperience, car);
    }
}
