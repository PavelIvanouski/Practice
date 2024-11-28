package by.it_academy.practice.practice22;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class PracticeSlide9 {
    public static void main(String[] args) {
        int[][] multiArray = {{1, 2, 3},
                {2, 3, 4},
                {4, 1, 2}};
        AtomicInteger sumArray = new AtomicInteger();
        try (ExecutorService workers = Executors.newFixedThreadPool(3)) {
            for (int i = 0; i < multiArray.length; i++) {
                int[] currentArray = multiArray[i];
                workers.execute(() -> {
                    int currentSum = sumStr(currentArray);
                    sumArray.set(sumArray.get() + currentSum);
                });
            }
        } finally {
            System.out.printf("All workers executed, total sum %d\n", sumArray.get());
        }
    }

    public static int sumStr(int[] arrayInt) {
        int sum = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            sum = arrayInt[i] + sum;
        }
        return sum;
    }
}
