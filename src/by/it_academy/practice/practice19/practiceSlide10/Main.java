package by.it_academy.practice.practice19.practiceSlide10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main (String[] args) throws IOException, ClassNotFoundException {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Оруэлл", "1984", 2021));
        books.add(new Book("Караткевич", "Дзiкае паляванне караля Стаха", 2020));
        books.add(new Book("Толкиен", "Хоббит", 2024));

        writeBooksToFile(books);
        List<Book> bookList = readBooksToFile("resources/books.txt");
        System.out.println(bookList);

        Predicate<Book> filterByAuthor = book -> book.getAuthor().equals("Оруэлл");
        Predicate<Book> filterByYear = book -> book.getYearWrite()<2024;
        List<Book> bookByYear = filterList("resources/books.txt",filterByYear);
        List<Book> bookByAuthor = filterList("resources/books.txt", filterByAuthor);
        System.out.println("book by author"+bookByAuthor);
        System.out.println("book by year"+bookByYear);


    }
    private static List<Book> filterList(String filePath, Predicate<Book> predicate) throws IOException, ClassNotFoundException {
        List<Book> bookList = readBooksToFile(filePath);
        List<Book> filtredBook = bookList.stream().
                filter(predicate).toList();
        return filtredBook;
    }

    private static List<Book> readBooksToFile(String filePath) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream =new FileInputStream(filePath);
        ObjectInputStream objectInputStream =new ObjectInputStream(fileInputStream);


        List<Book> readBooks = (List<Book>) objectInputStream.readObject();
        return readBooks;

    }

    private static void writeBooksToFile(List<Book> books) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("resources/books.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(books);

        objectOutputStream.close();

    }
}
