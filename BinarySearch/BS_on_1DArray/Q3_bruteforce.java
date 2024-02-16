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

    Approach : bruteforce  

    Time Complexity:  O(N), where N = size of the given array.
    Reason: In the worst case, we have to travel the whole array. This is basically the time complexity of the linear search algorithm.

    Space Complexity: O(1), as we are not using any extra space

    Reference: https://takeuforward.org/arrays/implement-upper-bound/

 */


public class Q3_bruteforce {

    static int upperBound(int[] arr, int x){

        int n = arr.length;

        for(int i = 0; i < n; i++){
            if(arr[i] > x) return i; 
        }

        return n; 
    }

    public static void main(String[] args) {
        
        int[] arr ={1,2,2,3}; 
        int x = 2;

        System.out.println(upperBound(arr, x));
    }   
}
