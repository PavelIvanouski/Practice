package by.it_academy.practice.practice20.exampleThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CustomThread customThread = new CustomThread();
        customThread.start();

        Thread.sleep(1000);

        System.out.println("Hello from main thread!");
    }

}
