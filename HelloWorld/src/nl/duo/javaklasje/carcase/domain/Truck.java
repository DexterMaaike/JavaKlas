package nl.duo.javaklasje.carcase.domain;

public class Truck extends Car {
    private int maxLoad;
    private int numberOfWheels;
    private boolean dangerousLoad;
    private int weight;


    public void overloadCheck(int currentLoad) {
        if (currentLoad > maxLoad) {
            System.out.println("WARNING: Load is too heavy");
        } else {
            System.out.println("Niks aan het handje");
        }
    }

    @Override
    public void setSpeed(int maxSpeed) {
        if (dangerousLoad) {
            super.speed = maxSpeed - 20;
        }
    }

    public int getWeight() {
        return weight;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public boolean isDangerousLoad() {
        return dangerousLoad;
    }

    public void setDangerousLoad(boolean dangerousLoad) {
        this.dangerousLoad = dangerousLoad;
    }
}
