package IterableIteratorComparatorComparable;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class StudentClassIterator implements Iterator<Student> {
    private List<Student> students;
    private int currentIndex;

    public StudentClassIterator(List<Student> students) {
        this.students = students;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < students.size();
    }

    @Override
    public Student next() {
        if (!hasNext()) {
            throw new NoSuchElementException("There are no more students in this class.");
        } else {
            return students.get(currentIndex++);
        }
    }

}
