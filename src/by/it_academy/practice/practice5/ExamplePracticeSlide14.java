package by.it_academy.practice.practice5;

import java.util.Arrays;
import java.util.Random;

public class ExamplePracticeSlide14 {
    public static void main(String[] args) {
        //Найти минимальное значение из массива
        int[] array = {10, 4, 6, 9, 2, 3, 8, 11, 5};
        int minValue = array[0];
        for (int j : array) {
            if (j < minValue) {
                minValue = j;
            }
        }
        System.out.println("Minimal value is: " + minValue);

        //Найти минимальное значение из массива
//        int[] array = new int[10];
//        Random random = new Random();
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(100);
//        }
//        System.out.println(Arrays.toString(array));
//        int minValue = array[0];
//        for (int j : array) {
//            if (j < minValue) {
//                minValue = j;
//            }
//        }
//        System.out.println("Minimal value is: " + minValue);
    }
}
