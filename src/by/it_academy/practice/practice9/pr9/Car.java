package by.it_academy.practice.practice9.pr9;

public class Car {

    private String model;
    private int year;
    private Engine engine;

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        this.engine = new Engine();
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

}
