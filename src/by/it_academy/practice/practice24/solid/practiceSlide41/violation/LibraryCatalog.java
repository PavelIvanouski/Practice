package by.it_academy.practice.practice24.solid.practiceSlide41.violation;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {

    List<Book> books;

    public LibraryCatalog() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void borrowBook(Book book) {
// Code to handle book borrowing
        System.out.println("Borrowed book " + book.getTitle());
    }
}
