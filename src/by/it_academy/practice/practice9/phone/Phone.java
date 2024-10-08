package by.it_academy.practice.practice9.phone;

public class Phone {
    /*
    Создайте класс Phone, который содержит поля number, model и weight.
    Создайте три экземпляра (instance) этого класса.
    Выведите в консоль их значения.
    Добавить в класс Phone методы: receiveCall (один параметр – имя звонящего). Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов
    Добавить второй метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
    Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
    * */
    private String number;
    private String model;
    private double weight;

    public String getNumber() {
        return number;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println(name + " is calling");
    }

    public void receiveCall(String name, String number) {
        System.out.println(name + " is calling");
        System.out.println("Number: " + number);
    }

    public void sendMessage(String... numbers) {
        for (String number : numbers) {
            // send message

            //
            System.out.println(number + " is sending");
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
