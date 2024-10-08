package by.it_academy.practice.practice9.shape.v1;

class Cylinder extends SolidOfRevolution { // конкретный класс
    private double height;

    public Cylinder(double radius, double height) {
        super(Math.PI * radius * radius * height, radius);
        this.height = height;
    }
}
