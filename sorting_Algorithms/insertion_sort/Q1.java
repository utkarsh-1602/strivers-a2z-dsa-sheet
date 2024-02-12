package sorting_Algorithms.insertion_sort;

/*
    Name : Insertion Sort Algorithm

    Problem Statement: Given an array of N integers, write a program to implement the Insertion sorting algorithm.

    Example 1:
    Input: N = 6, array[] = {13,46,24,52,20,9}
    Output: 9,13,20,24,46,52
    Explanation: After sorting the array is: 9, 13, 20, 24, 46, 52

    Example 2:
    Input: N=5, array[] = {5,4,3,2,1}
    Output: 1,2,3,4,5
    Explanation: After sorting the array is: 1, 2, 3, 4, 5


    Time Complexity: O(N^2)
    Space Complexity: (1)

    Reference: https://takeuforward.org/data-structure/insertion-sort-algorithm/

 */

public class Q1 {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static void insertionSort(int[] arr){
        
        int n = arr.length;

        for(int i=0; i<n; i++){
            int j=i;
            while(j>0 && arr[j-1] > arr[j]){
                swap(arr, j-1, j);
                j--;
            }            
        }


        // print the sorted array
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        
        int[] arr = {13, 46, 24, 52, 20, 9};
        insertionSort(arr);

    }  
}


