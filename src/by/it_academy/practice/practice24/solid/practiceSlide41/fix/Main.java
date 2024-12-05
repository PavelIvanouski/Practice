package by.it_academy.practice.practice24.solid.practiceSlide41.fix;

public class Main {
    public static void main(String[] args) {
        LibraryCatalog catalog = new LibraryCatalog();
        catalog.addBook(new Book("My book"));

        Customer customer = new Customer();
        customer.borrowBook("My book", catalog);


    }
}
