package BinarySearch.BS_on_1DArray;

/*
    Name : Binary Search 

    Problem Statement: You are given a sorted array of integers and a target, your task is to search for the target in the given array. Assume the given array does not contain any duplicate numbers.

    Input: arr = {3, 4, 6, 7, 9, 12, 16, 17}, target = 6 

    Output: 2 

    Explanation: 6 is at index 2 

    Approach : Iterative 

    Time Complexity: O(logN), where N = size of the given array.
    In the algorithm, in every step, we are basically dividing the search space into 2 equal halves. This is actually equivalent to dividing the size of the array by 2, every time. After a certain number of divisions, the size will reduce to such an extent that we will not be able to divide that anymore and the process will stop. The number of total divisions will be equal to the time complexity.
        If a number n can be divided by 2 for x times:
        2^x = n
        Therefore, x = logn (base is 2)


    Space Complexity: O(1)

    Reference: https://takeuforward.org/data-structure/set-matrix-zero/


 */


public class Q1 {

    static int binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

            int mid = start + (end-start) / 2;

            if(arr[mid] == target) return mid;

            if(arr[mid] > target){
                end = mid - 1;
            }

            if(arr[mid] < target){
                start = mid + 1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        
        int[] arr = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;

        System.out.println  (binarySearch(arr, target));

    }    
}
