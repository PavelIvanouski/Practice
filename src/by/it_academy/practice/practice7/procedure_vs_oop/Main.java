package by.it_academy.practice.practice7.procedure_vs_oop;

public class Main {
    public static void main(String[] args) {

        double num1 = 5;
        double num2 = 6;

//         Performing operations
        double result = add(num1, num2);
        double difference = subtract(result, 4);

//         Getting the result
        System.out.println(difference);


        Calculator calculator = new Calculator(0);
        System.out.println("Result " + calculator.getResult());
        calculator.add(5);
        calculator.add(6);
        calculator.subtract(4);
        System.out.println("Result " + calculator.getResult());

        Calculator calculator2 = new Calculator(0);
        System.out.println("Result " + calculator2.getResult());


        Calculator calculator3 = new Calculator("Calc3");
        Calculator calculator4 = new Calculator(0, "Calc4");
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

}
