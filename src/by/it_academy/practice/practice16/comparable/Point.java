package by.it_academy.practice.practice16.comparable;

public class Point implements Comparable<Point> {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) {
            return this.y == o.y ? 0 : this.y > o.y ? 1 : -1;
        } else if (this.x > o.x) {
            return 1;
        } else {
            return -1;
        }
    }
}
