package by.it_academy.practice.practice23.exampleSingletone;

public class Main {
    public static void main(String[] args) {

        Counter counter = Counter.getInstance();
//        Counter counter2 = Counter.getInstance();
//        Counter counter3 = Counter.getInstance();
//        System.out.println(counter);
//        System.out.println(counter2);
//        System.out.println(counter3);

//        Counter counter2 = new Counter();
//        Counter counter3 = new Counter();
//        Counter counter4 = new Counter();


        counter.increment();
        counter.increment();
        counter.increment();

        System.out.println("Current count: " + counter.getCount() );

        Counter anotherCounter = Counter.getInstance();
        System.out.println("Current count after another getInstance() call: " + anotherCounter.getCount());

    }


}
