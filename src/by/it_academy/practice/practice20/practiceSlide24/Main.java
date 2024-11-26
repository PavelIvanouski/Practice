package by.it_academy.practice.practice20.practiceSlide24;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        AtomicInteger minElement = new AtomicInteger(Integer.MAX_VALUE);
        AtomicInteger maxElement = new AtomicInteger(Integer.MIN_VALUE);
        Runnable runnable1 = () -> {
            for (Integer number : numbers) {
                if (number < minElement.get()) {
                    minElement.set(number);
                }
            }
        };
        Runnable runnable2 = () -> {
            for (Integer number : numbers) {
                if (number > maxElement.get()) {
                    maxElement.set(number);
                }
            }
        };
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Minimal value is: %d%n", minElement.get());
        System.out.printf("Maximal value is: %d%n", maxElement.get());

    }
}

