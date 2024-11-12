package by.it_academy.practice.practice17;

public class ExampleMethodsStack {

    public static void main(String[] args) {
        System.out.println("main start");
        test1();
        System.out.println("main finish");
    }


    private static void test1() {
        System.out.println("test1 start");
        test2();
        System.out.println("test1 finish");

    }

    private static void test2() {
        System.out.println("test2");
    }


}
