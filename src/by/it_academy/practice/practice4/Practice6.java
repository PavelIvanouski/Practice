package by.it_academy.practice.practice4;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        // найти сумму и произведение цифр числа
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        int sumDigits = 0;
        int prodDigits = 1;
        //3132443
        while (number > 0) {
            int digit = number % 10;
            sumDigits += digit; // sumDigits = sumDigits + digit;
            prodDigits *= digit; // prodDigits = prodDigits * digit;
            number /= 10;
        }
        System.out.println("Sum of digits: " + sumDigits);
        System.out.println("Prod digits: " + prodDigits);
    }
}
