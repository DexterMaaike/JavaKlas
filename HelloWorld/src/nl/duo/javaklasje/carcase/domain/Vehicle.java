package nl.duo.javaklasje.carcase.domain;

import nl.duo.javaklasje.carcase.Exceptions.TankOverfillException;

import java.time.LocalDate;

public abstract class Vehicle {
    int speed;
    String licencePlate;
    double price;
    LocalDate registrationDate;
    int mileAge;
    PetrolTank petrolTank;


    public void drive() {
        mileAge++;
        petrolTank.dec();
    }

    public void fill(int liters) throws TankOverfillException {
        if ((petrolTank.getCurrentLevel() + liters) <= petrolTank.getMaxLevel()) {
            petrolTank.increase(liters);
        } else {
            throw new TankOverfillException("Tank is te vol");
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public int getMileAge() {
        return mileAge;
    }

    public void setMileAge(int mileAge) {
        this.mileAge = mileAge;
    }

    public PetrolTank getPetrolTank() {
        return petrolTank;
    }

    public void setPetrolTank(PetrolTank petrolTank) {
        this.petrolTank = petrolTank;
    }
}
