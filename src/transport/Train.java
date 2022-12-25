package transport;

public class Train extends Transport{
    private float ticketPrice;
    private int rideTime;
    private String departureStation;
    private String arrivalStation;
    private int carriageNumber;


    public Train(String brand,
                 String model,
                 int manufacturingYear,
                 String manufactureCountry,
                 String color,
                 int maxSpeed,
                 String fuelType,
                 float ticketPrice,
                 int rideTime,
                 String departureStation,
                 String arrivalStation,
                 int carriageNumber) {
        super(brand, model, manufacturingYear, manufactureCountry, color, maxSpeed, fuelType);
        setTicketPrice(ticketPrice);
        setRideTime(rideTime);
        setDepartureStation(departureStation);
        setArrivalStation(arrivalStation);
        setCarriageNumber(carriageNumber);
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = Math.max(ticketPrice, 1.0f);
    }

    public int getRideTime() {
        return rideTime;
    }

    public void setRideTime(int rideTime) {
        this.rideTime = Math.max(rideTime, 1);
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(String arrivalStation) {
        this.arrivalStation = arrivalStation;
    }

    public int getCarriageNumber() {
        return carriageNumber;
    }

    public void setCarriageNumber(int carriageNumber) {
        this.carriageNumber = Math.max(carriageNumber,1);
    }
    public void info() {
        System.out.println("Поезд " + getBrand() + " " + getModel() + "," + getManufacturingYear() + " года выпуска, сборка страны "
                + getManufactureCountry() + ", скорость движения " + getMaxSpeed() + ", станция отправления " + getDepartureStation() +
                ", станция прибытия " + getArrivalStation() + ", цена поездки " + getTicketPrice() + ", количество вагонов " + getCarriageNumber());
    }

    @Override
    public void refill() {
        System.out.println("Заправляюсь на заправке, вид топлива " + fuelType);

    }

    protected String checkFuelTypeOrDefault(String fuelType){
        if (!"Diesel".contains(fuelType)) {
            return "Diesel";
        }else{
            return fuelType;
        }
    }
    public String toString(){
        return "Train{"+
                "transport="+super.toString()+", ticketPrice+" + ticketPrice + ", rideTime"+ rideTime + ", departureStation" + departureStation +
                ", arrivalStation" + arrivalStation + ", carriageNumber" + carriageNumber;
    }

}
