package by.it_academy.practice.practice21.collisionExample;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Создаем и запускаем несколько потоков, которые будут увеличивать счетчик
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    counter.increment();
                }
            });
            thread.start();
        }

        try {
            Thread.sleep(1000); // даем потокам время для выполнения
        } catch (InterruptedException e) {}

        // Выводим значение счетчика
        System.out.println("Final counter " + counter.getCount());
    }


}
