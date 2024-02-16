# Concepts used in this Section (Binary Search in 1D Arrays)

### What is Lower Bound?
- The lower bound algorithm finds the first or the smallest index in a sorted array where the value at that index is greater than or equal to a given key i.e. x.
- The lower bound is the smallest index, ind, where arr[ind] >= x.
- But if any such index is not found, the lower bound algorithm returns n i.e. size of the given array.

### What is Upper Bound?
- The upper bound algorithm finds the first or the smallest index in a sorted array where the value at that index is greater than the given key i.e. x.
- The upper bound is the smallest index, ind, where arr[ind] > x.
- But if any such index is not found, the upper bound algorithm returns n i.e. size of the given array. 
- The main difference between the lower and upper bound is in the condition. For the lower bound the condition was arr[ind] >= x and here, in the case of the upper bound, it is arr[ind] > x.


