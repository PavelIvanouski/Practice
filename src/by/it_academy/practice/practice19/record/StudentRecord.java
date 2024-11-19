package by.it_academy.practice.practice19.record;

public record StudentRecord(String name, Integer age) implements Comparable<StudentRecord> {
    @Override
    public int compareTo(StudentRecord o) {
        return 0;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }
}
