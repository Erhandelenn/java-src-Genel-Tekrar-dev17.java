package hashcode;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Student> studentList = new HashSet<>();
        studentList.add(new Student("Erhan", "Delen", 20, "1922120049"));
        studentList.add(new Student("Yekta", "Karatay", 21, "1922120048"));
        studentList.add(new Student("Esra", "Delen", 22, "1922120048"));
        studentList.add(new Student("Fatma", "Demir", 23, "1922120049"));

        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}