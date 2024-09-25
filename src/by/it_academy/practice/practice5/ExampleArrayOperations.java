package by.it_academy.practice.practice5;

import java.util.Arrays;

public class ExampleArrayOperations {
    public static void main(String[] args) {
        int[] array = new int[10]; // объявление и инициализация массива
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        // вывод длины массива
//        System.out.println("Array length : " + array.length);

        // вывод тестового представления массива
        // буква I - означает, что это массив типа int, а символы после @ – адрес массива в памяти
//        System.out.println("Array toString : " + array.toString());
////         чтобы вывести содежимое нужно использовать Arrays.toString
//        System.out.println("Array : " + Arrays.toString(array));

//        // создание копии массива
        int[] arrayCloned = array.clone();
//        System.out.println("Cloned array : " + Arrays.toString(arrayCloned));
//        System.out.println("Array address in memory " + array.toString());
//        System.out.println("Cloned array address in memory " + arrayCloned.toString());
//
        // сравнение ссылок
        System.out.println("array == arrayCloned : " + (array == arrayCloned));
//        int[] arrayTheSameLink = array;
//        System.out.println("array == arrayTheSameLink : " + (array == arrayTheSameLink));
//
//        // сравнение содержимого массивов
        System.out.println("array equals arrayCloned : " + Arrays.equals(array, arrayCloned));
        int[] array1 = new int[10]; // объявление и инициализация массива
        for (int i = 0; i < array1.length; i++) {
            array[i] = i;
        }
        array1[0] = 100;
        System.out.println("array equals array1 : " + Arrays.equals(array, array1));

    }
}
