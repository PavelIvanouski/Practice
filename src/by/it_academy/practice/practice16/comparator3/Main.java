package by.it_academy.practice.practice16.comparator3;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {



        Comparator<Person> pcomp = new PersonNameComparator().thenComparing(new PersonAgeComparator());
        TreeSet<Person> people = new TreeSet(pcomp);
        people.add(new Person("Tom", 23));
        people.add(new Person("Nick",34));
        people.add(new Person("Tom",10));
        people.add(new Person("Bill",14));

        for(Person  p : people){
            System.out.println(p.getName() + " " + p.getAge());
        }

    }


}
