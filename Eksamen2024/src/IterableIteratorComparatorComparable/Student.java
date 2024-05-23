package IterableIteratorComparatorComparable;

public class Student implements Comparable<Student>{
    
    public int age;
    public String name;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Student that) {
        if (this.getAge() > that.getAge()) {
            return 1;
        }
        else {
            return -1;
        }
    }

    
    
}
