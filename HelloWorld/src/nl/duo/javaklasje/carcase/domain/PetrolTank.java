package nl.duo.javaklasje.carcase.domain;

class PetrolTank {
    private int maxLevel;
    private int minLevel;
    private int currentLevel;

    PetrolTank() {
        maxLevel = 10;
        minLevel = 0;
        currentLevel = 5;
    }

    PetrolTank(int maxLevel) {
        this.maxLevel = maxLevel;
        minLevel = 0;
        currentLevel = 5;
    }

    void dec() {
        if (currentLevel > minLevel) {
            currentLevel--;
        }
    }

    int getMaxLevel() {
        return maxLevel;
    }

    int getCurrentLevel() {
        return currentLevel;
    }

    void setMaxLevel(int maxLevel) {
        this.maxLevel = maxLevel;
    }

    void increase() {
        currentLevel++;
    }

    void increase(int liters) {
        currentLevel += liters;
    }

}
