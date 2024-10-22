package by.it_academy.practice.practice13;

public class ExampleCheckedUncheckedExceptions {
    public static void main(String[] args)  {
        try {
            //обязательно обработать
            test1();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // можно не обрабатывать
        test2();


    }

    public static void test1() throws Exception {
        // some logic
        throw new Exception();
    }


    private static void test2() {
        // some logic
        throw new RuntimeException();
    }

}
