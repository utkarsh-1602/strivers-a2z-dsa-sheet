package sorting_Algorithms.heap_sort;

/*
    Name : Heap Sort Algorithm

    Problem Statement: Given an array of N integers, write a program to implement the Heap Sort algorithm.

    Example 1:
    Input: N = 6, array[] = {13,46,24,52,20,9}
    Output: 9,13,20,24,46,52
    Explanation: After sorting the array is: 9, 13, 20, 24, 46, 52

    Example 2:
    Input: N=5, array[] = {5,4,3,2,1}
    Output: 1,2,3,4,5
    Explanation: After sorting the array is: 1, 2, 3, 4, 5

    Approach: Optimal 

    1. build a complete binary tree from the given array
    2. trasform that tree into max heap 
    3. swap the root node with the last leaf node, and then again convert the tree into min heap, and do this process recursively 
    4. return the sorted array 

    Time complexity: O(NLogN)
    The time complexity of heap sort is O(n logn) in all three cases (best case, average case, and worst case).
    
    Space Complexity: O(1)
    
    Reference: https://www.geeksforgeeks.org/heap-sort/

 */


public class Q1 {


    // using heapify function, we are making the max heap 
    static void heapify(int[] arr, int n, int i){

         // Initialize largest as root  
        int largest = i;

        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if(left < n && arr[left] > arr[largest]){
            largest = left;
        }

        if(right < n && arr[right] > arr[largest]){
            largest = right;
        }

        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }



    }

    static void heapSort(int[] arr){

        // For the array {13, 46, 24, 52, 20, 9}, the binary tree would look like this:

        /* 

                 13
                /  \
               46   24
              / \   /
            52  20  9

        */

        // This tree represents the initial state of the array before performing the max heap transformation. It's worth noting that the binary tree's elements are arranged in the array in level-order traversal.

        int n = arr.length;

        // By starting the loop at n / 2 - 1, we're essentially starting from the last non-leaf node in the heap
        // This is because elements beyond n / 2 - 1 are leaf nodes, and they don't have any children to heapify.
        for(int i = n/2-1; i>=0; i--){
            heapify(arr, n, i); 
        }


        // max heap 
        /* 

                 52
                /  \
               46   24
              / \   /
            13  20  9

        */


        // after getting the max heap 
        // we will extract the elements one by one from the heap 

        for(int i=n-1; i>=0; i--){
            // Move current root element to end  
            // swap a[0] with a[i]
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // after swapping, we got the last element at the root, so because of that we need to again make it max heap using heapify()
            heapify(arr, i, 0);
        }

    }


    public static void main(String[] args) {
        
        int arr[] = {13,46,24,52,20,9};

        heapSort(arr); 

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
