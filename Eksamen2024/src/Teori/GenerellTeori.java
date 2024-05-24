package Teori;

public class GenerellTeori {
//Java Classes
    //Definition: A class is a blueprint for creating objects. 
    //It defines a type by bundling data (fields) and methods that operate on the data.

    // Components: Fields (variables), methods, constructors, and nested classes.
    // Instantiation: Objects are instances of classes created using the new keyword.
    // Access Modifiers: Classes can use public, protected, private, 
    // and default (package-private) access modifiers to control visibility.

// Java Interfaces
    // Definition: An interface is a reference type in Java, similar to a class, 
    // that can contain only constants, method signatures, default methods, static methods, and nested types.
    // Purpose: Used to achieve abstraction and multiple inheritance in Java.
    // Implementation: A class implements an interface using the implements keyword.
    // Default and Static Methods: Since Java 8, interfaces can have default and static methods with implementations.

// Abstraction
    // Definition: Abstraction is the concept of hiding the complex implementation details 
    // and showing only the necessary features of an object.
    // Implementation in Java: Achieved using abstract classes and interfaces.
    // Abstract Class: A class that cannot be instantiated and may contain abstract methods 
    // (methods without implementations).

// Polymorphism
    // Definition: Polymorphism allows objects to be treated as instances of their parent class rather than their actual class. The method to be invoked is determined at runtime.
    // Types:
    // Compile-time Polymorphism (Method Overloading): Multiple methods with the same name but different parameters.
    // Runtime Polymorphism (Method Overriding): A subclass provides a specific implementation of a method declared in its superclass.

// Mutability
    // Mutable Objects: Objects whose state can be changed after they are created. Example: ArrayList, HashMap.
    // Immutable Objects: Objects whose state cannot be changed once created. Example: String, Integer.

// Stack and Heap
    // Stack:
        // Used for static memory allocation.
        // Stores local variables and function call frames.
        // Follows LIFO (Last In First Out) principle.
    // Heap:
        // Used for dynamic memory allocation.
        // Stores objects and instances.
        // Memory management is handled by the Garbage Collector.

// Primitive and Reference Data Types
    // Primitive Data Types:
        // Basic data types provided by Java.
        // Includes: byte, short, int, long, float, double, char, boolean.
        // Stored in the stack.

// Reference Data Types:
    // References to objects.
        // Includes: String, Arrays, Classes, `Interfaces.
        // Stored in the heap (object itself) and stack (reference).

// Summary
// Classes: Blueprints for objects, containing fields, methods, and constructors.

// Interfaces: Contracts defining methods that implementing classes must provide.

// Abstraction: Hiding implementation details to show only the necessary features.

// Polymorphism: Treating objects as instances of their parent class, 
// enabling method overriding and method overloading.

// Mutability: Determines whether an object's state can be modified after creation.

// Stack and Heap: Memory areas for storing data; stack for static memory, heap for dynamic memory.

// Primitive vs. Reference Data Types: Primitives are basic types, 
// stored directly; reference types are objects stored in the heap, with references on the stack.

///////////////////////////////////

// equals() Method
// The equals() method is used to determine if two objects are considered equal. It's part of the Object class, which is the superclass for all Java classes.

// Default Implementation:

// The default implementation in Object checks if two references point to the same memory location (reference equality).
// Overriding equals():

// When overriding equals(), you define what makes two instances of a class equal.
// The method must adhere to the following contract:
// Reflexive: a.equals(a) should return true.
// Symmetric: a.equals(b) should return true if and only if b.equals(a) returns true.
// Transitive: If a.equals(b) and b.equals(c), then a.equals(c) should also return true.
// Consistent: Multiple invocations of a.equals(b) consistently return true or false, provided no information used in equals comparisons is modified.
// Null Comparison: a.equals(null) should return false.

////////////////////////////////////

// hashCode() Method
// The hashCode() method returns an integer hash code value for the object. It's used in hashing-based collections like HashMap, HashSet, and Hashtable.

// Default Implementation:

// The default implementation in Object returns a native integer representing the memory address of the object.
// Overriding hashCode():

// When you override equals(), you must also override hashCode() to maintain the general contract for hashCode which states:
// If two objects are equal according to equals(), they must have the same hash code.
// If two objects are not equal according to equals(), it is not required that they have different hash codes. 
// However, producing distinct hash codes for unequal objects can improve the performance of hash-based collections.
// Relationship between hashCode() and equals()
// The relationship between hashCode() and equals() is crucial for the correct functioning of hash-based collections:

// Consistency: If two objects are equal (a.equals(b) returns true), then a.hashCode() must be the same as b.hashCode().
// Hash-based Collections: Collections like HashMap use hashCode() to determine the bucket where the object will be stored, 
// and equals() to check if objects are equal.
// This helps in achieving constant-time performance for basic operations like add(), remove(), and contains().
// Common Mistakes
// Forgetting to Override hashCode(): When equals() is overridden but hashCode() is not, 
// two equal objects might have different hash codes, leading to incorrect behavior in hash-based collections.
// Inconsistent Implementation: Violating the contract of equals() or hashCode() can lead to unpredictable behavior and hard-to-find bugs.
// Best Practices
// Use Relevant Fields: Ensure the fields used in equals() are also used in hashCode().
// Use Objects.hash(): This utility method helps in creating a well-distributed hash code.
// Immutability: If possible, make objects immutable. This simplifies the implementation of equals() and hashCode() and ensures consistency.
// Example Scenario
// Consider a Person class. If you define equality based on the person's name and age, then equals() would compare these fields. Consequently, hashCode() must also use these fields to generate the hash code.

// Summary
// equals(): Defines logical equality between objects.
// hashCode(): Provides a hash code representation used in hashing mechanisms.
// Contract: If two objects are equal according to equals(), they must have the same hash code.
// Understanding and properly implementing these methods are fundamental to ensuring that objects work correctly in collections and other data structures in Java.

// Suggestions for Next Steps:
// a. Explore how the hashCode() method impacts the performance of HashMap and HashSet.
// b. Study the impact of overriding equals() and hashCode() in complex data structures.

////////////////////////////////

// == Operator
// Purpose: The == operator is used to compare the references (memory addresses) of two objects to see if they point to the same instance in memory.
// Usage:
// For primitive types (e.g., int, char, boolean), == compares the actual values.
// For reference types (e.g., objects), == compares the memory addresses.

// Example with primitives:
// int a = 5;
// int b = 5;
// System.out.println(a == b); // true, because the values are identical

// Example with objects:
// String str1 = new String("Hello");
// String str2 = new String("Hello");
// System.out.println(str1 == str2); // false, because str1 and str2 reference different objects

// equals() Method
// Purpose: The equals() method is used to compare the contents of two objects for logical equality.
// Usage:
// The default implementation of equals() in the Object class checks for reference equality (similar to ==).
// When overridden, it can be customized to compare the data within the objects.

// Example with default equals():
// class MyClass {
//     int value;
//     MyClass(int value) {
//         this.value = value;
//     }
// }

// MyClass obj1 = new MyClass(10);
// MyClass obj2 = new MyClass(10);
// System.out.println(obj1.equals(obj2)); // false, default equals() checks reference equality


// Example with overridden equals():
// class MyClass {
//     int value;
//     MyClass(int value) {
//         this.value = value;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj) return true;
//         if (obj == null || getClass() != obj.getClass()) return false;
//         MyClass myClass = (MyClass) obj;
//         return value == myClass.value;
//     }
// }

// MyClass obj1 = new MyClass(10);
// MyClass obj2 = new MyClass(10);
// System.out.println(obj1.equals(obj2)); // true, as equals() is overridden to compare the value field

// Key Differences
// Comparison Type:

// ==: Compares memory addresses for objects; compares actual values for primitives.
// equals(): Compares the actual content/data of the objects when overridden.
// Default Behavior:

// ==: Always compares references for objects.
// equals(): Default behavior in Object class compares references; can be overridden to compare data.
// Use Cases:

// Use == for:
// Comparing primitive types.
// Checking if two references point to the same object instance.

// Use equals() for:
// Comparing the logical equality of two objects based on their data/content.
// Summary
// ==: Checks if two references point to the same object (reference equality).
// equals(): Checks if two objects are logically equal, 
// based on their data/content (must be overridden for meaningful comparison).
// Understanding the difference between == and equals() is fundamental in Java, 
// especially when working with objects and collections.

// Suggestions for Next Steps:
// a. Explore how == and equals() are used in different Java collection classes.
// b. Implement examples where overriding equals() is crucial for the correct functioning of HashSet and HashMap.



}
