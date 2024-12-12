package by.it_academy.practice.practice26.annotationExample;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }


    /**
     * Use instead:
     * @see Student#studyUpdatedProgram
     * */
    @Deprecated
    public void study() {
        System.out.println("Studying old program.");
    }


    public void studyUpdatedProgram() {
        System.out.println("Studying updated program.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
