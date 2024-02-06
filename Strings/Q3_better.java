/*
    Name : Largest Odd Number in String

    Problem Statement: You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.

    Input: num = "52"
    Output: "5"
    Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.
    Example 2:

    Input: num = "4206"
    Output: ""
    Explanation: There are no odd numbers in "4206".
    Example 3:

    Input: num = "35427"
    Output: "35427"
    Explanation: "35427" is already an odd number.

    Approach : better, time complexity and space complexity will remain same as bruteforce, we are just optimizing it for effciency. 
    
    Time Complexity: O(N)
    Space Complexity: O(N)

    Reference: https://leetcode.com/problems/largest-odd-number-in-string/description/

 */


 package Strings;

 public class Q3_better {
 
     static String largestOddNumberInString(String s){
 
         int n = s.length();
         String maxOddString = "";
 
         for(int i=0; i<n; i++){
 
             if(s.charAt(i) != '0'){
                if(s.charAt(i) % 2 != 0){ // Check if the current digit is odd
                    maxOddString = s.substring(0, i + 1);
                }
             }
             
         }
 
         return maxOddString.isEmpty() ? "" : maxOddString;
     }
 
     public static void main(String[] args) {
         
         String s = "35427";
         System.out.println(largestOddNumberInString(s));
 
     }
 }
 