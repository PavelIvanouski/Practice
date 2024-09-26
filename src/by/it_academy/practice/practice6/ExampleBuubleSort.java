package by.it_academy.practice.practice6;

import java.util.Arrays;

public class ExampleBuubleSort {
    public static void main(String[] args) {
        int[] array = {4, 3, 1, 5, 2};
        System.out.println(Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
