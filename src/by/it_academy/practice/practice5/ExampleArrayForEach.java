package by.it_academy.practice.practice5;

public class ExampleArrayForEach {
    public static void main(String[] args) {
        int[] array = new int[10]; // объявление и инициализация массива
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        // вывод значений массива на экран при помощи цикла for-each
        System.out.println("Final array: ");
        for (int arrayElement : array) {
            System.out.print(arrayElement + " ");
        }

//        System.out.println();
//        // вывод значений массива на экран при помощи цикла for-each
//        // попытка изменения значения элемента
//        System.out.println("Final array: ");
//        for (int arrayElement : array) {
//            System.out.print(arrayElement + " ");
//            arrayElement = 10;
//        } System.out.println();
//        System.out.println();
//        for (int arrayElement : array) {
//            System.out.print(arrayElement + " ");
//        }
//
        // вывод в обратном порядке
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

    }
}
