package by.it_academy.practice.practice13;

public class ExapmleExceptions {

    public static void main(String[] args) {
        try {
            System.out.println("main() invoked!");
            method1();
        } catch (Exception e) {
            System.out.println("Catch block of main() invoked!");
            throw e;
        }
    }

    private static void method1() {
        try {
            System.out.println("Method 1 invoked!");
            method2();
        } catch (Exception e) {
            System.out.println("Catch block of method1() invoked!");
            throw e;
        }
    }

    private static void method2() {
        try {
            System.out.println("Method 2 invoked!");
            method3();
        } catch (Exception e) {
            System.out.println("Catch block of method2() invoked!");
            throw e;
        }
    }

    private static void method3() {
        System.out.println("Method 3 invoked!");
        throw new RuntimeException();
    }

}
