package ua.kpi.fel;

public class Main {
    public static void main(String[] args) {
        Notebook model = new Notebook();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.runProcess();
    }

}
