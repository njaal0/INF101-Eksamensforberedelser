package Teori;

public class Comparable {
//     Comparable
// The Comparable interface is used to define the natural ordering of objects. 
// A class that implements Comparable must override the compareTo method, 
// which compares "this" object with the specified object for order.
// The method returns a negative integer, zero, 
// or a positive integer if "this" object is less than, equal to, 
// or greater than the specified object, respectively.

// Characteristics of Comparable:
// Single Sorting Sequence: The Comparable interface allows you to define only one way of comparing objects.
// Modification within the Class: To use Comparable, you need to modify the class whose objects need to be sorted. 
// This means adding the compareTo method directly in the class.
// Natural Ordering: It’s typically used for natural ordering, 
// such as numerical order for numbers, alphabetical order for strings, etc.
// Implementation: A class implements Comparable<T> and must provide the compareTo(T o) method.
}
