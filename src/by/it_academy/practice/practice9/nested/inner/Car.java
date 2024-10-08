package by.it_academy.practice.practice9.nested.inner;

public class Car {

    private Engine engine;
    private String model;
    public Car() {
        this.engine = new Engine();
    }

    public void setEnginePower(int power) {
        engine.setPower(power);
    }


    public class Engine {
        private int power;

        public void setPower(int power) {
            this.power = power;
        }
    }
}
