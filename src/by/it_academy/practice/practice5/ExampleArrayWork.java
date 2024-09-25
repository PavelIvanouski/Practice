package by.it_academy.practice.practice5;

import java.util.Random;

public class ExampleArrayWork {
    public static void main(String[] args) {
//        int[]  ourCustomArray = {20, 4, 1, -6, 7};
//        // доступ к элементу массива с индексом 2
//        System.out.println("ourCustomArray element #2: " + ourCustomArray[2]);
//        // изменение значения элемента массива с индексом 2
//        ourCustomArray[2] = 100;
//        System.out.println("ourCustomArray element #2: " + ourCustomArray[2]);

        int[] array = new int[10]; // объявление и инициализация массива
        Random random = new Random(); // пакет java.util.Random
        // заполнение массива случайными числами
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        // вывод значений массива на экран
        System.out.println("Initial array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
//
//        System.out.println();
//        // Изменение значений массива на +10
//        for (int i = 0; i < array.length; i++) {
//            array[i] += 10;
//        }
//        System.out.println("Initial array changed: ");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }

//
//         вывод значений массива на экран при помощи цикла for-each
        System.out.println();
        System.out.println("Final array: ");
        for (int arrayElement : array) {
            System.out.print(arrayElement + " ");
        }

    }
}
