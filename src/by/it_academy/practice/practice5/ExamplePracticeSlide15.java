package by.it_academy.practice.practice5;

public class ExamplePracticeSlide15 {
    public static void main(String[] args) {
//        Найти сумму чисел массива
        int[] array = {10, 4, 6, 9, 2, 3, 8, 11, 5};
        int sumArr = 0;
        for (int i = 0; i < array.length; i++) {
            sumArr += array[i];
        }
        System.out.println("сумма чисел равна: " + sumArr);
    }


}
