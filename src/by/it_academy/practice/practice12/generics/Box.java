package by.it_academy.practice.practice12.generics;

public class Box<T> {

    private T item;


    public T getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "Box{" +
                "item=" + item +
                '}';
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Box(T item) {
        this.item = item;
    }
}
