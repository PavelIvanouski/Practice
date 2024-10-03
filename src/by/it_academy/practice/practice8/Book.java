package by.it_academy.practice.practice8;

public class Book implements Printable, Searchable{
    @Override
    public void print() {
        System.out.println("Book");
    }
}
