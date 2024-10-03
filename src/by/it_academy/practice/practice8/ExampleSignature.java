package by.it_academy.practice.practice8;

public class ExampleSignature {
    public static void main(String[] args) {
        OverloadExample.test(10.0);
        OverloadExample.test(5);

    }

    private int sum(int a, int b, int c) {
        return a + b + c;
    }

    protected int sum(int x, int y , double z) {
        return x + y;
    }
}
