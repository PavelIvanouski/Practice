package by.it_academy.practice.practice18.funcI_int;

import java.util.function.Consumer;

public class ExampleConsumer {
    public static void main(String[] args) {
        // Consumer для вывода строки на консоль
        Consumer<String> printConsumer = message -> System.out.println(message);
        printConsumer.accept("Hello World");

        // Consumer для удвоения числа
        Consumer<Integer> doubleConsumer = n -> System.out.println(n * 2);
        doubleConsumer.accept(5);
    }
}
