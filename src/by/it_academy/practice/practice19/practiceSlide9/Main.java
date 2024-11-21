package by.it_academy.practice.practice19.practiceSlide9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> initialList = List.of(14, 12, 123);
        System.out.println(initialList);

        Integer minNumber = initialList.stream()
                .min(Integer::compare)
                .orElse(null);
        System.out.printf("Min number: %d%n", minNumber);

        Integer maxNumber = initialList.stream()
                .max(Integer::compare)
                .orElse(null);
        System.out.printf("Max number: %d%n", maxNumber);

        Double averageNumber = initialList.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.printf("Average number: %.2f%n", averageNumber);

        Integer product = initialList.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.printf("Product: %d%n", product);

        Integer sum = initialList.stream()
                .reduce(0, Integer::sum);
        System.out.printf("Sum: %d%n", sum);

        Integer intSum = initialList.stream()
                .flatMap(Main::getDigitsStream)
                .reduce(0, Integer::sum);
        System.out.printf("IntSum: %d%n", intSum);

        Integer digitsSum = initialList.stream()
                .map(number -> digitsSum(number))
                .reduce(0, Integer::sum);
        System.out.println(digitsSum);

//        Integer digitsSum1 = initialList.stream()
//                .flatMap(number -> Arrays.stream(digitsArray(number)))
//                .reduce(0, Integer::sum);
//        System.out.println(digitsSum1);

    }

    private static Integer[] digitsArray(int number) {
        int arraySize = 0;
        while (number > 0) {
            number /= 10;
            arraySize++;
        }
        Integer[] digitsArray = new Integer[arraySize];
        int arrayIndex = 0;
        while (number > 0) {
            number /= 10;
            digitsArray[arrayIndex] = number;
            arrayIndex++;
        }
        return digitsArray;
    }

    private static int digitsSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }


    private static Stream<Integer> getDigitsStream(Integer input) {
        return Arrays.stream(new Integer[]{
                input / 10,
                input % 10
        });
    }
}
