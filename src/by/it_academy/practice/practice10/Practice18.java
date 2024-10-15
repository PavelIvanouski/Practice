package by.it_academy.practice.practice10;

import java.util.Scanner;

public class Practice18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");
        String string = scanner.nextLine();
        System.out.println("First char in string: " + string.charAt(0)
                + ", last character in string: "
                + string.charAt(string.length() - 1));
    }
}
