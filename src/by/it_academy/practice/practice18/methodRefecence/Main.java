package by.it_academy.practice.practice18.methodRefecence;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // пример ссылки на статический метод
//        Consumer<String> consumer = (message) -> {
//            System.out.println("Message" + message);
//        };
//        Consumer<String> consumerLambda = (message) -> System.out.println("Lambda" + message);
//        consumerLambda.accept("Hello");
        Consumer<String> consumer = Message::printMessage;
        consumer.accept("Hello World");

//        // пример ссылки на метод экземпляра
        Message someMessage = new Message();
        Supplier<String> supplier = someMessage::getMessage;
        System.out.println(supplier.get());

    }
}
