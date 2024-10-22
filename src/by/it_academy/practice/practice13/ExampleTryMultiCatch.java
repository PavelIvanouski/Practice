package by.it_academy.practice.practice13;

public class ExampleTryMultiCatch {
    public static void main(String[] args) {
//        int a = 5;
//        int b = 0;
//        try {
//            System.out.println("Block try");
//            System.out.println("a =" + a);
//            System.out.println("b =" + b);
//            System.out.println(a / b);
//        } catch (ArithmeticException e) {
//            System.out.println(e.getClass() + " is thrown!");
//            System.out.println("Block catch1");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getClass() + " is thrown!");
//            System.out.println("Block catch2");
//        }
//
//        System.out.println("Программа продолжает свое выполнение.");

        int a = 5;
        int b = 0;
        try {
            System.out.println("Block try");
            System.out.println("a =" + a);
            System.out.println("b =" + b);
            System.out.println(a / b);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException exception) {
            System.out.println("Block catch1");
        }

        System.out.println("Программа продолжает свое выполнение.");
    }
}
