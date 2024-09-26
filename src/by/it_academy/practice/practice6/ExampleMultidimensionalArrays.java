package by.it_academy.practice.practice6;

import java.util.Arrays;

public class ExampleMultidimensionalArrays {
    public static void main(String[] args) {
//        int[][] twoDimArray; //двумерный массив
//        String[][][] threeDimArray; //трёхмерный массив
//        double[][][][][] fiveDimArray; // пятимерный массив
//
//        // объявление массива 3х4
//        int[][] twoDimentionArray = new int[3][4];
//
//        // доступ к элементу строки #1 столбца #2
//        twoDimentionArray[1][2] = 17;
//
//
//        int[][] twoDimArray1 = {
//                {5, 7, 3, 17},
//                {7, 0, 1, 12},
//                {8, 1, 2, 3}
//        };
//
////        int[][] twoDimArray1 = {{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}};
//
//        int[][] jaggedArray = new int[3][];
//
//// Назначение массивов разного размера зубчатому массиву
//        jaggedArray[0] = new int[] { 1, 2, 3, 4 };
//        jaggedArray[1] = new int[] { 5, 6, 7 };
//        jaggedArray[2] = new int[] { 8, 9 };


        int[][] twoDimArray = {{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}};//объявили массив и заполнили его элементами
        for (int i = 0; i < twoDimArray.length; i++) {  //идём по строкам
            for (int j = 0; j < twoDimArray[i].length; j++) {//идём по столбцам
                System.out.print(" " + twoDimArray[i][j] + "\t"); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }

//        System.out.println();
//        int[][] myArray = {{18, 28, 18}, {28, 45, 90}, {45, 3, 14}};
//        System.out.println(Arrays.deepToString(myArray));

    }
}
