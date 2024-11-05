package by.it_academy.practice.practice16.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Point point1 = new Point(10, 30);
        Point point2 = new Point(1, 2);
        List<Point> points = new ArrayList<>();
        points.add(point1);
        points.add(point2);
        System.out.println(points);
        Collections.sort(points);
        System.out.println(points);




    }

}
