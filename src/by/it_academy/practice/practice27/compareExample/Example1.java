package by.it_academy.practice.practice27.compareExample;

public class Example1 {
    public static void main(String[] args) {

        int a = 1;
        int b = 3;
        int c = 4;
        boolean d = checkValues1(a, b) && checkValues2(a,c);
        System.out.println(d);
    }

    private static boolean checkValues1(int a, int b) {
        return a > b;
    }

    private static boolean checkValues2(int a, int b) {
        return a > b;
    }

}
