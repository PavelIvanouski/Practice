package by.it_academy.practice.practice8;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("AvAv");
    }

    @Override
    public void printInfo() {
        System.out.println("I am a Dog");
    }
}
