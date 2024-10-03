package by.it_academy.practice.practice8;

public interface Printable {

   void print();

    default void printDefault(){
        System.out.println("Undefined printable");
    }

    static void read(){
        System.out.println("Read printable");
    }
}
