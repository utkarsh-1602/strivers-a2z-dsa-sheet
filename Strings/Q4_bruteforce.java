/*
    Name :  Longest Common Prefix

    Problem Statement: Write a function to find the longest common prefix string amongst an array of strings.If there is no common prefix, return an empty string """

    Input: strs = ["flower","flow","flight"]
    Output: "fl"
    Example 2:

    Input: strs = ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.

    Approach : bruteforce
    
    Time Complexity: O(N^2)
    Space Complexity: O(1)

    Reference: https://leetcode.com/problems/longest-common-prefix/description/

 */

package Strings;

public class Q4_bruteforce {
    
    static String longestCommonPrefix(String[] s){

        int n = s.length;
        if (n == 0) return ""; // Edge case: if the array is empty, return empty string

        int min = Integer.MAX_VALUE;

        // firstly we are getting the length of words with minumum length 
        for(int i=0; i<n; i++){

            int currLen = s[i].length();
            min = Math.min(min, currLen);

        }

        // Now what we will do is, we will get the first word and its first character, and we will try to match the first character with other array elements first character, and if it matches we will increment i, and then we will try to match first word and its second character with other array elements, and if matches we will increment i, if not we will assign the value of i to min, as it is the longest common prefix and then we will break out of loop, and then we will print a substring with value range from 0 to min.

        int i=0;

        while (i<min) {
            char first = s[0].charAt(i);
            for(int j=1; j<n; j++) {

                if(first != s[j].charAt(i)){
                    min = i;
                    break;
                }

            }
            if(min == i) break;
            i++;

        }

        return s[0].substring(0, min);

    }

    public static void main(String[] args) {
        
        String[] s =  {"fleower","fleow","fleight"};
        System.out.println(longestCommonPrefix(s));
    }

}
