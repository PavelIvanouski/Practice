package by.it_academy.practice.practice9;

public interface Searchable {
    void print();

    default void printDefault(String message) {
        System.out.println(message);
        privateMethod();
    }

    static void staticMethod() {
        System.out.println("static method");
    }

    private void privateMethod() {

    }

}
