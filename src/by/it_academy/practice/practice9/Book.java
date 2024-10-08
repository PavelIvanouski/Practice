package by.it_academy.practice.practice9;

public class Book implements Printable, Searchable{

    @Override
    public void print() {
        method();
        printDefault("message");
    }

    @Override
    public void printDefault(String message) {
        Searchable.super.printDefault(message);
    }

    @Override
    public void method() {
        print();
    }
}
