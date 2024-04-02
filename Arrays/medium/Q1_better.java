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

    Approach : Better 

    Time Complexity: O(N)

    Space Complexity:O(N)

    Reference: https://takeuforward.org/data-structure/two-sum-check-if-a-pair-with-given-sum-exists-in-array/

 */


package medium;

import java.util.Arrays;
import java.util.HashMap;

public class Q1_better {
    
    static int[] twoSum(int[] arr, int target){

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        int difference = 0;

            if(arr.length == 0 || arr.length == 1){
                return new int[] {-1,-1}; 
            }

        for(int i = 0; i < arr.length; i++){

            difference = target - arr[i]; // 8 6 
            map.put(arr[i], i); // (6,8)(8,6)

            if(map.containsKey(difference)){
                result[0] = map.get(difference);
                result[1] = i; 
            }
        }

        if(result[0] == 0 && result[1] == 0){
            System.out.println("NO ");
            result[0] = -1;
            result[1] = -1;
            return result;
        }
        else{
            System.out.println("YES ");
            return result;
        }
    }

    public static void main(String[] args) {
        
        int[] arr = {2,6,5,8,11};
        int target = 14;

        int[] result = twoSum(arr, target);
        System.out.println(Arrays.toString(result));

    }

}
