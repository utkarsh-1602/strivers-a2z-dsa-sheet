package BinarySearch.BS_on_1DArray;

/*
    Name : Implement Upper Bound

    Problem Statement: Given a sorted array of N integers and an integer x, write a program to find the upper bound of x.

    Example 1:
    Input Format: N = 4, arr[] = {1,2,2,3}, x = 2
    Result: 3
    Explanation: Index 3 is the smallest index such that arr[3] > x.

    Example 2:
    Input Format: N = 6, arr[] = {3,5,8,9,15,19}, x = 9
    Result: 4
    Explanation: Index 4 is the smallest index such that arr[4] > x.

    Approach : optimal  

    Time Complexity: O(logN), where N = size of the given array.
    Reason: We are basically using the Binary Search algorithm.

    Space Complexity: O(1) as we are using no extra space.

    Reference: https://takeuforward.org/arrays/implement-upper-bound/

 */


public class Q3_optimal {

    static int upperBound(int[] arr, int x){

        int n = arr.length; 
        int start = 0;
        int end = n - 1;
        int result = n;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(arr[mid] > x){
                result = mid;
                end = mid - 1;
            }

            if(arr[mid] <= x){
                start = mid + 1;
            }

        }

        return result; 

    }

    public static void main(String[] args) {
        
        int[] arr ={1,2,2,3}; 
        int x = 2;

        System.out.println(upperBound(arr, x));
    }   
}
