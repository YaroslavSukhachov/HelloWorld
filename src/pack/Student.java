package pack;

import org.hillel.examples.Human;

public class Student extends Human {
    private int studentId;
    private double averageMark;

    public Student() {
        super(0, null);
        System.out.println("student constructor");
    }

    public Student(String name, int studentId, double averageMark) {
        super(0, name);
//        this.name = name;
        this.studentId = studentId;
        this.averageMark = averageMark;
    }

    public Student(int studentId, double averageMark) {
        this.studentId = studentId;
        this.averageMark = averageMark;
    }

    public void study() {
        System.out.println("student is studying");
    }

//    public String getName() {
//        return name;
//    }

//    public void setName(String name) {
//        if (name.length() == 0) {
//            System.out.println("invalid string");
//            return;
//        }
//
//        this.name = name;
//    }

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
}
