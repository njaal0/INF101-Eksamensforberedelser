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
}
