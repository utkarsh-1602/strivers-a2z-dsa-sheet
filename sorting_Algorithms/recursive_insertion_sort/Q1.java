package sorting_Algorithms.recursive_insertion_sort;
/*
    Name : Recursive Insertion Sort Algorithm

    Problem Statement: Given an array of N integers, write a program to implement the Recursive Insertion Sort algorithm.

    Example 1:
    Input: N = 6, array[] = {13,46,24,52,20,9}
    Output: 9,13,20,24,46,52
    Explanation: After sorting the array is: 9, 13, 20, 24, 46, 52

    Example 2:
    Input: N=5, array[] = {5,4,3,2,1}
    Output: 1,2,3,4,5
    Explanation: After sorting the array is: 1, 2, 3, 4, 5


    Time Complexity: O(N^2), If we carefully observe, we can notice that the recursion call will occur for n times, and for each i, inside the recursive function, the loop j runs from i to 1 i.e. i times. For, i = 1, the loop runs 1 time, for i = 2, the loop runs 2 times, and so on. So, the total steps will be approximately the following: 1 + 2 + 3 +……+ (n-2) + (n-1). The summation is approximately the sum of the first n natural numbers i.e. (n*(n+1))/2. The precise time complexity will be O(n2/2 + n/2). Previously, we have learned that we can ignore the lower values as well as the constant coefficients. So, the time complexity is O(n2). Here the value of n is N i.e. the size of the array.


    Space Complexity: O(N), Each recursive call to the recursiveInsertionSort function consumes space on the call stack. Since the function is called recursively n times (where n is the size of the array), the maximum depth of the call stack is n. This means that the space complexity of this recursive implementation is O(n), where n is the number of elements in the array.


    Reference: https://takeuforward.org/arrays/recursive-insertion-sort-algorithm/
 */


public class Q1 {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void recursiveInsertionSort(int[] arr, int i, int n){

        if(i == n) return; 

        int j = i;
        while(j>0 && arr[j-1] > arr[j]){
            swap(arr, j-1, j);
            j--;
        }

        recursiveInsertionSort(arr, i+1, n);
    }


    public static void main(String[] args) {
        
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;

        recursiveInsertionSort(arr, 0, n);

        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }  
}
