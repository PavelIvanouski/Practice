package by.it_academy.practice.practice6;

public class OverloadExample {
    
    public void test(int a) {
        System.out.println("a = " + a);
    }

    public void test(double a) {
        System.out.println("a = " + a);
    }

    public void test(long a) {
        System.out.println("a = " + a);
    }
}