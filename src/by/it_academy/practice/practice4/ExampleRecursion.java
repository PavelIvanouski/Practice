package by.it_academy.practice.practice4;

public class ExampleRecursion {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Factorial for " + n + " is " + factorial(n));
    }
    public static int factorial(int n) {
        if (n >= 1) {
            return n * factorial(n - 1);
        } else return 1;
    }
//  4 * factorial(3)
//  4 * 3 * factorial(2)
//  4 * 3 * 2 * factorial(1)
//  4 * 3 * 2 * 1 * factorial(0)
//  4 * 3 * 2 * 1 * 1

//    public static int factorial(int n) {
//            return n * factorial(n - 1);
//    }

}
