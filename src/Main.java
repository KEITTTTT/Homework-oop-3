import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import transport.Bus;
import transport.Car;
import transport.Truck;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car("Lada", "Granta", 2015, "Russia", "yellow", 220, "petrol",
                1.7, "MKPP", "sedan", "P505BX163", 5, true);
        Car audi = new Car("Audi", "A8", 2020, "Germany", "black", 360, "diesel",
                3.0, "AKPP", "sedan", "A100AA177", 5, false);
        Car kia = new Car("Kia", "Sportage", 2018, "South Korea", "red", 260, "petrol",
                2.4, "AKPP", "crossover", "O539OK157", 7, true);
        Car bmw = new Car("Bmw", "Z8", 2021, "Germany", "black", 380, "electric",
                3.0, "AKPP", "coupe", "X000AM199", 2, false);
        Car hyundai = new Car("Hyundai", "Kreta", 2017, "South Korea", "white", 280, "petrol",
                2.0, "AKPP", "crossover", "M425MM179", 7, false);


        lada.info();
        audi.info();
        bmw.info();
        kia.info();
        hyundai.info();


        Bus mersedes = new Bus("Mersedes", "523", 2005, "Germany", "white", 250,
                "diesel");
        Bus liaz = new Bus("Liaz", "asdc", 1995, "Russia", "black", 180,
                "petrol");
        Bus gazelle = new Bus("Газ", "газель", 2008, "Russia", "white", 220,
                "petrol");

        mersedes.info();
        liaz.info();
        gazelle.info();

        bmw.refill();
        gazelle.refill();


        Truck sollers = new Truck("Sollers", "argo", 2000, "Japan", "white", 200,
                "petrol");
        Truck valdai = new Truck("Valdai", "Next", 2003, "Russia", "gray", 160,
                "petrol");
        Truck jac = new Truck("Jac", "N-35", 2008, "Japan", "white", 200,
                "petrol");
        sollers.info();
        valdai.info();
        jac.info();

        kia.startMovement();
        kia.pitStop();
        kia.stopMovement();
        System.out.println("Kia - " + kia.getBestLapTime());
        System.out.println("Kia - " + kia.getMaxSpeed());

        liaz.startMovement();
        liaz.pitStop();
        liaz.stopMovement();
        System.out.println("Liaz - " + liaz.getBestLapTime());
        System.out.println("Liaz - " + liaz.getMaxSpeed());

        valdai.startMovement();
        valdai.pitStop();
        valdai.stopMovement();
        System.out.println("Valdai - " + valdai.getBestLapTime());
        System.out.println("Valdai - " + valdai.getMaxSpeed());

        DriverB ivanov = new DriverB("Ivanov", "B", 5, kia);
        DriverC petrov = new DriverC("Petrov", "C", 10, valdai);
        DriverD sidorov = new DriverD("Sidorov", "D", 15, liaz);

        System.out.println(ivanov.toString());
        System.out.println(petrov.toString());
        System.out.println(sidorov.toString());

    }
}