package transport;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class Car extends Transport {

    private double engineVolume;
    private String transmission;
    final String bodyType;
    private String regNumber;
    final int numberOfSeats;
    private boolean winterTires;

    public Car(String brand,
               String model,
               int manufacturingYear,
               String manufactureCountry,
               String color,
               int maxSpeed,
               String fuelType,
               double engineVolume,
               String transmission,
               String bodyType,
               String regNumber,
               int numberOfSeats,
               boolean winterTires) {
        super(brand, model, manufacturingYear, manufactureCountry, color, maxSpeed, fuelType);
        if (engineVolume <= 0) {
            this.engineVolume = 0;
        } else {
            this.engineVolume = engineVolume;
        }
        if (transmission == null || transmission.isEmpty()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null || bodyType.isEmpty()) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        setRegNumber(regNumber);
        if (numberOfSeats <= 0) {
            this.numberOfSeats = 0;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        this.winterTires = winterTires;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void startMovement() {
        System.out.printf("Car %s %s started moving ", this.getBrand(), this.getModel());
    }

    public void stopMovement() {
        System.out.printf("Car %s %s stopped moving ", this.getBrand(), this.getModel());
    }

    public void pitStop() {
        System.out.printf("Car %s %s performed pit-stop ", this.getBrand(), this.getModel());
    }

    public int getBestLapTime() {
        return ThreadLocalRandom.current().nextInt(1, 100);
    }

    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(1, 400);
    }


    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null || regNumber.isEmpty()) {
            this.regNumber = "default";
        } else {
            this.regNumber = regNumber;
        }
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isTypeOfRubber() {
        return winterTires;
    }

    public void setTypeOfRubber(boolean typeOfRubber) {
        this.winterTires = typeOfRubber;
    }

    public void info() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + "," + getManufacturingYear() + " года выпуска, сборка страны "
                + getManufactureCountry() + ", цвет " + getColor() +
                ", максимальная скорость " + getMaxSpeed() + ", используемое топливо " + fuelType + ", объем двигателя " + engineVolume + "л." +
                ", коробка передач " + getTransmission() + ", тип кузова " + getBodyType() + ", регистрационный номер " + getRegNumber() +
                ", количество мест " + getNumberOfSeats() + ", тип резины " + winterTires);
    }

    public void letSeasonTires() {
        int currentMonth = LocalDate.now().getMonthValue();
        this.winterTires = currentMonth <= 4 || currentMonth >= 11;
    }

    public boolean isRegNumberValid() {
        if (this.regNumber.length() != 9) {
            return false;
        }
        char[] regNumberChars = this.regNumber.toCharArray();
        return isNumberLetter(regNumberChars[0])
                && isNumberLetter(regNumberChars[1])
                && isNumberLetter(regNumberChars[2])
                && isNumberLetter(regNumberChars[3])
                && isNumberLetter(regNumberChars[4])
                && isNumberLetter(regNumberChars[5])
                && isNumberLetter(regNumberChars[6])
                && isNumberLetter(regNumberChars[7])
                && isNumberLetter(regNumberChars[8]);
    }

    private boolean isNumber(char symbol) {
        return Character.isDigit(symbol);
    }

    private boolean isNumberLetter(char symbol) {
        String alloweSymbols = "AOBEKMNTCPXY";
        return alloweSymbols.contains("" + symbol);
    }

    @Override
    public void refill() {
        if (fuelType == "electric") {
            System.out.println("Заправляюсь на электрод-парковке, вид топлива " + fuelType);
        } else {
            System.out.println("Заправляюсь на заправке, вид топлива " + fuelType);
        }
    }

    @Override
    protected String checkFuelTypeOrDefault(String fuelType) {
        return null;
    }

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

    public static class Insurance {
        private final LocalDate validUntil;
        private final float cost;
        private final String number;

        public Insurance(LocalDate validUntil, float cost, String number) {
            this.validUntil = validUntil != null ? validUntil : LocalDate.now().plusDays(10);
            this.cost = Math.max(cost, 1f);
            if (number != null && !number.isEmpty() && number.length() == 9) {
                this.number = number;
            } else {
                this.number = "Номер некорректный";
            }
        }

        public boolean isNumberValid() {
            return number.length() == 9;
        }

        public boolean isInsuranceValid() {
            return LocalDate.now().isBefore(this.validUntil);
        }

        public LocalDate getValidUntil() {
            return validUntil;
        }

        public float getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }
    }
}



