package by.it_academy.practice.practice9.shape.v1;

class Ball extends SolidOfRevolution {
    // конкретный класс
    public Ball(double radius) {
        super(4 / 3 * Math.PI * Math.pow(radius, 3), radius);
    }

}
