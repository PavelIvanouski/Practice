package by.it_academy.practice.practice18.funcI_int;

import java.util.function.Supplier;

public class ExampleSupplier {
    public static void main(String[] args) {
        // Supplier для генерации случайного числа
        Supplier<Integer> randomSupplier = () -> (int) (Math.random() * 100);
        System.out.println("Random supplier " + randomSupplier.get());

        // Supplier для предоставления времени в миллисекундах
        Supplier<Long> currentTimeMillisSupplier = () -> System.currentTimeMillis();
        System.out.println("Current time in milliseconds " + currentTimeMillisSupplier.get());
    }
}
