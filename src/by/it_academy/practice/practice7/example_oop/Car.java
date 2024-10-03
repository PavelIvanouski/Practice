package by.it_academy.practice.practice7.example_oop;

public class Car {

    private String colour;
    private String name;
    private String number;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Car(String colour, String name, String number) {
        this.colour = colour;
        this.name = name;
        this.number = number;
    }

    public void startEngine() {
        System.out.println("Engine started!");
    }

    public void stopEngine() {
        System.out.println("Engine stopped!");
    }

    public void drive() {
        System.out.println("Drive started!");
    }

    public static void testStatic() {
        System.out.println("Static test");
    }
}
