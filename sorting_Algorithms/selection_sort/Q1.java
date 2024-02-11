package sorting_Algorithms.selection_sort;

import java.util.Arrays;

/*
    Name : Selection Sort Algorithm

    Problem Statement: Given an array of N integers, write a program to implement the Selection sorting algorithm.

    Example 1:
    Input: N = 6, array[] = {13,46,24,52,20,9}
    Output: 9,13,20,24,46,52
    Explanation: After sorting the array is: 9, 13, 20, 24, 46, 52

    Example 2:
    Input: N=5, array[] = {5,4,3,2,1}
    Output: 1,2,3,4,5
    Explanation: After sorting the array is: 1, 2, 3, 4, 5

    Time Complexity:  O(N^2), (where N = size of the array), for the best, worst, and average cases.
    Space Complexity:  O(1), as we are not using any extra space 

    Reference: https://takeuforward.org/sorting/selection-sort-algorithm/

 */


public class Q1 {

    static void selectionSort(int[] arr){
    
        int n = arr.length;

        // traversing the array
        for(int i=0; i<arr.length; i++){

            // for the first time, getting the 0th index as min, in future we will store the index of minimum element in min variable
            int min = i;

            for(int j=i+1; j<n; j++){ // for every index we are checking if that element is smaller or greater than others elements, and if greater we will swap it with smaller element to sort the array 

                if(arr[j] < arr[min]){  
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String args[]) {

        int[] arr = {13, 46, 24, 52, 20, 9};
        selectionSort(arr);
    }

}
