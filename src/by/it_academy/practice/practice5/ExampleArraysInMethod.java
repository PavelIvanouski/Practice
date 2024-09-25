package by.it_academy.practice.practice5;

import java.util.Arrays;
import java.util.Random;

public class ExampleArraysInMethod {
//    public static void main(String[] args) {
//        int[] intArray = new int[10];
//        for (int i = 0; i < intArray.length; i++) {
//            intArray[i] = i;
//        }
//        System.out.println("Sum of array elements :" + findSumOfElements(intArray));
//    }
//    private static int findSumOfElements(int[] array) {
//        int sum = 0;
//        for (int element : array) {
//            sum += element;
//        }
//        return sum;
//    }
    public static void main(String[] args) {
        int[] array = generateIntAray(10);
        System.out.println(Arrays.toString(array));
    }
    private static int[] generateIntAray(int arrayLength) {
        int[] intArray = new int[arrayLength];
        Random r = new Random();
        for (int i = 0; i < arrayLength; i++) {
            intArray[i] = r.nextInt(10);
        }
        return intArray;
    }


}
