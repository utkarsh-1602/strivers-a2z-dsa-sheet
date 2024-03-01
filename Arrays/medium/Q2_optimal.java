/*
    Name : Sort an array of 0s, 1s and 2s

    Problem Statement: Given an array consisting of only 0s, 1s, and 2s. Write a program to in-place sort the array without using inbuilt sort functions. ( Expected: Single pass-O(N) and constant space)

    Input: nums = [2,0,2,1,1,0]
    Output: [0,0,1,1,2,2]

    Input: nums = [2,0,1]
    Output: [0,1,2]

    Input: nums = [0]
    Output: [0]

    Approach : Optimal 

    Time Complexity: O(N), where N = size of the given array.
    Reason: We are using a single loop that can run at most N times.

    Space Complexity: O(1) as we are not using any extra space.

    Reference: https://takeuforward.org/data-structure/sort-an-array-of-0s-1s-and-2s/


 */


package medium;

import java.util.Arrays;

public class Q2_optimal {

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortingArray(int[] arr){

        int n = arr.length;
        int low = 0, mid = 0, high = n-1; 

        while(mid < high){

            if(arr[mid] == 2){
                swap(arr, mid, high);
                high--;

            }

            else if(arr[mid] == 0){
                swap(arr, mid, low);
                mid++;
                low++;
            }

            else if(arr[mid] == 1){
                mid++;
            }

        }

        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        
        int[] arr = {2,0,2,1,1,0};
        sortingArray(arr);

    }
    
}
