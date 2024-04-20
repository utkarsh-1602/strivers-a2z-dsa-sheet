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

    Time Complexity: 
    Space Complexity: 

    Reference: https://takeuforward.org/data-structure/longest-consecutive-sequence-in-an-array/
 */

public class Q9_bruteforce {

    static int longestConsecutiveSequence(int[] arr){

        if(arr.length == 0) return 0;
        if(arr.length == 1) return arr[0];

        int count = 0;

        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                count++;
            }
        }

    }

    public static void main(String[] args) {

        int[] arr = {3, 8, 5, 7, 6};
        int ans = longestConsecutiveSequence(arr);
        System.out.println(ans);
    }
}