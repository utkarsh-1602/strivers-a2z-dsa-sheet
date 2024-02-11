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

    Approach: optimal (The best case occurs if the given array is already sorted. We can reduce the time complexity to O(N) by just adding a small check inside the loops.)

    Time Complexity: O(N) only if the array is sorted
    Space Complexity: O(1)

    Reference: https://takeuforward.org/data-structure/bubble-sort-algorithm/

 */

public class Q1_optimal {

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void bubbleSort(int[] arr){
        int n = arr.length;
        boolean swapped;

        for(int i = 0; i < n-1; i++){

            swapped = false;

            for(int j=i+1; j < n; j++){
                if(arr[i] > arr[j]){
                    swap(arr, i, j);
                    swapped = true;
                }
            }


            // If no swaps are made in this pass, the array is already sorted
            if (!swapped) {
                break;
            }
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        
        
    }

    public static void main(String[] args) {
        
        int[] arr = {9, 13, 20, 24, 46, 52};
        bubbleSort(arr);

    }      
}
