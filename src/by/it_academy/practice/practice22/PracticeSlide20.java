package by.it_academy.practice.practice22;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class PracticeSlide20 {
    //       /
//               * Напишите программу, которая асинхронно генерирует N случайных чисел и выводит их на экран.
//            *
//            * @param args
//     */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int n = 100;

        List<CompletableFuture<Integer>> numbersFutures = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            CompletableFuture<Integer> integerCompletableFuture = CompletableFuture.supplyAsync(() -> generateRandomInt(0, 100));

            numbersFutures.add(integerCompletableFuture);
        }

        for (int i = 0; i < n; i++) {
            CompletableFuture<Integer> integerCompletableFuture = numbersFutures.get(i);
            System.out.println(
                    i + ": " + integerCompletableFuture.get()
            );
        }
    }

    //    /
//            * Вернет случайное число от min до max
//     *
//             * @param max
//     * @return
//             */
    public static int generateRandomInt(int min, int max) {
        return (int) (Math.random() * max + min);
    }
}
