package by.it_academy.practice.practice6;

import java.util.Arrays;

public class ExampleArraysUtil {
    public static void main(String[] args) {
        int[] nums = new int[4];
        Arrays.fill(nums, 36);
        System.out.println(Arrays.toString(nums));

//        int[] srcArr = {1, 2, 3, 4, 5};
//        int[] destArr = Arrays.copyOf(srcArr, srcArr.length );
//        System.out.println(Arrays.toString(destArr));

//        int[] srcArr = {1, 2, 3, 4, 5};
//        int[] destArr = Arrays.copyOf(srcArr, srcArr.length + 2);
//        System.out.println(Arrays.toString(destArr));
//        destArr[srcArr.length] = 6;
//        destArr[srcArr.length + 1] = 7;
//        System.out.println(Arrays.toString(destArr));

//        boolean[] states1 = {false, true, false};
//        boolean[] states2 = {false, true, false};
//        boolean[] states3 = {false, false, true};
//        System.out.println("Массивы " + (Arrays.equals(states1, states2) ? "равны" : "не равны"));
//        System.out.println("Массивы " + (Arrays.equals(states1, states3) ? "равны" : "не равны"));

//        int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
//        System.out.println(Arrays.toString(numbers));
//        Arrays.sort(numbers);


//        int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
//        System.out.println(Arrays.toString(numbers));
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//

//        int[] firstArray = {1, 2, 3, 4, 5};
//        int[] secondArray = {1, 2, 3, 5, 8};
//        System.out.println(Arrays.mismatch(firstArray, secondArray));

//        char vowels[] = {'a', 'e', 'i', 'o', 'u'};
//        char key = 'i';
//        int foundItemIndex = Arrays.binarySearch(vowels, key);
//        System.out.println("The given vowel is at index: " + foundItemIndex);

//        char vowels[] = {'a', 'e', 'i', 'o', 'u'};
//        char key = 'i';
//        int startIndex = 2;
//        int endIndex = 4;
//        int foundItemIndex = Arrays.binarySearch(vowels, startIndex, endIndex, key);
//        System.out.println("The given vowel is at index: " + foundItemIndex);

//        Предположим, у нас есть массив [5, 6, 7, 8, 9, 10] и ключ поиска 0, которого явно нет в массиве. В этом случае ключ
//        поиска меньше, чем все элементы массива. Но первым элементом, который больше ключа поиска, является 5. Таким
//        образом, в нашем случае insertion point будет:
        //(-(the index of the first element larger than the search key) - 1) = (0 - 1) = -1
//        int numbers[] = {5, 6, 7, 8, 9, 10};
//        System.out.println(Arrays.binarySearch(numbers, 0)); // -1

//        Давайте снова предположим, что у нас есть массив [5, 6, 7, 8, 9, 10] и ключ поиска 12, которого явно нет в массиве. В
//        этом случае ключ поиска больше, чем все элементы массива. Здесь insertion point будет таким:
//        (-(the ending index (-(6) - 1) = (-6 - 1) = -7
//        int numbers[] = {5, 6, 7, 8, 9, 10};
//        System.out.println(Arrays.binarySearch(numbers, 12)); // -7

//        int numbers[] = { 9, 8, 7, 6, 3, 1 };
//        System.out.print("Unsorted Array: ");
//        System.out.println(Arrays.toString(numbers));
//        Arrays.parallelSort(numbers);
//        System.out.print("Sorted Array: ");
//        System.out.println(Arrays.toString(numbers));

//            char[] charArray = {'b', 'f', 'a'};
//            Arrays.sort(charArray);
//            System.out.println(Arrays.toString(charArray));

//        String[] srtArray = {"aaa", "ccc", "bbb", "aba"};
//        Arrays.sort(srtArray);
//        System.out.println(Arrays.toString(srtArray));

//        int numbers[] = { 9, 8, 7, 6, 3, 1 };
//        int hashCode = Arrays.hashCode(numbers);
//        System.out.print("Array hashcode: " + hashCode);


    }
}
