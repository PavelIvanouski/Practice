package by.it_academy.practice.practice9.shape.v1;

class Pyramid extends Shape {
    private double height;
    private double s; // площадь основания

    public Pyramid(double height, double s) {
        super(s * height / 3);
        this.height = height;
        this.s = s;
    }
}
