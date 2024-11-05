package by.it_academy.practice.practice16.comparator3;

import java.util.Comparator;

class PersonAgeComparator implements Comparator<Person> {

   public int compare(Person a, Person b){

           return Integer.compare(a.getAge(), b.getAge());
   }
}
