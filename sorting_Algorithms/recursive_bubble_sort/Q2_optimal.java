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

    Approach: Optimal (Only use if the array is sorted)

    Time complexity: O(N), only if the array is already sorted
    Space Complexity: O(N)
    
    Reference: https://takeuforward.org/arrays/recursive-bubble-sort-algorithm/

 */


public class Q2_optimal{

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static void recursiveBubbleSort(int[] arr, int n){

        if(n==1) return;

        int didSwap = 0;

        for(int i=0; i<=n-2; i++){
            if(arr[i] > arr[i+1]){
                swap(arr, i, i+1);
                didSwap = 1;                
            }
        }

        if(didSwap == 0) return;

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