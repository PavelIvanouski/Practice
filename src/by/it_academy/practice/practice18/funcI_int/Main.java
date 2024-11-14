package by.it_academy.practice.practice18.funcI_int;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {


        // Consumer для вывода строки на консоль
        Consumer<String> printConsumer = message -> System.out.println(message);
        printConsumer.accept("Hello World");


        // Consumer для удвоения числа
        Consumer<Integer> doubleConsumer = n -> System.out.println(n * 2);
        doubleConsumer.accept(5);

        // Supplier для генерации случайного числа
        Supplier<Integer> randomSupplier = () -> (int) (Math.random() * 100);
        System.out.println("Random supplier " + randomSupplier.get());
        Supplier<Integer> numberTwoSupplier = () -> 2;
        System.out.println("Number two supplier " + numberTwoSupplier.get());

        // Supplier для предоставления времени в миллисекундах
        Supplier<Long> currentTimeMillisSupplier = () -> System.currentTimeMillis();
        System.out.println("Current time in milliseconds " + currentTimeMillisSupplier.get());
    }
}
