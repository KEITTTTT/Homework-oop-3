package transport;

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
}
