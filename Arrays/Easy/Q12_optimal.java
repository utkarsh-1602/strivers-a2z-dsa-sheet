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

        int sum = arr[0];
        int start = 0;
        int end = 0;
        int max = 0;

        while(end < arr.length){
            
            while( start <= end && sum > k){
                sum = sum - arr[start];
                start++; 
            }

            if(sum == k){
                max = Math.max(max, end-start+1);
            }

            end++; 
       
            if(end < arr.length){
                sum += arr[end];
            }
        }

        return max;

    }

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,1,1,1,1,3,3};
        long k = 6;

        int ans = longestSubarraySum(arr, k);
        System.out.println(ans);
    }    
}
