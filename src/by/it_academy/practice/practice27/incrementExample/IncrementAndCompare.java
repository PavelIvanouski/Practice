package by.it_academy.practice.practice27.incrementExample;

public class IncrementAndCompare {
    static int a, b;

    public static void main(String[] args) {
        if (!(++a == 0 && ++b == 0)) {
            System.out.println("true a + b=");
        } else {
            System.out.println("false a + b=");
        }
        System.out.println(a + b);
    }

}
