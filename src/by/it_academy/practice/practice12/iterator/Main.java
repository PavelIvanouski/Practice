package by.it_academy.practice.practice12.iterator;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = {1,2,4,5,8};
        ArrayIterator<Integer> integerArrayIterator = new ArrayIterator<>(integers);

        while (integerArrayIterator.hasNext()) {
            System.out.println(integerArrayIterator.next());
        }
    }
}
