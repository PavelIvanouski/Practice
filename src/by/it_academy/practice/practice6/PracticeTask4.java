package by.it_academy.practice.practice6;

import java.util.Arrays;

public class PracticeTask4 {
    public static void main(String[] args) {
        //Выполнить слияние двух упорядоченных массивов
        int[] array1 = {1, 4, 5, 7, 10, 11};
        int[] array2 = {2, 3, 6, 8, 9};

        int[] mergedArray = new int[array1.length + array2.length];
        int arr1Index = 0;
        int arr2Index = 0;
        for (int i = 0; i < mergedArray.length; i++) {
            if (arr1Index < array1.length && arr2Index < array2.length) {
                if (array1[arr1Index] < array2[arr2Index]) {
                    System.out.println("array1 number less than array2 number " + arr1Index + " " + arr2Index);
                    mergedArray[i] = array1[arr1Index];
                    arr1Index++;
                } else {
                    System.out.println("array1 number greater than array2 number " + arr1Index + " " + arr2Index);
                    mergedArray[i] = array2[arr2Index];
                    arr2Index++;
                }
            } else if (arr2Index < array2.length) {
                mergedArray[i] = array2[arr2Index];
                arr2Index++;
            } else {
                mergedArray[i] = array1[arr1Index];
                arr1Index++;
            }
        }
        System.out.println(Arrays.toString(mergedArray));

        //для прошлой задачи у меня получилось поменьше условий
//        int[] array1 = {1, 4, 5, 7, 9};
//        int[] array2 = {2, 3, 6, 8, 10,12};
//
//        int[] mergedArray = new int[array1.length + array2.length];
//
//        int i = 0;
//        int j = 0;
//
//        for (int currentIndex = 0; currentIndex < mergedArray.length; currentIndex++) {
//            if (i > array1.length - 1) {
//                mergedArray[currentIndex] = array2[j];
//                j++;
//                continue;
//            }
//            if (j > array2.length - 1) {
//                mergedArray[currentIndex] = array1[i];
//                i++;
//                continue;
//            }
//            if (array1[i] < array2[j]) {
//                mergedArray[currentIndex] = array1[i];
//                i++;
//            } else {
//                mergedArray[currentIndex] = array2[j];
//                j++;
//            }
//        }
//
//        System.out.println(Arrays.toString(mergedArray));


    }
}
