package by.it_academy.practice.practice24.solid.ocp.fix;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(10);

        ShapeUtils shapeUtils = new ShapeUtils();
        double circleArea = shapeUtils.calculateArea(circle);
        System.out.println("Circle area : " + circleArea);

    }
}
