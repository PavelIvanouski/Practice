package by.it_academy.practice.practice17;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PracticeSlide25 {
    //Записать в файл 30 случайных чисел от 1 до 100.
    // Прочитать записанный файл распечатать числа и их среднее арифметическое.

    static final String FILE_PATH = "resources/practice17_numbers.txt";
    static Random rand = new Random();

    public static void main(String[] args) {
        writeRandomNumbersFile(100, FILE_PATH);
        List<Integer> numbers = readRandomNumbersFile(FILE_PATH);
        double average = getAverage(numbers);
        System.out.printf("Average value is: %.2f", average);
    }

    private static Integer generateInt(int from, int to) {
        return rand.nextInt(from, to);
    }

    private static void writeRandomNumbersFile(int count, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (int i = 0; i < count; i++) {
                writer.write(generateInt(1, 100).toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.printf("Error occurred (write): %s%n", e.getMessage());
        }
    }

    private static List<Integer> readRandomNumbersFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            Integer number;
            while ((line = reader.readLine()) != null) {
                number = Integer.parseInt(line);
                numbers.add(number);
            }
        } catch (IOException e) {
            System.out.printf("Error occurred (read): %s%n", e.getMessage());
        }
        return numbers;
    }

    private static double getAverage(List<Integer> numbers) {
        if (numbers.isEmpty()) return 0;
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.size();
    }
}

