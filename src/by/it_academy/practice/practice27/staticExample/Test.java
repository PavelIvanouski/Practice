package by.it_academy.practice.practice27.staticExample;

public class Test {

    static {
        System.out.println("Ho-ho!");
    }
    static {
        System.out.println("Bo-bo!");
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    static {
        System.out.println("Go-go!");
        System.exit(0);
    }
}
