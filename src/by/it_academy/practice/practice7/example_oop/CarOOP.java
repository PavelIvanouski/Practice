package by.it_academy.practice.practice7.example_oop;

import by.it_academy.practice.practice7.procedure_vs_oop.Calculator;

public class CarOOP {
    public static void main(String[] args) {
        Car car = new Car("orange", "BMW", "1234 ii-4");


        car.startEngine();
        car.drive();
        car.stopEngine();

        Car.testStatic();

    }
}
