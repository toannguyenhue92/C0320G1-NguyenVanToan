package review;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Toan", 28));
        students.add(new Student("Toan", 30));
        students.add(new Student("Hoàng Dược Sư", 28));

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Student student : students) {
            Resizable.hello();
            System.out.println(student.getName());
            System.out.println(student.getAge());
        }
    }
}
