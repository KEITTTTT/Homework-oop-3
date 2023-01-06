package transport;

import java.util.concurrent.ThreadLocalRandom;

public class Bus extends Transport {

    public Bus(String brand, String model, int manufacturingYear, String manufactureCountry, String color, int maxSpeed, String fuelType) {
        super(brand, model, manufacturingYear, manufactureCountry, color, maxSpeed, fuelType);
    }

    public void info() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + "," + getManufacturingYear() + " года выпуска, сборка страны "
                + getManufactureCountry() + ", цвет " + getColor() +
                ", максимальная скорость " + getMaxSpeed() + ", используемое топливо " + fuelType);
    }

    @Override
    public void refill() {
        System.out.println("Заправляюсь на заправке, вид топлива " + fuelType);
    }

    @Override
    protected String checkFuelTypeOrDefault(String fuelType) {
        return null;
    }


    public void startMovement() {
        System.out.printf("Bus %s %s started moving ", this.getBrand(), this.getModel());
    }

    public void stopMovement() {
        System.out.printf("Bus %s %s stopped moving ", this.getBrand(), this.getModel());
    }

    public void pitStop() {
        System.out.printf("Bus %s %s performed pit-stop ", this.getBrand(), this.getModel());
    }

    public int getBestLapTime() {
        return ThreadLocalRandom.current().nextInt(1, 100);
    }

    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(1, 400);
    }
}
