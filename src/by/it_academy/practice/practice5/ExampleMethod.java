package by.it_academy.practice.practice5;

public class ExampleMethod {

    public static void main(String[] args) {
//        int intVar = foo();
//        foo2(10, 10);

        foo4(10);
        foo4(10, 20);
        foo4(10, 20, 30);
        int[] array = {1,2,3,4,5};
        foo4(array);
    }

    private static void foo4(int... x) {
        System.out.println("Method begin");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        System.out.println("Method end");
    }

    private static int foo() {
        System.out.println("1");
        System.out.println("2");
        return 10;
    }

    private static void foo1() {
        System.out.println("1");
        System.out.println("2");
    }

    private static void foo2(int x, int y) {
        System.out.println("1");
        System.out.println("2");
    }

}
