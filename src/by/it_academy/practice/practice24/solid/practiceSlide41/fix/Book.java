package by.it_academy.practice.practice24.solid.practiceSlide41.fix;

public class Book {
       private String title;


    public Book(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }

    public String getTitle() {
       return title;
   }
}
