package by.it_academy.practice.practice7.getters_setters;

public class Car {

    private String colour;
    private String name;
    private String number;

    public Car(String colour, String name, String number) {
        this.colour = colour;
        this.name = name;
        this.number = number;
    }

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
}








