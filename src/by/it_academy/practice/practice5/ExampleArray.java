package by.it_academy.practice.practice5;

import java.util.Arrays;

public class ExampleArray {
    public static void main(String[] args) {
        int[] array1; // объявление массива
        int arr[];  // не является предпочтительным способом. (из c++)

        array1 = new int[10]; // создание , т.е. выделение памяти для
        // массива на 10 элементов типа int
        array1[0] = 1;
        array1[0] = 10; // значения можно перезаписывать


        int[] array2 = new int[10]; // объявление и выделение памяти
        array2[1] = 1;
        //System.out.println(array2);


        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // объявление и инициализация массива
        // со значениями

        //вывод значений ячеек массива
        //System.out.println(Arrays.toString(array3));

        // массив со ссылочными типами
        String[] carModelsArray = new String[]{"Audi", "BMW", "Honda", "Ford", "Mustang"};
        String[] carModelsArray1 = {"Audi", "BMW", "Honda", "Ford", "Mustang"};

        Cat[] catArray = {new Cat(), new Cat(), new Cat()};
    }
}
