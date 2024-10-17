package by.it_academy.practice.practice12.iterator;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {

    private T[] array;
    private int index;

    public ArrayIterator(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
//        if (index == array.length) {
//            return false;
//        }
//        return true;
//        return index != array.length;
        return index < array.length;
    }

    @Override
    public T next() {
        return array[index++];
    }
}
