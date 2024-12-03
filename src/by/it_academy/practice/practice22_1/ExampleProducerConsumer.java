package by.it_academy.practice.practice22_1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ExampleProducerConsumer {

    BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<Integer>(5);

    private void produce() {
        for (int i = 0; i < 3; i++) {
            try {
                int value = (int) (Math.random() * 100);
                blockingQueue.put(value);
                System.out.println(Thread.currentThread().getName() + " Value  produced: " + value);
            } catch (InterruptedException e) {
                System.out.println("Exception while calling produce()");
                break;
            }
        }


    }

    private void consume() {
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + " Value  consumed: " + blockingQueue.take());
            } catch (InterruptedException e) {
                System.out.println("Exception while calling consume()");
                break;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        ExampleProducerConsumer example = new ExampleProducerConsumer();

        for (int i = 0; i < 2; i++) {
            Thread producerThread = new Thread(example::produce);
            producerThread.start();
        }

        for (int i = 0; i < 3; i++) {
            Thread consumerThread = new Thread(example::consume);
            consumerThread.start();
        }


    }

}
