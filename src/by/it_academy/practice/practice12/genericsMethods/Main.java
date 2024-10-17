package by.it_academy.practice.practice12.genericsMethods;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'A', 'B', 'C', 'D', 'E', 'F'};
        String[] stringArray = {"Java", "Generics", "Example"};


        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);
        printArray(stringArray);

    }

    public static <T> void printArray(T[] inputArray) {
        String arrayTypeName = inputArray.getClass().getSimpleName();
        System.out.println("\n\n" + arrayTypeName + " content:");

        for (T element : inputArray) {
            System.out.println(element + " ");
        }
    }


    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void printArray(String[] arr) {
        for (String j : arr) {
            System.out.print(j + " ");
        }
    }
}
