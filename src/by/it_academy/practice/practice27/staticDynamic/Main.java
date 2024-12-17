package by.it_academy.practice.practice27.staticDynamic;

public class Main {
    public static void main(String[] args) {

        Insurance current = new CarInsurance();

        int premium = current.premium();

        String category = current.category();

        System.out.println("premium : " + premium);
        System.out.println("category : " + category);
    }
}

class Insurance {
    public static final int LOW = 100;

    public int premium() {
        return LOW;
    }

    public static String category() {
        return "Insurance";
    }

}

class CarInsurance extends Insurance {
    public static final int HIGH = 200;

    public int premium() {
        return HIGH;
    }

    public static String category() {
        return "Car Insurance";
    }

}

