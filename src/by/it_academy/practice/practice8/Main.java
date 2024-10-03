package by.it_academy.practice.practice8;

public class Main {
    public static void main(String[] args) {
//        Bus bus = new Bus();
//        System.out.println(bus.toString());
//        bus.setName("MyBus");
//        System.out.println(bus.toString());
//        Bus bus = new Bus("green", "Maz", 100);
//        bus.printInfo();
//
//        bus.overloadTest("123");
//        bus.overloadTest();
//
//        final int finalExample = 10;
//
//         final Bus bus1 = new Bus("gren", "Maz", 100);
//        bus1.setName("Maz1");
//
//        Bus bus2 = new Bus("red", "Maz", 100);
//
////        bus1 = bus2;
//        Bus bus = new Bus("green", "Maz", 10);
//        System.out.println(bus);

//        Automobile automobile = new Automobile("green", "Belaz");
//        System.out.println(automobile);
//        Automobile clonedAuto = automobile.clone();
//        System.out.println(clonedAuto);
//        automobile.equals(clonedAuto);
//        System.out.println(automobile.getClass());

//    Printable book = new Book();
//    book.print();
//    Printable journal = new Journal();
//    journal.print();
//    journal.printDefault();
//    Printable.read();

//        Calculatable calculation = new Calculation();
//        int sum = calculation.sum(10, 10);
//        System.out.println(sum);

//        Printable book = new Book();
//        interfaceParamExample(book);
//        Printable journal = new Journal();
//        interfaceParamExample(journal);
//        Printable somePrintable = returnPrintableValue(true);
//        somePrintable.print();
        Figure rectangle = new Rectangle(2, 3);
        Figure square = new Square(5);

        printFigureSquare(rectangle);
        printFigureSquare(square);
    }

    private static void printRectangleSquareA(Rectangle rectangle) {
        System.out.println("Rectangle square is " + rectangle.getSquare());
    }

    private static void printSquareSquareA(Square square) {
        System.out.println("Square square is " + square.getSquare());
    }

    private static void printFigureSquare(Figure figure) {
        System.out.println("Figure " + figure.getClass() + " square is " + figure.getSquare());
    }




    public static void interfaceParamExample(Printable printable) {
        printable.print();
    }

    public static Printable returnPrintableValue(boolean booleanValue) {
        if (booleanValue) {
            return new Book();
        } else {
            return new Journal();
        }
    }
}
