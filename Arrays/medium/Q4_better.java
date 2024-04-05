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

    Approach : better 
 
    Time Complexity: O(N*2), If large test cases, it will throw TLE error
    Space Complexity: O(1)

    Reference: https://takeuforward.org/data-structure/kadanes-algorithm-maximum-subarray-sum-in-an-array/


 */


package medium;

public class Q4_better{

    static int kadanesAlgorithm(int[] arr){

        if(arr.length == 0) return -1; 

        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = i; j < arr.length; j++){
                sum += arr[j];
                max = Math.max(max, sum);
            }    
        }

        return max;

    }

    public static void main(String[] args) {
        
        int[] arr = {-7, -8, -16, -4, -8, -5, -7, -11, -10, -12, -4, -6, -4, -16, -10};
        int ans = kadanesAlgorithm(arr);

        System.out.println(ans);
    }
}