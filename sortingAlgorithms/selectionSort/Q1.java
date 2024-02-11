package sortingAlgorithms.selectionSort;

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

    Time Complexity:  O(N2), (where N = size of the array), for the best, worst, and average cases.
    Space Complexity:  O(1), as we are not using any extra space 

    Reference: https://takeuforward.org/sorting/selection-sort-algorithm/

 */


public class Q1 {

    static void selection_sort(int[] arr){
    
        int n = arr.length;

        for(int i=0; i<arr.length; i++){

            int min = i;

            for(int j=i+1; j<n; j++){

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
        selection_sort(arr);
    }

}
