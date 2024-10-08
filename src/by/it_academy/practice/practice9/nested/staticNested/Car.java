package by.it_academy.practice.practice9.nested.staticNested;

public class Car {

    private Engine engine;

    private static void someMethod() {
        System.out.println("1");
    }

    public static class Engine {

        private static int power;

        public static void method() {
            someMethod();
        }

        public void run() {

        }

    }
}
