package by.it_academy.practice.practice9.nested.staticNested;

public class Main {
    public static void main(String[] args) {

        Car.Engine carEngine = new Car.Engine();
        carEngine.run();

        Car.Engine.method();

        Plane.Engine planeEngine = new Plane.Engine();
        planeEngine.run();
        planeEngine.method();

    }

}
