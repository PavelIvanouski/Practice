package by.it_academy.practice.practice16.comparator1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Point point1 = new Point(10, 30);
        Point point2 = new Point(1, 2);
        Point point3 = new Point(10, 7);

        PointComparator pointComparator = new PointComparator();
        System.out.println(pointComparator.compare(point1, point2));

        List<Point> points = new ArrayList<>();
        points.add(point1);
        points.add(point2);
        points.add(point3);

        System.out.println(points);

//        points.sort(new PointComparator());
        Collections.sort(points, new PointComparator());

        Comparator<Point> pointComparator1 = new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                int compare = Integer.compare(o1.getX(), o2.getX());
                if (compare == 0) {
                    return Integer.compare(o1.getY(), o2.getY());
                } else {
                    return compare;
                }
            }
        };
        Collections.sort(points, pointComparator1);
//
        System.out.println(points);


    }

}
