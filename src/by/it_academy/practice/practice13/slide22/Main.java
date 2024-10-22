package by.it_academy.practice.practice13.slide22;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 10;

    public static void main(String[] args) {
        int subjectsCount = scanNumber("Введите количество предметов:", MIN_VALUE, 20);
        int gradeSum = getGradesSum(subjectsCount);
        double averageGrade = calculateAverageGrade(subjectsCount, gradeSum);
        printResult(averageGrade);

        Random rand = new Random();
        int randomNum = rand.nextInt(100)+ 1;
    }

    public static int getGradesSum(int subjectsCount) {
        int gradeSum = 0;
        for (int i = 1; i <= subjectsCount; i++) {
            int grade = scanNumber("Введите оценку для предмета " + i + ":", MIN_VALUE, MAX_VALUE);
            gradeSum += grade;
        }
        return gradeSum;
    }

    public static double calculateAverageGrade(int subjectsCount, int gradeSum) {
        return (double) gradeSum / subjectsCount;
    }

    public static void printResult(double averageGrade) {
        System.out.println("Среднее арифметическое значение оценок: " + averageGrade);
    }

    public static int scanNumber(String title, int minVal, int maxVal) {
        System.out.format("%s (%d-%d)%n", title, minVal, maxVal);
        Scanner scanner = new Scanner(System.in);
        int resultInt = scanner.nextInt();
        if (resultInt < minVal || resultInt > maxVal) {
            throw new InvalidInputException(String.format("Введено некорректное значение! (%d-%d)", minVal, maxVal));
        }
        return resultInt;
    }
}