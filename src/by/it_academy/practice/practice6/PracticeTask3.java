package by.it_academy.practice.practice6;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeTask3 {
    public static void main(String[] args) {
//        Продолжи последовательность:
//        Определить закономерность, согласно которой формируется та или иная числовая последовательность.
//                Написать функцию, которая формирует первые N элементов данной последовательности в виде целочисленного массива и выводит элементы массива на экран.


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];


        //2,  4,  6,   8,  10...
//        int counter = 2;
//        for (int i = 0; i < arrayLength; i++) {
//            array[i] = counter;
//            counter += 2;
//        }


        //1, -1,  1,  -1,   1,  -1...
        int counter = 1;
        for (int i = 0; i < arrayLength; i++) {
            array[i] = counter;
            counter *= -1;
        }

        System.out.println(Arrays.toString(array));

    }
}
