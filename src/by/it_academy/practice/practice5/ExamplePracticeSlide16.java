package by.it_academy.practice.practice5;

public class ExamplePracticeSlide16 {
    public static void main(String[] args) {
        // Найти максимальный из элементов массива с четными индексами:
        int[] array = {1, 4, 6, 9, 2, 3, 8, 12, 5};
//        int max = array[2];
        int max = Integer.MIN_VALUE;
        for (int i = 2; i < array.length; i += 2) {
            System.out.println("Очередное число: " + array[i]);
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Максимальное число: " + max);

    }
}
