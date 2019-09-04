package nl.duo.javaklasje.carcase.domain;

public class RaceCar extends Car {

    @Override
    public void drive(){
        super.drive();
        System.out.println("Racecar is driving...");
    }
}
