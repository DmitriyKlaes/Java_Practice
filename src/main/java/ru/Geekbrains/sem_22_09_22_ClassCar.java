package ru.Geekbrains;

public class sem_22_09_22_ClassCar {
    private Engine engine;
    private Wheel wheel1;
    private Wheel wheel2;
    private Wheel wheel3;
    private Wheel wheel4;
    private Transmission transmission;

    public sem_22_09_22_ClassCar() {
        engine = new Engine();
        wheel1 = new Wheel();
        wheel2 = new Wheel();
        wheel3 = new Wheel();
        wheel4 = new Wheel();
        transmission = new Transmission();
    }

    public void start () {
        engine.start();
    }

    public void drive () {
        if (engine.getWork()) {
            transmission.switchGear(1);
            wheel1.rotate();
            wheel2.rotate();
            wheel3.rotate();
            wheel4.rotate();
        }
    }

    public void stop () {
        engine.stop();
    }

    public static void main(String[] args) {
        sem_22_09_22_ClassCar base = new sem_22_09_22_ClassCar();
        base.start();
        base.drive();
        base.stop();
    }
}
