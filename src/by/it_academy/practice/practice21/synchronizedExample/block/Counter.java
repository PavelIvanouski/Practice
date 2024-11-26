package by.it_academy.practice.practice21.synchronizedExample.block;

public class Counter {

    private int count;

    public void increment() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
        }
        synchronized (this) {
            count++;
        }

    }

    public int getCount() {
        return count;
    }
}
