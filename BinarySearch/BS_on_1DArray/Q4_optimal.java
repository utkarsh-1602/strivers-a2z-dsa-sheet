package BinarySearch.BS_on_1DArray;

/*
    Name : Search Insert Position

    Problem Statement: You are given a sorted array arr of distinct values and a target value x. You need to search for the index of the target value in the array.
    If the value is present in the array, then return its index. Otherwise, determine the index where it would be inserted in the array while maintaining the sorted order.


    Example 1:
    Input Format: arr[] = {1,2,4,7}, x = 6
    Result: 3
    Explanation: 6 is not present in the array. So, if we will insert 6 in the 3rd index(0-based indexing), the array will still be sorted. {1,2,4,6,7}.

    Example 2:
    Input Format: arr[] = {1,2,4,7}, x = 2
    Result: 1
    Explanation: 2 is present in the array and so we will return its index i.e. 1.

    Approach : optimal  

    Time Complexity: (logN), where N = size of the given array.
    Reason: We are basically using the Binary Search algorithm.

    Space Complexity: O(1) as we are using no extra space.

    Reference: https://takeuforward.org/arrays/search-insert-position/

 */


public class Q4_optimal {

    static int searchInsertPosition(int[] arr, int x){

        int n = arr.length; 
        int start = 0;
        int result = n; 
        int end = n - 1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(arr[mid] < x){
                start = mid + 1;
            }

            if(arr[mid] >= x){
                result = mid; 
                end = mid - 1;
            }

        }

        return result;

    }

    public static void main(String[] args) {
        
        int[] arr ={1,2,4,7}; 
        int x = 6;

        System.out.println(searchInsertPosition(arr, x));
    }   
}
