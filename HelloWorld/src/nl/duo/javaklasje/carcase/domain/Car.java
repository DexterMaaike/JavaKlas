package nl.duo.javaklasje.carcase.domain;

import java.time.LocalDate;
import java.time.Period;

public class Car extends Vehicle {

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Car() {

    }

    public Car(String kenteken) {
        this.licencePlate = kenteken;
        super.petrolTank = new PetrolTank();
        super.petrolTank.setMaxLevel(20);
        this.registrationDate = LocalDate.now();
    }

    public Car(String kenteken, LocalDate registrationDate) {
        this.licencePlate = kenteken;
        this.registrationDate = registrationDate;
    }

    public void licencePlateCheck(String licencePlate) {
        if (licencePlate.equals(this.licencePlate)) {
            System.out.println("Juist kenteken");
        } else {
            System.out.println("Verkeerd kenteken");
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return licencePlate + " " + speed + " " + price + " " + mileAge + " " + petrolTank.getCurrentLevel();
    }

    public Period carAge() {
        Period ageOfCar = Period.between(LocalDate.now(), registrationDate);
        return ageOfCar;

    }

    public void fill() {
        while (petrolTank.getCurrentLevel() < petrolTank.getMaxLevel()) {
            petrolTank.increase();
        }
    }

    public void drive() {
        mileAge++;
        petrolTank.dec();
        System.out.println("Car is driving");
    }
}
