package by.it_academy.practice.practice9;

public class Student  implements Comparable<Student>{
   private Integer id;
   private String name;
   private String department;

   public Student(Integer id, String name, String department) {
       this.id = id;
       this.name = name;
       this.department = department;
   }

   public Integer getId() {
       return id;
   }

   public void setId(Integer id) {
       this.id = id;
   }

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public String getDepartment() {
       return department;
   }

   public void setDepartment(String department) {
       this.department = department;
   }

//   @Override
//   public int compareTo(Student student) {
//      return this.name.compareTo(student.getName());
//   }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
