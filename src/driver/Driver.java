package driver;

import transport.Transport;

public abstract class Driver<T extends Transport> {

    private final String fullName;
    private final String category;
    private final int drivingExperience;
    private final T car;

    protected Driver(String fullName, String category, int drivingExperience, T car) {
        this.fullName = fullName;
        this.category = category;
        this.drivingExperience = drivingExperience;
        this.car = car;
    }

    public void startMovement() {

        System.out.printf("Driver %s started moving ", this.fullName);
        this.car.startMovement();
    }

    public void stopMovement() {

        System.out.printf("Driver %s stopped moving ", this.fullName);
        this.car.stopMovement();
    }

    public void refill() {
        System.out.printf("Driver %s refilling the %s %s", this.fullName, this.car.getBrand(), this.car.getModel());
    }

    public String getFullName() {
        return fullName;
    }

    public String getCategory() {
        return category;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    @Override
    public String toString() {
        return String.format("Водитель %s управляет автомобилем %s %s и будет участвовать в заезде",
                this.fullName, this.car.getBrand(), this.car.getModel());
    }
}
