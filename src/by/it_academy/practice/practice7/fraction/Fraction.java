package by.it_academy.practice.practice7.fraction;

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void printFraction() {
        System.out.println(numerator + "/" + denominator);
    }

    public Fraction addFractions(Fraction fractionToAdd) {
        int resultNumerator;
        int resultDenominator;
        resultDenominator = this.denominator * fractionToAdd.denominator;
        resultNumerator = (this.numerator * fractionToAdd.denominator) + (fractionToAdd.numerator * this.denominator);
        Fraction resultFraction = new Fraction(resultNumerator, resultDenominator);
        return resultFraction;
    }

    public Fraction multiplyFraction(double number) {
        double resultNumerator;
        double add = getAdditionalValue(number);
        resultNumerator = number * this.numerator * add;
        Fraction resultFraction = new Fraction((int) resultNumerator, (int) (this.denominator * add));
        return resultFraction;
    }

    private static double getAdditionalValue(double number) {
        String resultNumeratorStr = String.valueOf(number);
        int digitsCount = resultNumeratorStr.length() - 1 - resultNumeratorStr.indexOf('.');
        return Math.pow(10, digitsCount);
    }
}
