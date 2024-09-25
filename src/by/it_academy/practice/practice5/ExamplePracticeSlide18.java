package by.it_academy.practice.practice5;

import java.util.Arrays;

public class ExamplePracticeSlide18 {
    public static void main(String[] args) {
        // Разложить положительные и отрицательные числа по разным массивам
        int[] originalArray = {5, -12, 9, -25, 8, 15, -7, 14, 20, -18};
        int positiveArrayLength = 0;
        int negativeArrayLength = 0;
        for (int element : originalArray) {
            if (element < 0) {
                negativeArrayLength++;
            } else if (element > 0) {
                positiveArrayLength++;
            }
        }
        int[] positiveArray = new int[positiveArrayLength];
        int[] negativeArray = new int[negativeArrayLength];
        int positiveArrayIndex = 0;
        int negativeArrayIndex = 0;
        for (int element : originalArray) {
            if (element < 0) {
                negativeArray[negativeArrayIndex] = element;
                negativeArrayIndex++;
            } else if (element > 0) {
                positiveArray[positiveArrayIndex] = element;
                positiveArrayIndex++;
            }
        }

        System.out.println(Arrays.toString(positiveArray));
        System.out.println(Arrays.toString(negativeArray));

    }
}
