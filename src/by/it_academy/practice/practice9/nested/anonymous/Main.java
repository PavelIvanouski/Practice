package by.it_academy.practice.practice9.nested.anonymous;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Animal() {
            @Override
            public void makeSound() {

            }

            @Override
            public void printInfo() {
                System.out.println("I am a dog");
            }
        };

        dog.printInfo();
        dog.makeSound();



    }

}
