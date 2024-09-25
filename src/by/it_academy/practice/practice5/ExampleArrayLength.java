package by.it_academy.practice.practice5;

public class ExampleArrayLength {
    public static void main(String[] args) {
        int[] ourCustomArray = {20, 4, 1, -6, 7};
        // изменять массив нельзя, т.к. память под него строго зарезервирована

        // пробуем положить значение 123 по индексу 10
//        ourCustomArray[10] = 123;
        // получаем ArrayIndexOutOfBoundsException

        // размер менять нельзя, можно менять элементы
        ourCustomArray[1] = 123;

        // можно узнать длину
        System.out.println("ourCustomArray length: " + ourCustomArray.length);
    }
}
