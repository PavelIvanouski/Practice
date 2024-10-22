package by.it_academy.practice.practice13.custom;

public class Main {
    public static void main(String[] args) {
        MyCustomException myCustomException = new MyCustomException("Custom exception!");
        throw myCustomException;
    }

}
