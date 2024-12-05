package by.it_academy.practice.practice24.solid.practiceSlide41.fix;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LibraryCatalog {

    List<Book> books;

    public LibraryCatalog() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

//    public void borrowBook(Book book) {
//// Code to handle book borrowing
//        System.out.println("Borrowed book " + book.getTitle());
//    }


    @Override
    public String toString() {
        return "LibraryCatalog{" +
                "books=" + books +
                '}';
    }

    public Book landBook(String title) {
        Book bookToLand  = books.stream()
                .filter(book -> book.getTitle().equals(title))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Book not found"));
        return bookToLand;
    }
}
