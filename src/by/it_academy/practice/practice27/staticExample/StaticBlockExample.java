package by.it_academy.practice.practice27.staticExample;

public class StaticBlockExample {

    static int staticVar;

    static {
        staticVar = 42;
        System.out.println("Static block executed. staticVar = " + staticVar);
    }

    public StaticBlockExample() {
        System.out.println("Constructor executed.");
    }

    public static void main(String[] args) {
        System.out.println("Main executed.");
        StaticBlockExample example = new StaticBlockExample();
    }
}
