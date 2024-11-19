package by.it_academy.practice.practice19.exampleFlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        List<Book> bookList = library.getReaders().stream()
                .flatMap(reader -> reader.getBooks().stream())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(bookList);

    }

}
