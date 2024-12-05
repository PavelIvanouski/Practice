package by.it_academy.practice.practice24.solid.practiceSlide41.fix;

public class Customer {
    public void borrowBook(String title, LibraryCatalog catalog) {
        Book book = catalog.landBook(title);
        System.out.println("Book " + title + " borrowed from catalog " + catalog);
    }
}
