package by.it_academy.practice.practice13;

import java.util.Scanner;

public class ExampleThrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Enter the correct number!");
            RuntimeException exception = new RuntimeException("Enter the correct number!");
            throw exception;
        }

    }
}
