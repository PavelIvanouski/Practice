package by.it_academy.practice.practice22_1.practiceSlide17;

import java.util.Random;

public class Baker {
    private Random random = new Random();
    private Window window;
    private String name;
    private int age;

    public Baker(String name, int age, Window window) {
        this.name = name;
        this.age = age;
        this.window = window;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void produce() {
        while (true) {
            try {
                Pie pie = new Pie(random.nextFloat());
                window.putPie(pie);
                System.out.printf("Thread %s produced a pie: %s%n", Thread.currentThread().getName(), pie);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}