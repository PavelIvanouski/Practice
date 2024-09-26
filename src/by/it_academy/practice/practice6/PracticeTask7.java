package by.it_academy.practice.practice6;

import java.util.Arrays;

public class PracticeTask7 {
    public static void main(String[] args) {
        int[][] arr = {
                {0, 1},
                {2, 3},
                {4, 5},
                {6, 7},
                {8, 9}
        };

        int rows = arr.length;
        int collumns = arr[0].length;

        printArray("Исходный массив:", arr);

        System.out.println(Arrays.deepToString(arr));

        int[][] resultArr = new int[collumns][rows];

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = 0; j < collumns; j++) {
                resultArr[j][i] = arr[i][j];
//                resultArr[collumns-j-1][i] = arr[i][j];
            }
        }

        printArray("Результат:", resultArr);
    }

    public static void printArray(String message, int[][] arr) {
        System.out.println(message);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

