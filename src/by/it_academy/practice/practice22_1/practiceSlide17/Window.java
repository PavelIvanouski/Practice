package by.it_academy.practice.practice22_1.practiceSlide17;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Window {
    private final BlockingQueue<Pie> queue = new ArrayBlockingQueue<>(5);

    public Window() {}

    public void putPie(Pie p) throws InterruptedException {
        queue.put(p);
    }

    public Pie takePie() throws InterruptedException {
        return queue.take();
    }
}