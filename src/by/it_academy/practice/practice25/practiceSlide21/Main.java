package by.it_academy.practice.practice25.practiceSlide21;
/*
Интернет-магазин создать класс Товар, имеющий переменные имя, цена, рейтинг.
Создать класс Категория, имеющий переменные имя и массив товаров.
Создать несколько объектов класса Категория.
Создать класс Basket, содержащий массив купленных товаров и дату покупки.
* */
public class Main {
    public static void main(String[] args) {
        Category category1 = new Category("Milk products");
        Category category2 = new Category("Cakes and bread");
        Category category3 = new Category("Milk and fish");
        Product product1 = new Product("Cake", 10.5, category2);
        Product product2 = new Product("Milk", 5.2, category1);
        Product product3 = new Product("Fish", 12.5, category3);
        Product product4 = new Product("Bread", 5.0, category2);
        Product product5 = new Product("Meat", 15.5, category3);
        Product product6 = new Product("Cheese", 10.0, category1);
        Basket basket = new Basket();
        basket.addProduct(product1);
        basket.addProduct(product3);
        basket.print();
    }
}