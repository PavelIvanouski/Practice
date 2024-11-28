package by.it_academy.practice.practice22.threadPoolExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        try (ExecutorService executor = Executors.newFixedThreadPool(10)) {
            Runnable runnable = () -> System.out.println("Hello World!");
            executor.execute(runnable);
            executor.execute(() -> System.out.println("Message"));
        } finally {
            System.out.println("All tasks were execured successfully");
        }

    }
}
