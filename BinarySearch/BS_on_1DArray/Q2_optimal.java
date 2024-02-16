package BinarySearch.BS_on_1DArray;

/*
    Name : Implement Lower Bound

    Problem Statement: Given a sorted array of N integers and an integer x, write a program to find the lower bound of x.

    Example 1:
    Input Format: N = 4, arr[] = {1,2,2,3}, x = 2
    Result: 1
    Explanation: Index 1 is the smallest index such that arr[1] >= x.

    Example 2:
    Input Format: N = 5, arr[] = {3,5,8,15,19}, x = 9
    Result: 3
    Explanation: Index 3 is the smallest index such that arr[3] >= x.

    Approach : optimal  

    Time Complexity: O(logN), where N = size of the given array.
    Reason: We are basically using the Binary Search algorithm.

    Space Complexity: O(1) as we are using no extra space.

    Reference: https://takeuforward.org/arrays/implement-lower-bound-bs-2/

 */

public class Q2_optimal{

    static int lowerBound(int[] arr, int x){
        int n = arr.length;
        int result = -1;

        int start = 0;
        int end = n - 1;

        while(start <= end){

            int mid = start + (end - start) / 2;
            
            if(arr[mid] >= x){
                result = mid;
                end = mid-1;
            }

            if(arr[mid] < x){
                start = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        
        int[] arr = {3,5,8,15,19};
        int x = 17;

        System.out.println(lowerBound(arr, x));

    }
}