package by.it_academy.practice.practice9;

public class Bus extends Automobile {

    @Override
    public void printInfo() {
        System.out.println("This is the bus");
    }

    public void printInfo(String str) {
        System.out.println("This is the bus " + str);
    }
}
