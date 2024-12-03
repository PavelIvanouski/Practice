package by.it_academy.practice.practice22_1.practiceSlide17;

public class Main {
    public static void main(String[] args) {
        Window window = new Window();
        Baker baker1 = new Baker("Bob", 20, window);
        Seller seller1 = new Seller(window, "Tom", 25);
        Thread producer1 = new Thread(baker1::produce);
        Thread consumer1 = new Thread(seller1::consume);
        producer1.start();
        consumer1.start();
    }
}