package by.it_academy.practice.practice4;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        // Найти самую большую цифру числа, введенного с клавиатуры, а также ее индекс
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        int maxDigit = 0;
        int currentIndex = 0;
        int maxDigitIndex = 0;
        //index 0123456
        //      2222263
        while (number > 0) {
            int digit = number % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
                maxDigitIndex = currentIndex;
            }
            number /= 10;
            currentIndex++;
        }
        System.out.println("The maximum digit is " + maxDigit);
        System.out.println("The maximum digit index is " + (currentIndex - maxDigitIndex - 1));
    }
}
