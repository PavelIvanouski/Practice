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
        resultNumerator = number * this.numerator;
        Fraction resultFraction = new Fraction((int) resultNumerator, this.denominator);
        return resultFraction;
    }
}
