/*
    Name : Longest Subarray with given Sum K(Positives)

    Problem Statement: Given an array and a sum k, we need to print the length of the longest subarray that sums to k.

    Input Format: N = 5, k = 10, array[] = {2,3,5,1,9}
    Result: 3
    Explanation: The longest subarray with sum 10 is {2, 3, 5}. And its length is 3.

    Approach : optimal

    Time Complexity: O(N), The overall time complexity is still O(n) because the inner while loop doesn't execute for every element in the array during each iteration of the outer loop. It is limited by the fact that the left pointer only moves forward. In big O notation, we focus on the dominant factor, and since the overall complexity is mainly determined by the outer loop, the complexity is O(n).

    Space Complexity: O(1)

    Reference: https://takeuforward.org/data-structure/longest-subarray-with-given-sum-k/

 */

public class Q12_optimal {


    static int longestSubarraySum(int[] arr, long k){

        int n = arr.length; 
        int sum = arr[0];
        int maxLen = 0;
        int left = 0, right = 0;

        while(right < n){

            while(left <= right && sum > k){
                sum -= arr[left];
                left++;
            }

            if(sum == k) maxLen = Math.max(maxLen, right - left + 1);

            right++;
            
            if(right < n) sum += arr[right];
        }

        return maxLen; 
    }

    public static void main(String[] args) {
        
        int[] arr = {2,3,5,1,9};
        long k = 10;

        int ans = longestSubarraySum(arr, k);
        System.out.println(ans);
    }    
}
