package by.it_academy.practice.practice18.lambda;

public class Main {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;

        System.out.println("Результат сложения " + operate(10, 5, addition));
        System.out.println("Результат вычитания " + operate(10, 5, subtraction));
        System.out.println("Результат умножения " + operate(10, 5, multiplication));
    }

    // Метод, который принимает функциональный интерфейс в качестве аргумента
    private static int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operate(a, b);
    }

}