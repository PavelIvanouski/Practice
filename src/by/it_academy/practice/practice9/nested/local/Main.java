package by.it_academy.practice.practice9.nested.local;

public class Main {
    public static void main(String[] args) {

        int a = 100;

        class InnerClass {
            static final int EXAMPLE_VALUE = 100;
            public void print() {
                System.out.println("print");
                System.out.println(EXAMPLE_VALUE);
            }
        }

        InnerClass inner = new InnerClass();
        inner.print();


    }

}
