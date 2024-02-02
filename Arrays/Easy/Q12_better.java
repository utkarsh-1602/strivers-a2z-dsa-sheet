/*
    Name : Longest Subarray with given Sum K(Positives)

    Problem Statement: Given an array and a sum k, we need to print the length of the longest subarray that sums to k.

    Input Format: N = 5, k = 10, array[] = {2,3,5,1,9}
    Result: 3
    Explanation: The longest subarray with sum 10 is {2, 3, 5}. And its length is 3.

    Approach : better (using hashing)

    Time Complexity: O(N*logN)

    Space Complexity: O(N)

    Reference: https://takeuforward.org/data-structure/longest-subarray-with-given-sum-k/

 */

import java.util.HashMap;

public class Q12_better {


    static int longestSubarraySum(int[] arr, int k){

        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        // map.put(key, value)

        int maxLen = 0;
        int sum = 0;

        
        for(int i=0; i<n; i++){

            //calculate the prefix sum till index i
            sum += arr[i];
            
            // if sum is k, update the maxLen 
            if(sum == k){
                maxLen = Math.max(maxLen, i+1);
            }

            // calculate the sum of remaining part i.e. x-k
            long rem = sum - k;

            //Calculate the length and update maxLen
            if(map.containsKey(rem)){
                int len = map.get(sum);
                maxLen = Math.max(maxLen, len);
            }

            //Finally, update the map checking the conditions
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }

        }

        return maxLen;

    } 

    public static void main(String[] args) {
        
        int[] arr = {2,3,5,1,9};
        int k = 10;
        int ans = longestSubarraySum(arr, k);
        System.out.println(ans);

    }    
}
