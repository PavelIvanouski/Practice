package by.it_academy.practice.practice7.fraction;

public class Main {
    public static void main(String[] args) {
//        Fraction fraction1 = new Fraction(4, 6);
//        Fraction fraction2 = new Fraction(3, 12);
//        fraction1.printFraction();
//        fraction2.printFraction();
//        Fraction result = fraction1.addFractions(fraction2);
//        result.printFraction();

        double resultNumerator = 123.233;
        String resultNumeratorStr = String.valueOf(resultNumerator);
        System.out.println(resultNumeratorStr);
        System.out.println(resultNumeratorStr.indexOf('.'));
        int indexOfDot = resultNumeratorStr.indexOf('.');
        System.out.println(resultNumeratorStr.length()- 1 - indexOfDot);
        int digitsCount = resultNumeratorStr.length() - 1 - indexOfDot;
        System.out.println(Math.pow(10, digitsCount));



    }
}
