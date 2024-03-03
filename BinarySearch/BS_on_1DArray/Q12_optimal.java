package BinarySearch.BS_on_1DArray;

/*
    Name : Search Single Element in a sorted array

    Problem Statement: Given an array of N integers. Every number in the array except one appears twice. Find the single number in the array.

    Example 1:
    Input Format: arr[] = {1,1,2,2,3,3,4,5,5,6,6}
    Result: 4
    Explanation: Only the number 4 appears once in the array.

    Example 2:

    Input Format: arr[] = {1,1,3,5,5}
    Result: 3
    Explanation: Only the number 3 appears once in the array.

    Approach : optimal  

    Time Complexity: O(logN), N = size of the given array.
    Reason: We are basically using the Binary Search algorithm.

    Space Complexity: O(1) as we are not using any extra space.

    Reason: We have not used any extra data structures, this makes space complexity, even in the worst case as O(1).

    Reference: https://takeuforward.org/data-structure/search-single-element-in-a-sorted-array/

 */

public class Q12_optimal {

    static int searchSingleElementInArray(int[] arr){

        int n = arr.length;

        if(n == 1) return arr[0];

        if(arr[0] != arr[1]){
            return arr[0];
        }

        if(arr[n-1] != arr[n-2]) return arr[n-1];

        int start = 1;
        int end = n - 2;

        while(start <= end){

            int mid = start + (end - start) / 2;

            // check if mid is the single element 
            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]){
                return arr[mid];
            }

            // if pattern is (even, odd) then we are in the left half
            if(mid % 2 == 0 && arr[mid] == arr[mid+1] || mid % 2 == 1 && arr[mid] == arr[mid-1]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }

        }


        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1,1,2,2,3,3,4,5,5,6,6};
        int ans = searchSingleElementInArray(arr);
        System.out.println(ans);
    }   
}
