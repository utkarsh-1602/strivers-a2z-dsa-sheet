/*
    Kadane's Algorithm : Maximum Subarray Sum in an Array

    Problem Statement : Given an integer array arr, find the contiguous subarray (containing at least one number) which has the largest sum and returns its sum and prints the subarray.

    Example 1:
    Input: arr = [-2,1,-3,4,-1,2,1,-5,4] 
    Output: 6 
    Explanation:
    [4,-1,2,1] has the largest sum = 6. 

    Examples 2:
    Input: arr = [1] 
    Output: 1 
    Explanation:
    Array has only one element and which is giving positive sum of 1. 

    Approach : bruteforce 

    Time Complexity: 
    Space Complexity:

    Reference: https://takeuforward.org/data-structure/kadanes-algorithm-maximum-subarray-sum-in-an-array/


 */


package medium;

import java.util.Arrays;

public class Q4_bruteforce{

    static int[] kadanesAlgorithm(int[] arr){



    }

    public static void main(String[] args) {
        
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int[] ans = kadanesAlgorithm(arr);

        System.out.println(Arrays.toString(ans));
    }
}