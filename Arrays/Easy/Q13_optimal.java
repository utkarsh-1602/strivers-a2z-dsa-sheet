/*
    Name : Longest Subarray with given Sum K(Positives and Negatives)

    Problem Statement: Given an array and a sum k, we need to print the length of the longest subarray that sums to k.

    Input Format: N = 3, k = 1, array[] = {-1, 1, 1}
    Result: 3
    Explanation: The longest subarray with sum 1 is {-1, 1, 1}. And its length is 3.

    Approach :optmial

    Time Complexity: O(N)

    Space Complexity: O(N)

    Reference: https://takeuforward.org/arrays/longest-subarray-with-sum-k-postives-and-negatives/

 */

import java.util.HashMap;

public class Q13_optimal {

    static int longestSubarraySum(int[] arr, int k){

        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for(int i = 0; i < n; i++){

            sum += arr[i];

            if(sum == k) {
                maxLen = Math.max(maxLen, i+1);
            }

            int rem = sum - k;

            if(map.containsKey(rem)){
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }

        return maxLen;

    }

    public static void main(String[] args) {

        int[] arr = {-1,1,1};
        int k = 1;
        int ans = longestSubarraySum(arr, k);
        System.out.println(ans);

    }   
}
