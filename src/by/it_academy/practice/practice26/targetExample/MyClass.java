package by.it_academy.practice.practice26.targetExample;

public class MyClass {
    private int id;
    private String name;

    @MyAnnotation(stringValue = "123", intValue = 10)
    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @MyAnnotation(stringValue = "123", intValue = 10)
    public void someMethod() {
        /*
        *
        *
        *
        * */
    }
}
