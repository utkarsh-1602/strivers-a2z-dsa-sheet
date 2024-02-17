package BinarySearch.BS_on_1DArray;

/*
    Name : Search Element in Rotated Sorted Array II

    Problem Statement: Given an integer array arr of size N, sorted in ascending order (may contain duplicate values) and a target value k. Now the array is rotated at some pivot point unknown to you. Return True if k is present and otherwise, return False. 

    Example 1:
    Input Format: arr = [7, 8, 1, 2, 3, 3, 3, 4, 5, 6], k = 3
    Result: True
    Explanation: The element 3 is present in the array. So, the answer is True.

    Example 2:
    Input Format: arr = [7, 8, 1, 2, 3, 3, 3, 4, 5, 6], k = 10
    Result: False
    Explanation: The element 10 is not present in the array. So, the answer is False.

    Approach : optimal  

    Time Complexity:  O(logN), where N = size of the given array.
    Reason: We are basically using the binary search algorithm.

    Space Complexity: O(1) as we are using no extra space.

    Reference: https://takeuforward.org/data-structure/count-occurrences-in-sorted-array/

 */


public class Q9_optimal {
    
    static boolean searchInRotatedSortedArray(int[] arr, int k){

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(arr[mid] == k){
                return true;
            }

            if(arr[start] == arr[mid] && arr[mid] == arr[end]){

                start = start + 1;
                end = end - 1;
                continue;

            }

            //if left part is sorted:
            if(arr[start] <= arr[mid]){

                if(arr[start] <= k && k <= arr[mid]){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }

            } else{ // if right part is sorted 

                if(arr[mid] <= k && k <= arr[end]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }

        }

        return false;
    }

    public static void main(String[] args) {
        
        int[] arr = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int k = 3;

        System.out.println(searchInRotatedSortedArray(arr, k));
    }
}
