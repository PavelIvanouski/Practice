package by.it_academy.practice.practice7.procedure_vs_oop;

public class Calculator {

    // Поля класса - его свойства (значения)
    private double result;
    private String name;
    protected String defaultModVar;


    // Конструктор - метод, который отвечат за создание объекта
    public Calculator() {
        this.result = 0;
    }

    //default constructor
//        public Calculator() {
//    }

    public Calculator(double result) {
        this.result = result;
    }

    public Calculator(String name) {
        this.name = name;
    }

    public Calculator(double result, String name) {
        this.result = result;
        this.name = name;
    }

    // Методы класс - его поведение
    public void add(double num) {
        this.result += num;
    }

    public void subtract(double num) {
        this.result -= num;
    }

    public double getResult() {
        return this.result;
    }

    private void testPrivate() {
        System.out.println("Private method");
    }


}
