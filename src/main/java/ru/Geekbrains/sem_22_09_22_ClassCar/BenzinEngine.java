package ru.Geekbrains.sem_22_09_22_ClassCar;

public class BenzinEngine extends Engine {

    @Override
    protected void startInternal() {
        System.out.println("Бензиновый двигатель запущен");
    }

    @Override
    protected void stopInternal() {
        System.out.println("Бензиновый двигатель остановлен");
    }

    @Override
    protected void throttleUpInternal(int level) {
        System.out.printf("Бензиновый дроссель открыт %d%n", level);
    }
    @Override
    public void check () {
        System.out.println("ok");
    }
}
