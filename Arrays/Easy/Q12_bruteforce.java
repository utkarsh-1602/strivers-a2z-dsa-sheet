/*
    Name : Longest Subarray with given Sum K(Positives)

    Problem Statement: Given an array and a sum k, we need to print the length of the longest subarray that sums to k.

    Input Format: N = 5, k = 10, array[] = {2,3,5,1,9}
    Result: 3
    Explanation: The longest subarray with sum 10 is {2, 3, 5}. And its length is 3.

    Approach : bruteforce
    As we know we need to find the longest subarray, we can create two loops and check every possibility for each element to be a subarray, and will save the sum of each subarray, and will check whether the sum we stored is maxSum or not using Math.max

    Time Complexity: O(N)

    Space Complexity: O(1)

    Reference: https://takeuforward.org/data-structure/longest-subarray-with-given-sum-k/

 */ 

public class Q12_bruteforce {

    static int longestSubarraySum(int[] arr, int k){

        int n = arr.length;
        int maxLength = 0;


        for(int i=0; i<n; i++){

            long sum = 0;

            for(int j=0; j<n; j++){
                sum += arr[j];
                if(sum == k){
                    maxLength = Math.max(maxLength, j-i+1);   
                }
            }
        }
        return maxLength; 
    }

    public static void main(String[] args) {
        
        int[] arr = {2,3,5,1,9};
        int k = 10;
        int ans = longestSubarraySum(arr, k);
        System.out.println(ans);

    }
}
