package ru.Geekbrains.sem_22_10_06_MVP_MVC_Server.mvc;

public class Model {

    private View view = new View();

    private int someValue;

    public int getSomeValue() {
        return someValue;
    }

    public void setSomeValue(int someValue) {
        this.someValue = someValue;
    }

    public void showValue() {
        view.showValue(Integer.toString(someValue));
    }
}
