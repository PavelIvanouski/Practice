package by.it_academy.practice.practice9.shape.v2;

class Ball extends SolidOfRevolution {
    // конкретный класс

    public Ball(double radius) {
        super(radius);
    }

    @Override
    public double getVolume() {
        return 4 / 3 * Math.PI * Math.pow(radius, 3);
    }
}
