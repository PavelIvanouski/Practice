package by.it_academy.practice.practice23.exampleAdapter;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5 , 3);

        Shape shape = new RectangleAdapter(rectangle);
        System.out.println("Area: " + shape.getArea());

        shape.draw();

    }

}
