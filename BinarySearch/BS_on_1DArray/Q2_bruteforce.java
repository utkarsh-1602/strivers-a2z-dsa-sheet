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

    Approach : bruteforce (using linear search)

    Time Complexity: O(N)

    Space Complexity: O(1) as we are using no extra space.

    Reference: https://takeuforward.org/arrays/implement-lower-bound-bs-2/

 */

public class Q2_bruteforce{

    static int lowerBound(int[] arr, int x){

        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= x){
                return i;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        
        int[] arr = {3,5,8,15,19};
        int x = 17;

        System.out.println(lowerBound(arr, x));

    }
}