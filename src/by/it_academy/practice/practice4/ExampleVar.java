package by.it_academy.practice.practice4;

public class ExampleVar {

    private static int intVar;

    public static void main(String[] args) {
        intVar=20;
        System.out.println(intVar);
//        int y = 10;
//        nothingToDo(10);
        nothingToDo(getIntVar());
    }

    private static int getIntVar() {
        int x = 100;
        System.out.println(x);
        return x;
    }


    private static void nothingToDo(int x) {
        intVar=30;
        x++;
        System.out.println(intVar);
    }

    private static void nothingToDo1(int x) {
        intVar=30;
        System.out.println(intVar);
    }
}
