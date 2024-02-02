# Concepts used in this section 

### Arrays.sort()
Arrays. sort uses dual-pivot Quicksort on primitives. It offers O(n log(n)) performance and is typically faster than traditional (one-pivot) Quicksort implementations. However, it uses a stable, adaptive, iterative implementation of mergesort algorithm for Array of Objects.

### HashSet 
- Java HashSet class implements the Set interface, backed by a hash table which is actually a HashMap instance.
- The underlying data structure for HashSet is Hashtable.
- As it implements the Set Interface, duplicate values are not allowed.
- Objects that you insert in HashSet are not guaranteed to be inserted in the same order. Objects are inserted based on their hash code.
- NULL elements are allowed in HashSet