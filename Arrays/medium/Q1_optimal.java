/*
    Name : 2Sum

    Problem Statement: Given an array of integers arr[] and an integer target.
        1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.
        2nd variant: Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1}.
        Note: You are not allowed to use the same element twice. Example: If the target is equal to 6 and num[1] = 3, then nums[1] + nums[1] = target is not a solution.

    Example 1:
    Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 14
    Result: YES (for 1st variant)
        [1, 3] (for 2nd variant)
    Explanation: arr[1] + arr[3] = 14. So, the answer is “YES” for the first variant and [1, 3] for 2nd variant.

    Example 2:
    Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 15
    Result: NO (for 1st variant)
        [-1, -1] (for 2nd variant)
    Explanation: There exist no such two numbers whose sum is equal to the target.

    Approach : Optimal 

    Time Complexity: O(N) + O(N*logN), where N = size of the array.
    Reason: The loop will run at most N times. And sorting the array will take N*logN time complexity.

    Space Complexity: O(1) as we are not using any extra space.

    Note: Here we are distorting the given array. So, if we need to consider this change, the space complexity will be O(N).
    
    Reference: https://takeuforward.org/data-structure/two-sum-check-if-a-pair-with-given-sum-exists-in-array/

 */


package medium;

import java.util.Arrays;

public class Q1_optimal {
    
    static int[] twoSum(int[] arr, int target){

        // 2, 5, 6, 8, 11 
        //  left = 6 right = 8 
        // 12, 16, 13, 14 
        Arrays.sort(arr);
        int[] res = new int[2];
        int left = 0;
        int right = arr.length-1;
        int sum = 0;

        while(left < right){

            sum = arr[left] + arr[right];

            if(sum < target){
                left++;

            } else if(sum == target){
                res[0] = left;
                res[1] = right;
                break;

            } else{
                right--;
            }


        }

        if(res[0] == 0 && res[1] == 0){
            System.out.println("NO ");
            res[0] = -1;
            res[1] = -1;
            return res;
        }
        else{
            System.out.println("YES ");
            return res;
        }

    }

    public static void main(String[] args) {
        
        int[] arr = {2,6,5,8,11};
        int target = 14;

        int[] res = twoSum(arr, target);
        System.out.println(Arrays.toString(res));
            

    }

}
