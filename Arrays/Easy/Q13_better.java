/*
    Name : Longest Subarray with given Sum K(Positives and Negatives)

    Problem Statement: Given an array and a sum k, we need to print the length of the longest subarray that sums to k.

    Input Format: N = 3, k = 1, array[] = {-1, 1, 1}
    Result: 3
    Explanation: The longest subarray with sum 1 is {-1, 1, 1}. And its length is 3.

    Approach :bruteforce

    Time Complexity: O(N^2)

    Space Complexity: O(1)

    Reference: https://takeuforward.org/arrays/longest-subarray-with-sum-k-postives-and-negatives/

 */

public class Q13_better {

    static int longestSubarraySum(int[] arr, int k){

        int n = arr.length;
        int len = 0;

        for(int i=0; i<n; i++){

            int sum = 0;    
            for(int j=i; j<n; j++){

                sum += arr[j];
                if(sum == k){
                    len = Math.max(len, j-i+1);
                }

            }

        }

        return len;


    }

    public static void main(String[] args) {

        int[] arr = {-1,1,1};
        int k = 1;
        int ans = longestSubarraySum(arr, k);
        System.out.println(ans);
    }
}
