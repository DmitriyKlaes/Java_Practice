package ru.Geekbrains.sem_22_09_22_ClassCar;

public class Transmission implements Checkable {

    private int gearNumber;

    public void switchGear (int numberGear) {
        this.gearNumber = numberGear;
        System.out.printf("Переключение скорости на %d%n", numberGear);
    }

    public int getGearNumber () {
        return gearNumber;
    }

    @Override
    public void check () {
        System.out.println("ok");
    }
}