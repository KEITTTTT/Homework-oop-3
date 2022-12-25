import transport.Bus;
import transport.Car;
import transport.Train;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car("Lada","Granta", 2015, "Russia", "yellow",220,"petrol",
                1.7,"MKPP","sedan","P505BX163",5,true);
        Car audi = new Car("Audi","A8",2020,"Germany","black",360,"diesel",
                3.0,"AKPP","sedan","A100AA177",5,false);
        Car kia = new Car("Kia","Sportage",2018,"South Korea","red",260,"petrol",
                2.4,"AKPP","crossover","O539OK157",7,true);
        Car bmw = new Car("Bmw","Z8",2021,"Germany","black",380,"electric",
                3.0,"AKPP","coupe","X000AM199",2,false);
        Car hyundai = new Car("Hyundai","Kreta",2017,"South Korea","white",280,"petrol",
                2.0,"AKPP","crossover","M425MM179",7,false);


        lada.info();
        audi.info();
        bmw.info();
        kia.info();
        hyundai.info();

        Train lastochka = new Train("Ласточка", "B-901", 2011,"Russia", null, 301,
                "diesel", 3500,15, "Белорусский вокзал", "Минск", 11);
        Train leningrad = new Train("Ленинград", "D-125", 2019,"Russia", null, 270,
                "diesel", 1700,10, "Ленинградский вокзал", "Ленинград-пассажирский", 8);

        lastochka.info();
        leningrad.info();

        Bus mersedes = new Bus("Mersedes", "523", 2005, "Germany", "white", 250,
                "diesel");
        Bus liaz = new Bus("Liaz", "asdc", 1995, "Russia", "black", 180,
                "petrol");
        Bus gazelle = new Bus("Газ", "газель", 2008,"Russia", "white",220,
                "petrol");

        mersedes.info();
        liaz.info();
        gazelle.info();

        bmw.refill();
        lastochka.refill();
        gazelle.refill();





    }
}