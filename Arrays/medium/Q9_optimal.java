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

    Approach : optimal

    Time Complexity: O(N) + O(2*N) ~ O(3*N), where N = size of the array.
    Reason: O(N) for putting all the elements into the set data structure. After that for every starting element, we are finding the consecutive elements. Though we are using nested loops, the set will be traversed at most twice in the worst case. So, the time complexity is O(2*N) instead of O(N2).

    Space Complexity: O(N), as we use hashset to store elements 

    Reference: https://takeuforward.org/data-structure/longest-consecutive-sequence-in-an-array/
 */

import java.util.HashSet;

public class Q9_optimal {

    public static int longestConsecutiveSequence(int []arr) {

        int n = arr.length; 
        if(n == 0) return 0;

        int longest = 1;
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i=0; i<n; i++) {
            set.add(arr[i]);
        }

        for(int i : set){

            if(!set.contains(i-1)){

                int count = 1;
                int x = i; 
                
                while(set.contains(x + 1)){
                    x = x + 1;
                    count = count + 1;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest; 
    }

    public static void main(String[] args) {

        int[] arr = {3, 8, 5, 7, 6};
        int ans = longestConsecutiveSequence(arr);
        System.out.println(ans);
    }
}