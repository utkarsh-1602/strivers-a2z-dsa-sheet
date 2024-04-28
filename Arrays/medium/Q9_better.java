package medium;
/*
    Name : Longest Consecutive Sequence in an Array
s 
    Problem Statement: You are given an array of ‘N’ integers. You need to find the length of the longest sequence which contains the consecutive elements.

    Example 1:
    Input: [100, 200, 1, 3, 2, 4]
    Output: 4

    Explanation:
    The longest consecutive subsequence is 1, 2, 3, and 4.

    Input:[3, 8, 5, 7, 6]
    Output: 4
    Explanation: The longest consecutive subsequence is 5, 6, 7, and 8.

    Approach : better 

    Time Complexity: O(N*LogN) + O(N) = O(N*LogN)
    Space Complexity: O(1)

    Reference: https://takeuforward.org/data-structure/longest-consecutive-sequence-in-an-array/
 */

import java.util.Arrays;

public class Q9_better {

    public static int longestConsecutiveSequence(int []arr) {

        int n = arr.length; 

        if(n == 0) return 0;

        int lastSmaller = Integer.MIN_VALUE;
        int count = 0;
        int longest = 1; 

        Arrays.sort(arr); // using Quicksort algorithm

        // find the longest sequence
        for(int i = 0; i < n; i++){
            if(arr[i]-1 == lastSmaller){
                count += 1;
                lastSmaller = arr[i];
            }
            else if(arr[i] != lastSmaller){
                count = 1;
                lastSmaller = arr[i];
            }
            longest = Math.max(longest, count);

        }


        return longest; 
    }

    public static void main(String[] args) {

        int[] arr = {3, 8, 5, 7, 6};
        int ans = longestConsecutiveSequence(arr);
        System.out.println(ans);
    }
}