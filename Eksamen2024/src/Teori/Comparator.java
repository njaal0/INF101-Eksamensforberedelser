package Teori;

public class Comparator {
// The Comparator interface provides a way to define multiple ways of comparing two objects. 
// Instead of modifying the class whose objects need to be sorted, you create separate classes that implement the Comparator interface. 
// These classes define their own compare method which takes two objects of the type being compared.

// Characteristics of Comparator:
// Multiple Sorting Sequences: The Comparator interface allows you to define multiple ways of comparing objects, making it versatile for different sorting criteria.
// External to the Class: Comparators are implemented in separate classes, meaning the class being compared does not need to be modified.
// Custom Ordering: It is typically used for custom ordering, which might not be the natural ordering of the objects.
// Implementation: A class implements Comparator<T> and must provide the compare(T o1, T o2) method.
}
