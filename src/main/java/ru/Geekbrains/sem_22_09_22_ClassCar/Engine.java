package ru.Geekbrains.sem_22_09_22_ClassCar;

public abstract class Engine implements Checkable{

    private Boolean work;

    public void start () {
        this.work = true;
        System.out.println("Двигатель запущен");
        startInternal();
    }

    protected abstract void startInternal ();

    public void stop () {
        this.work = false;
        System.out.println("Двигатель остановлен");
        stopInternal();
    }

    protected abstract void stopInternal ();

    public void throttleUp (int level) {
        if (this.work) {
            System.out.printf("Дроссель открыт %d%n", level);
            throttleUpInternal(level);
        }
    }

    protected abstract void throttleUpInternal (int level);

    public Boolean getWork() {
        return work;
    }
}
