package ru.Geekbrains.sem_22_10_06_MVP_MVC_Server.mvc;

public class Controller {

    public Model model = new Model();

    public void execute() {
        model.setSomeValue(100);
        model.showValue();
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.execute();
    }
}
