package by.it_academy.practice.practice9;

public class Main {
    public static void main(String[] args) {
        Automobile car = new Car();
        Automobile bus = new Bus();
        car.printInfo();
        bus.printInfo();

        Person person = new Person("Petia");
        Car car1 = new Car();

        Book book = new Book();
        book.print();
        Searchable.staticMethod();

    }
}
