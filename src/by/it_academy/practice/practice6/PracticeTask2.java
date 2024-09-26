package by.it_academy.practice.practice6;

import java.util.Arrays;

public class PracticeTask2 {
    public static void main(String[] args) {
        // Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке. Не используйте дополнительный массив для хранения результатов.
        String[] a = {"Каждый “,” охотник “,” желает “,” знать “,” где “,” сидит “,” фазан "};

        // Напишите программу, которая меняет местами элементы одномерного массива из String
        // в обратном порядке. Не используйте дополнительный массив для хранения результатов.
        String[] array = {"Каждый ", "охотник", "желает", "знать", "где", "сидит", "фазан"};
        String word;
        int len = array.length - 1;

        for (int i = 0; i < len / 2; i++) {
            System.out.println(i);
            System.out.println(array[i]);
            System.out.println(array[len - i]);

            word = array[i];
            array[i] = array[len - i];
            array[len - i] = word;
        }

//        for (int firstIndex = 0, lastIndex = len ; firstIndex <= lastIndex; firstIndex++, lastIndex--) {
//            word = array[firstIndex];
//            array[firstIndex] = array[ lastIndex];
//            array[ lastIndex] = word;
//        }

        System.out.println(Arrays.toString(array));
    }
}
