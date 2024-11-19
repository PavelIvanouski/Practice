package by.it_academy.practice.practice19.exampleFlatMap;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;
    private List<Reader> readers;

    public Library() {
        init();
    }

    private void init() {
        books = new ArrayList<>();
        books.add(new Book("Оруэлл", "1984", 2021));
        books.add(new Book("Караткевич", "Дзiкае паляванне караля Стаха", 2020));
        books.add(new Book("Толкиен", "Хоббит", 2024));


        readers = new ArrayList<>();
        readers.add(new Reader("Иванов Иван Иванович", "ivanov.email@test.by", true));
        readers.add(new Reader("Петров Петр Петрович", "petrov.email@test.by", true));

        readers.get(0).getBooks().add(books.get(0));
        readers.get(0).getBooks().add(books.get(1));
        readers.get(0).getBooks().add(books.get(2));

        readers.get(1).getBooks().add(books.get(1));
        readers.get(1).getBooks().add(books.get(2));


    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Reader> getReaders() {
        return readers;
    }
}
