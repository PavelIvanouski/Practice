package by.it_academy.practice.practice7.staticExample;

public class Test {

    static {
        System.out.println("Вызов статического блока");
    }

    Test() {
        System.out.println("Вызов конструктора");
    }
}
