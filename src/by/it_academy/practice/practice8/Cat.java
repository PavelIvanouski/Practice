package by.it_academy.practice.practice8;

public class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void printInfo() {
        System.out.println("I am a Cat");
    }
}
