package by.it_academy.practice.practice21.synchronizedExample.event;

public class Main {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread writerThread = new Thread(() -> {
            try {
                resource.write("Hello World!");

            } catch (InterruptedException e) {}
        });

        Thread readerThread = new Thread(() -> {
            try {
                String message = resource.read();
                System.out.println("Message read from resource: " + message);
            } catch (InterruptedException e) {}
        });

        readerThread.start();
        writerThread.start();

    }


}
