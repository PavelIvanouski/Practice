package by.it_academy.practice.practice22;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ExampleCompletableFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int number = 5;

        // async
        CompletableFuture<Long> completableFuture = CompletableFuture.supplyAsync(
                () -> factorial(number)
        );

        while (!completableFuture.isDone()) {
            System.out.println("CompletableFuture is in progress...");
        }

        long result = completableFuture.get();
        // !5=20
        System.out.println(number + " != " + result);




    }

    private static long factorial(int n) {
        if (n <= 2) {
            return n;
        }
        return factorial(n - 1) * n;
    }



}
