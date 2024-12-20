package by.it_academy.practice.practice22_1;

import java.util.concurrent.Exchanger;

public class ExampleExchanger {
    public static void main(String[] args) throws InterruptedException {

        Exchanger<String> exchanger = new Exchanger<>();

        Thread thread1 = new Thread(() -> {
            String message = null;
            try {
                message = exchanger.exchange("Hello from Thread 1");
                System.out.println("Thread 1 got message: " + message);
            } catch (InterruptedException ignored) {
            }
        });

        Thread thread2 = new Thread(() -> {
            String message = null;
            try {
                message = exchanger.exchange("Hello from Thread 2");
                System.out.println("Thread 2 got message: " + message);
            } catch (InterruptedException ignored) {
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }

}
