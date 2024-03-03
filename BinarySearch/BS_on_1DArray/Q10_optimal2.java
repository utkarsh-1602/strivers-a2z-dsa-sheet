package BinarySearch.BS_on_1DArray;

/*
    Name : Minimum in Rotated Sorted Array

    Problem Statement: Given an integer array arr of size N, sorted in ascending order (with distinct values). Now the array is rotated between 1 to N times which is unknown. Find the minimum element in the array. 

    Example 1:
    Input Format: arr = [4,5,6,7,0,1,2,3]
    Result: 0
    Explanation: Here, the element 0 is the minimum element in the array.

    Example 2:
    Input Format: arr = [3,4,5,1,2]
    Result: 1
    Explanation: Here, the element 1 is the minimum element in the array.

    Approach : optimal  

    Time Complexity: O(logN), N = size of the given array. 
    Space Complexity: O(1), as we are not using any extra space.

    Reference: https://takeuforward.org/data-structure/minimum-in-rotated-sorted-array/

 */

public class Q10_optimal2 {

    static void binarySearch(int[] arr){

        int start = 0;
        int end = arr.length - 1;
        int ans = Integer.MAX_VALUE;

        while(start <= end){

            int mid = start + (end - start) / 2;

            // whole array is sorted
            if(arr[start] <= arr[end]){
                ans = Math.min(ans, arr[start]);
                break;
            }

            if(arr[start] <= arr[mid]){
                ans = Math.min(ans, arr[start]);
                start = mid + 1; 
            }            

            else if (arr[mid] <= arr[end]){
                ans = Math.min(ans, arr[mid]);
                end = mid - 1;
            }

        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        
        int[] arr = {4,5,6,7,0,1,2,3};
        binarySearch(arr);

    }    
}
