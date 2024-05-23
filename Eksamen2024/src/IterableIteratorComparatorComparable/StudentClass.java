package IterableIteratorComparatorComparable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentClass implements Iterable<Student> {

    private List<Student> students;

    public StudentClass() {
        students = new ArrayList<>();
        students.add(new Student("Njål", 26));
        students.add(new Student("Jonas", 25));
        students.add(new Student("Leila", 20));
        students.add(new Student("Martin", 21));
    }

    public List<Student> getAllStudents() {
        return this.students;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentClassIterator(students);
    }

    @Override
    public String toString() {
        return "Students: " + students;
    }

}
