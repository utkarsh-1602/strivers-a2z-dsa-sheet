package BinarySearch.BS_on_1DArray;

/*
    Name : Search Element in a Rotated Sorted Array

    Problem Statement: Given an integer array arr of size N, sorted in ascending order (with distinct values) and a target value k. Now the array is rotated at some pivot point unknown to you. Find the index at which k is present and if k is not present return -1.

    Example 1:
    Input Format: arr = [4,5,6,7,0,1,2,3], k = 0
    Result: 4
    Explanation: Here, the target is 0. We can see that 0 is present in the given rotated sorted array, nums. Thus, we get output as 4, which is the index at which 0 is present in the array.

    Example 2:
    Input Format: arr = [4,5,6,7,0,1,2], k = 3
    Result: -1
    Explanation: Here, the target is 3. Since 3 is not present in the given rotated sorted array. Thus, we get the output as -1.

    Approach : optimal  

    Time Complexity:  O(logN), where N = size of the given array.
    Reason: We are basically using the binary search algorithm.

    Space Complexity: O(1) as we are using no extra space.

    Reference: https://takeuforward.org/data-structure/search-element-in-a-rotated-sorted-array/

 */


public class Q8_optimal {
    
    static int searchElementInSortedArray(int[] arr, int k){

        int start = 0;
        int end = arr.length-1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(arr[mid] == k){
                return mid;
            }

            if(arr[start] <= arr[mid]){

                if(arr[start] <= k && k <= arr[mid]){
                    end = mid-1;
                } 
                else{
                    start = mid+1;
                }
            }
            else{
                if(arr[mid] <= k && k <= arr[end]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        
        int[] arr = {4,5,6,7,0,1,2,3};
        int k = 0;

        System.out.println(searchElementInSortedArray(arr, k));

    }
}
