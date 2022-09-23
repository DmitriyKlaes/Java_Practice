package ru.Geekbrains;

public class Transmission {

    private int gearNumber;

    public void switchGear (int numberGear) {
        this.gearNumber = numberGear;
        System.out.printf("Переключение скорости на %d%n", numberGear);
    }

    public int getGearNumber () {
        return gearNumber;
    }
}
