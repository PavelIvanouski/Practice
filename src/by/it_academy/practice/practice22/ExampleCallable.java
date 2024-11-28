package by.it_academy.practice.practice22;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ExampleCallable {
    public static void main(String []args) throws Exception {

        Callable task = () -> "Hello, World!";

        FutureTask<String> future = new FutureTask<>(task);
        new Thread(future).start();
        while (!future.isDone()) {
            System.out.println("Future is in progress...");
        }
        System.out.println(future.get());
    }

}
