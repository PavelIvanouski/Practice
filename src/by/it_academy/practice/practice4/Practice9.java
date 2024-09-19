package by.it_academy.practice.practice4;

import java.util.Scanner;

public class Practice9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter first number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter first number: ");
        int num3 = sc.nextInt();

        int num2Num1Diff = num2 - num1;
        int num3Num2Diff = num3 - num2;

        if (num2Num1Diff == num3Num2Diff) {
            System.out.println("The numbers are in progression");
            System.out.print(num1 + " " + num2 + " " + num3 + " ");
            for (int i = 1; i <= 10; i++) {
                System.out.print((num3 + num2Num1Diff) + " ");
                num3 += num2Num1Diff;
            }
        } else {
            System.out.println("The numbers are not in progression");
        }
    }
}
