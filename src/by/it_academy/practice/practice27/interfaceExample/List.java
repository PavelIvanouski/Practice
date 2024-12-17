package by.it_academy.practice.practice27.interfaceExample;

public interface List {
    void add(Object element);

     default void test() {
         // some logic
     }
}
