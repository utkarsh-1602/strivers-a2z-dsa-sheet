package sorting_Algorithms.recursive_bubble_sort;

/*
    Name : Recursive Bubble Sort Algorithm

    Problem Statement: Given an array of N integers, write a program to implement the Recursive Bubble Sort algorithm.

    Example 1:
    Input: N = 6, array[] = {13,46,24,52,20,9}
    Output: 9,13,20,24,46,52
    Explanation: After sorting the array is: 9, 13, 20, 24, 46, 52

    Example 2:
    Input: N=5, array[] = {5,4,3,2,1}
    Output: 1,2,3,4,5
    Explanation: After sorting the array is: 1, 2, 3, 4, 5

    Approach: bruteforce

    Time complexity: O(N^2), 
    If we carefully observe, we can notice that the recursion call, is occurring for n times, and for each recursion call, the loop j runs from 0 to n-2. For, the range of size n, the inner loop runs n-1 times, for the range of size n-1, the inner loop runs n-2 times, and so on. So, the total steps will be approximately the following: (n-1) + (n-2) + (n-3) + ……..+ 3 + 2 + 1. The summation is approximately the sum of the first n natural numbers i.e. (n*(n+1))/2. The precise time complexity will be O(n2/2 + n/2). Previously, we have learned that we can ignore the lower values as well as the constant coefficients. So, the time complexity is O(n2). Here the value of n is N i.e. the size of the array

    Space Complexity: O(N), Each recursive call to the bubble_sort function consumes space on the call stack. Since the function is called recursively n times (where n is the size of the array), the maximum depth of the call stack is n. This means that the space complexity of this recursive implementation is O(n), where n is the number of elements in the array.

    Reference: https://takeuforward.org/arrays/recursive-bubble-sort-algorithm/

 */

public class Q1_bruteforce {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static void recursiveBubbleSort(int[] arr, int n){

        if(n==1) return;

        for(int i=0; i<=n-2; i++){
            if(arr[i] > arr[i+1]){
                swap(arr, i, i+1);                
            }
        }

        recursiveBubbleSort(arr, n-1);
    }

    public static void main(String[] args) {
        
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;

        recursiveBubbleSort(arr, n);

        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }  

}
