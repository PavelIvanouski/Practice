package by.it_academy.practice.practice20.practiceSlide24;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class ExampleAtomic {
    public static void main(String[] args) {

        AtomicInteger i = new AtomicInteger(10);

        Consumer<String>  stringConsumer = value -> {
            System.out.println(value);
            i.set(100);
        };

        stringConsumer.accept("Hello");
        System.out.println(i.get());
    }
}
