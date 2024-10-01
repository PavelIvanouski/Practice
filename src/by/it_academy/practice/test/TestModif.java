package by.it_academy.practice.test;

import by.it_academy.practice.practice6.Calculator;

public class TestModif {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
//        calculator.protectedMethod();
        CalculatorChild calculatorChild = new CalculatorChild();
        calculatorChild.testParentProtectedMethod();
    }
}
