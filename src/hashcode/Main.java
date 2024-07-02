package hashcode;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Student> studentList = new HashSet<>();
        studentList.add(new Student("Erhan", "Delen", 20, "123", 3.5));
        studentList.add(new Student("Yekta", "Karatay", 21, "124", 3.8));
        studentList.add(new Student("Esra", "Delen", 22, "123", 3.9));
        studentList.add(new Student("Fatma", "Demir", 23, "125", 3.6));

        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}