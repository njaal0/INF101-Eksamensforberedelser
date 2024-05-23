import java.util.Collections;

import IterableIteratorComparatorComparable.Student;
import IterableIteratorComparatorComparable.StudentClass;

public class App {
    public static void main(String[] args) throws Exception {
        StudentClass students = new StudentClass();

        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getAge());
            System.out.println("---------");
        }

        Collections.sort(students.getAllStudents());

        System.out.println(students.toString());


    }
}
