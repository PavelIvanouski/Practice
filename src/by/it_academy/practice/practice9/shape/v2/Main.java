package by.it_academy.practice.practice9.shape.v2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
   public static void main(String[] args) {
       Ball ball = new Ball(4.5);

       Cylinder cylyinder = new Cylinder(2, 2);

       Pyramid pyramid = new Pyramid(100, 100);

       Box box = new Box(1000);
       System.out.println(box.add(ball)); // ok
       System.out.println(box.add(cylyinder)); // ok
       System.out.println(box.add(pyramid)); // failed
       // Sorting:
       ArrayList<Shape> shapes = box.getShapes();
       Collections.sort(shapes); // sorted by Volume!
   }
}
