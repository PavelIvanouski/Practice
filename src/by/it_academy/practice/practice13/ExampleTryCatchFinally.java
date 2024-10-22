package by.it_academy.practice.practice13;

import java.util.Scanner;

public class ExampleTryCatchFinally {
    public static void main(String[] args) {
//        int a = 5;
//        int b = 0;
//        try {
//            System.out.println("Block try");
//            System.out.println(a / b);
//        } catch (ArithmeticException e) {
//            System.out.println("Block catch");
//            System.out.println(e.getClass() + " is thrown!");
//        } finally {
//            System.out.println("Block finally");
//            System.out.println("Block finally");
//            System.out.println("Block finally");
//
//        }

        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int result;
        System.out.println("Enter a.b:");
        try {
            a = sc.nextInt();
            b = sc.nextInt();
            result = a / b;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("The exception " + e.getClass() + " is thrown!");
        } finally {
            System.out.println("Finally block");
        }


        System.out.println("Программа продолжает свое выполнение.");
    }
}
