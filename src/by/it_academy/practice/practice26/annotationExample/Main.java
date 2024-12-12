package by.it_academy.practice.practice26.annotationExample;

public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Student student = new Student("Nick");
        student.study();
    }
}
