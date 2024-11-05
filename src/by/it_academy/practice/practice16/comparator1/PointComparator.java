package by.it_academy.practice.practice16.comparator1;

import java.util.Comparator;

public class PointComparator implements Comparator<Point> {

 /*
 number1 = 10;
 number2 = 4;
 compare = 10 - 4 = 6
 * */

   @Override
   public int compare(Point o1, Point o2) {
       int compare = Integer.compare(o1.getX(), o2.getX());
       if (compare == 0) {
           return Integer.compare(o1.getY(), o2.getY());
       } else {
           return compare;
       }
   }
}
