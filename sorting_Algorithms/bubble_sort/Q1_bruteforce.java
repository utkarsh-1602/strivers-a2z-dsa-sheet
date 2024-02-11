package sorting_Algorithms.bubble_sort;

/*
    Name : Bubble Sort Algorithm

    Problem Statement: Given an array of N integers, write a program to implement the Bubble Sorting algorithm.

    Example 1:
    Input: N = 6, array[] = {13,46,24,52,20,9}
    Output: 9,13,20,24,46,52
    Explanation: After sorting the array is: 9, 13, 20, 24, 46, 52

    Example 2:
    Input: N=5, array[] = {5,4,3,2,1}
    Output: 1,2,3,4,5
    Explanation: After sorting the array is: 1, 2, 3, 4, 5

    Approach: bruteforce

    Time Complexity: O(N^2)
    Space Complexity: O(1)

    Reference: https://takeuforward.org/data-structure/bubble-sort-algorithm/

 */

public class Q1_bruteforce {

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void bubbleSort(int[] arr){

        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            for(int j=i+1; j < n; j++){
                if(arr[i] > arr[j]){
                    swap(arr, i, j);
                }
            }
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        
        int[] arr = {13, 46, 24, 52, 20, 9};
        bubbleSort(arr);

    }   
}
