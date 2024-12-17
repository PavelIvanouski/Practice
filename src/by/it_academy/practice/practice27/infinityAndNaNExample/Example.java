package by.it_academy.practice.practice27.infinityAndNaNExample;

public class Example {
    public static void main(String[] args) {
        double positiveInfinity = Double.POSITIVE_INFINITY;
        System.out.println(positiveInfinity);
        System.out.println(positiveInfinity + 1);
        System.out.println(positiveInfinity + 10);
        System.out.println(positiveInfinity * -1);
        double negativeInfinity = Double.NEGATIVE_INFINITY;

        double result = 0.0 / 0.0; // Результат – NaN
        System.out.println(result);
        System.out.println(Double.isNaN(result));
    }
}
