package Teori;

public class ArrayList {
// ArrayList
// ArrayList is a class that implements the List interface and uses a dynamic array to store the elements. 
// It is part of the Java Collections Framework and provides a resizable array, 
// which means that it can grow or shrink in size as needed.

// Characteristics of ArrayList:
// Resizable Array: Internally uses a dynamic array to store elements.
// Random Access: Provides fast random access to elements, 
// with constant-time complexity for retrieval operations (get and set).
// Performance:
// Fast Access: Provides constant-time performance for basic operations such as adding an element (add) 
// and accessing an element (get).
// Resize Cost: Resizing the internal array (which happens when the capacity is exceeded) can be costly @
// as it involves creating a new array and copying elements from the old array to the new one.
// Not Synchronized: ArrayList is not synchronized, 
// meaning it is not thread-safe for concurrent modifications by multiple threads without external synchronization.

// Common Methods in ArrayList:
// ArrayList inherits all the methods from the List interface and does not add any new methods of its own. 
// However, it optimizes certain methods to take advantage of the array structure.

/////////////////////////////////////////////////

//Key Differences Between List and ArrayList
// Type:
// List is an interface.
// ArrayList is a concrete class that implements the List interface.

// Implementation:
// List provides a general contract for a sequence of elements.
// ArrayList provides a specific implementation using a dynamic array.

// Flexibility:
// List can be implemented by multiple classes (ArrayList, LinkedList, Vector), allowing you to choose the implementation that best suits your needs.
// ArrayList is a specific implementation with its own performance characteristics.

// Performance:
// ArrayList provides constant-time access to elements, but resizing the array can be costly.
// The performance characteristics of List depend on the specific implementation used.

// Thread Safety:
// ArrayList is not synchronized and therefore not thread-safe.
// There are thread-safe implementations of List, such as Vector or Collections.synchronizedList(new ArrayList<>()).
}
