package ru.Geekbrains.sem_22_09_22_ClassCar;

public class Wheel implements Checkable {
    public void rotate () {
        System.out.println("Колесо крутится");
    }

    @Override
    public void check () {
        System.out.println("ok");
    }
}