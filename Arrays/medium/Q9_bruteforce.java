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

    Approach : bruteforce 

    Time Complexity: O(N^2)
    Space Complexity: O(1)

    Reference: https://takeuforward.org/data-structure/longest-consecutive-sequence-in-an-array/
 */

public class Q9_bruteforce {

    public static boolean linearSearch(int []a, int num) {
        int n = a.length; //size of array
        for (int i = 0; i < n; i++) {
            if (a[i] == num)
                return true;
        }
        return false;
    }
    public static int longestConsecutiveSequence(int []a) {

        int n = a.length; 
        int longest = 1;

        //pick a element and search for its
        //consecutive numbers:

        for (int i = 0; i < n; i++) {
            int x = a[i];
            int cnt = 1;
            //search for consecutive numbers
            //using linear search:
            while (linearSearch(a, x + 1) == true) {
                x += 1;
                cnt += 1;
            }

            longest = Math.max(longest, cnt);
        }
        return longest;
    }

    public static void main(String[] args) {

        int[] arr = {3, 8, 5, 7, 6};
        int ans = longestConsecutiveSequence(arr);
        System.out.println(ans);
    }
}