package nl.duo.javaklasje.carcase;

import nl.duo.javaklasje.carcase.Exceptions.TankOverfillException;
import nl.duo.javaklasje.carcase.domain.Car;
import nl.duo.javaklasje.carcase.domain.RaceCar;
import nl.duo.javaklasje.carcase.domain.Truck;
import nl.duo.javaklasje.carcase.domain.Vehicle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CarApp {

    public static void main(String[] args) {


        Vehicle car = new Car("ps494s");
        Vehicle racer = new RaceCar();
        Vehicle trucky = new Truck();

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(racer);
        vehicles.add(trucky);

        carInspector(vehicles);
    }

    public static void carInspector(List<Vehicle> vehicles) {

        // try to invoke the getWeight method of the Truck using the instanceof keyword

        for (Vehicle v : vehicles) {
            if (v instanceof Truck){
                Truck truck = (Truck)v;
                System.out.println(truck.getWeight());
            }
        }
    }


    private static void arrayListje() {
        int speed = 54;
        int age = 20;
        int yearOfRegistration = 1976;
        System.out.println("Welcome to my very first car application! Yahoo!");
        System.out.println(speed);
        int[] carArray = {age, yearOfRegistration};
        List carList = new ArrayList();
        for (int eigenschap : carArray) {
            System.out.println(eigenschap);
            carList.add(eigenschap);
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(carList.get(i));
        }
    }

    private static void autotjes() {
        Car auto = new Car("63-PP-FF");
        auto.setSpeed(146);
        System.out.println(auto.toString());
        auto.drive();
        System.out.println(auto.toString());
        auto.drive();
        System.out.println(auto.toString());
        auto.fill(21);
        System.out.println(auto.toString());
        auto.drive();
        System.out.println(auto.toString());
        auto.fill();
        System.out.println(auto.toString());
        auto.licencePlateCheck("03-JKD-7");
        Car kever = new Car("VG-GS-24", LocalDate.of(1998, 4, 13));
        System.out.println("Registration date is " + kever.getRegistrationDate());
        System.out.println(kever.carAge());
    }
}
