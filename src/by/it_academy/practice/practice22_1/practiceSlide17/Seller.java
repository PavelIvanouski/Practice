package by.it_academy.practice.practice22_1.practiceSlide17;

public class Seller {
    private Window window;
    private String name;
    private int age;

    public Seller(Window window, String name, int age) {
        this.window = window;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void consume() {
        while (true) {
            try {
                Pie pie = window.takePie();
                System.out.printf("Thread %s consumed a pie %s%n", Thread.currentThread().getName(), pie);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}