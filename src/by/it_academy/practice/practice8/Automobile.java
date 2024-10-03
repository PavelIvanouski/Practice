package by.it_academy.practice.practice8;

import java.util.Objects;

public class Automobile {
    private String colour;
    private String name;
    private final int DRIVER_COUNT = 1;

    public void printInfo() {
        System.out.println("This is automobile!");
    }

    public void overloadTest() {
        System.out.println("Parent");
    }

    public Automobile(String colour, String name) {
        this.colour = colour;
        this.name = name;
        System.out.println("Automobile constructor!");
        System.out.println(DRIVER_COUNT);
    }

    public Automobile() {
    }

    public void printBusFullInfo() {
        System.out.println("colour " + colour + " name " + name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Automobile that)) return false;
        return Objects.equals(colour, that.colour) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour, name, DRIVER_COUNT);
    }

    @Override
    protected Automobile clone() {
        Automobile a = new Automobile();
        a.setColour(this.colour);
        a.setName(this.name);
        return a;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "colour='" + colour + '\'' +
                ", name='" + name + '\'' +
                ", DRIVER_COUNT=" + DRIVER_COUNT +
                '}';
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

}
