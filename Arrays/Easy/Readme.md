# Concepts used in this section 

### Arrays.sort()
Arrays. sort uses dual-pivot Quicksort on primitives. It offers O(n log(n)) performance and is typically faster than traditional (one-pivot) Quicksort implementations. However, it uses a stable, adaptive, iterative implementation of mergesort algorithm for Array of Objects.

### HashSet 
- Java HashSet class implements the Set interface, backed by a hash table which is actually a HashMap instance.
- The underlying data structure for HashSet is Hashtable.
- As it implements the Set Interface, duplicate values are not allowed.
- Objects that you insert in HashSet are not guaranteed to be inserted in the same order. Objects are inserted based on their hash code.
- NULL elements are allowed in HashSet

### XOR (exclusive OR)

- XOR, or exclusive OR, is a logical operation that outputs true only when the number of true inputs is odd. 
- In java XOR is often represented using the caret (^) symbol.

- Two important properties of XOR are the following:
    XOR of two same numbers is always 0 i.e. a ^ a = 0. ←Property 1.
    XOR of a number with 0 will result in the number itself i.e. 0 ^ a = a.  ←Property 2


# Hashmap 
- HashMap in Java stores the data in (Key, Value) pairs, and you can access them by an index of another type (e.g. an Integer). One object is used as a key (index) to another object (value). If you try to insert the duplicate key in HashMap, it will replace the element of the corresponding key.
`HashMap<String, Integer> map = new HashMap<>(); `