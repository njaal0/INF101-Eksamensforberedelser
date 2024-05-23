package Teori;

public class Iterator {
// Iterator
// The Iterator interface provides methods to iterate over a collection of objects. 
// It is a more detailed mechanism for traversing elements in a collection, 
// allowing you to check if more elements are available and to retrieve or remove elements from the collection.

// Characteristics of Iterator:
// Methods: The Iterator interface defines three methods:
// boolean hasNext(): Returns true if there are more elements to iterate over.
// T next(): Returns the next element in the iteration.
// default void remove(): Removes the last element returned by the iterator (optional operation).
// Single Pass: An Iterator is typically used for a single pass through the collection. 
// Once all elements have been iterated, a new Iterator must be obtained to iterate again.
// Fail-Fast: Most collection iterators are fail-fast, 
// meaning they throw a ConcurrentModificationException if the collection is modified during iteration 
// (except through the iterator's own remove method).

// Conclusion
// Understanding both Iterable and Iterator is essential for effectively traversing collections in Java. 
// Iterable provides a higher-level abstraction that enables the use of the enhanced for-loop, 
// while Iterator offers a more detailed mechanism for iterating, checking for remaining elements, 
// and optionally removing elements. 
// Choosing between them depends on the level of control needed during iteration and the specific use case.
}
