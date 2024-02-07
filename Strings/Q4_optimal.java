/*
    Name :  Longest Common Prefix

    Problem Statement: Write a function to find the longest common prefix string amongst an array of strings.If there is no common prefix, return an empty string """

    Input: strs = ["flower","flow","flight"]
    Output: "fl"
    Example 2:

    Input: strs = ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.

    Approach : optmial
    
    Time Complexity: O(NLogN)
    Sorting the array of strings takes O(n * log n) time
    Finding the longest common prefix involves iterating through the characters of the first and last strings in the sorted array. This takes O(m) time in the worst case. Therefore, the overall time complexity is dominated by the sorting step, resulting in O(n * log n) + O(m) = O(n * log n).

    Space Complexity: O(m), where m is the length of longest common prefix

    Reference: https://leetcode.com/problems/longest-common-prefix/description/

 */

 package Strings;

import java.util.Arrays;

public class Q4_optimal {
     
     static String longestCommonPrefix(String[] s){
        
        StringBuilder sb = new StringBuilder();
        Arrays.sort(s);
        
        String first = s[0];
        String last = s[s.length - 1];
        int min = Math.min(first.length(), last.length());

        for(int i = 0; i < min; i++){
            if(first.charAt(i) != last.charAt(i)){
                return sb.toString();
            }
            sb.append(first.charAt(i));
        }

        return sb.toString();
     }
 
     public static void main(String[] args) {
         
         String[] s =  {"fleower","fleow","fleight"};
         System.out.println(longestCommonPrefix(s));
     }
 
 }
 