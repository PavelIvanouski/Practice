package by.it_academy.practice.practice19.practiceSlide10;

import java.io.Serializable;

public class Book implements Serializable {
    private String author;
    private String title;
    private int yearWrite;

    public Book(String author, String title, int yearWrite) {
        this.author = author;
        this.title = title;
        this.yearWrite = yearWrite;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearWrite() {
        return yearWrite;
    }

    public void setYearWrite(int yearWrite) {
        this.yearWrite = yearWrite;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearWrite=" + yearWrite +
                '}';
    }
}