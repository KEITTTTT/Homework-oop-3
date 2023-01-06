package transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int manufacturingYear;
    private final String manufactureCountry;
    private String color;
    private int maxSpeed;
    protected final String fuelType;


    public Transport(String brand,
                     String model,
                     int manufacturingYear,
                     String manufactureCountry,
                     String color,
                     int maxSpeed,
                     String fuelType) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        ;
        if (model == null || model.isEmpty()) {

            this.model = "default";
        } else {
            this.model = model;
        }
        ;
        if (manufacturingYear <= 0) {
            this.manufacturingYear = 2000;
        } else {
            this.manufacturingYear = manufacturingYear;
        }
        if (manufactureCountry == null || manufactureCountry.isEmpty()) {
            this.manufactureCountry = "default";
        } else {
            this.manufactureCountry = manufactureCountry;
        }
        ;
        setColor(color);
        setMaxSpeed(maxSpeed);
        this.fuelType = fuelType;
    }

    public abstract void refill();

    protected abstract String checkFuelTypeOrDefault(String fuelType);

    public abstract void startMovement();

    public abstract void stopMovement();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public String getManufactureCountry() {
        return manufactureCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }

    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}


