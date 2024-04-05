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

    Approach : optimal 

    The intuition of the algorithm is not to consider the subarray as a part of the answer if its sum is less than 0. A subarray with a sum less than 0 will always reduce our answer and so this type of subarray cannot be a part of the subarray with maximum sum.

    Here, we will iterate the given array with a single loop and while iterating we will add the elements in a sum variable. Now, if at any point the sum becomes less than 0, we will set the sum as 0 as we are not going to consider any subarray with a negative sum. Among all the sums calculated, we will consider the maximum one.

    Thus we can solve this problem with a single loop.

 
    Time Complexity: O(N)
    Space Complexity: O(1)

    Reference: https://takeuforward.org/data-structure/kadanes-algorithm-maximum-subarray-sum-in-an-array/


 */


package medium;

public class Q4_optimal{

    static int kadanesAlgorithm(int[] arr){

        if(arr.length == 0) return -1; 
        int sum = 0;
        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            max = sum > max ? sum : max;
            if(sum < 0) sum = 0;
        }

        return max;

        // to reduce time complexity, use ternary operator instead of if-else statement

    }

    public static void main(String[] args) {
        
        int[] arr = {-2, -1, -1};
        int ans = kadanesAlgorithm(arr);

        System.out.println(ans);
    }
}